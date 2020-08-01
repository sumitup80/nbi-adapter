package com.btireland.talos.spqr.nbiadapter.service;

import com.btireland.talos.spqr.nbiadapter.domain.AvailServices;
import com.btireland.talos.spqr.nbiadapter.domain.NBIResponse;
import com.btireland.talos.spqr.nbiadapter.domain.Notification;
import com.btireland.talos.spqr.nbiadapter.domain.SPQRRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SPQRService {

    @Autowired
    RestTemplate restTemplate;


    public NBIResponse getNBIAvailableProductsByERCode(String eirCode){
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        ResponseEntity<NBIResponse> response =
                restTemplate.getForEntity("http://localhost:8085/eligibility", NBIResponse.class);
        NBIResponse nbiResponse = response.getBody();
        //logger.info("response received");

        return nbiResponse;
    }

    public Notification getNBIAvailableProducts(SPQRRequest spqrRequest) {
        Notification notification = new Notification();
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resource = classLoader.getResourceAsStream("nbi_available_services.xml");
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Notification.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(getClass().getResource("/xsd/notification_2.xsd"));
            jaxbUnmarshaller.setSchema(schema);
            notification = (Notification) jaxbUnmarshaller.unmarshal(resource);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return notification;
    }


}
