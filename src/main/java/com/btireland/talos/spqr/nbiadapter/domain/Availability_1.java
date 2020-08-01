package com.btireland.talos.spqr.nbiadapter.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="AVAILABILITY")
@XmlAccessorType(XmlAccessType.FIELD)

public class Availability_1 implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="SERVICE_IDENTIFIER")
    com.btireland.talos.spqr.nbiadapter.domain.ServiceIdentifier SERVICE_IDENTIFIERObject = new com.btireland.talos.spqr.nbiadapter.domain.ServiceIdentifier();
	 
	 @XmlElement
	 private String AVAILABILITY_RESULT;
	 
	 @XmlElement(name="AVAIL_SERVICES")
	 AvailServices AVAIL_SERVICESObject = new AvailServices();


	 // Getter Methods 

	 public com.btireland.talos.spqr.nbiadapter.domain.ServiceIdentifier getSERVICE_IDENTIFIER() {
	  return SERVICE_IDENTIFIERObject;
	 }

	 public String getAVAILABILITY_RESULT() {
	  return AVAILABILITY_RESULT;
	 }

	 public AvailServices getAVAIL_SERVICES() {
	  return AVAIL_SERVICESObject;
	 }

	 // Setter Methods 

	 public void setSERVICE_IDENTIFIER(com.btireland.talos.spqr.nbiadapter.domain.ServiceIdentifier SERVICE_IDENTIFIERObject) {
	  this.SERVICE_IDENTIFIERObject = SERVICE_IDENTIFIERObject;
	 }

	 public void setAVAILABILITY_RESULT(String AVAILABILITY_RESULT) {
	  this.AVAILABILITY_RESULT = AVAILABILITY_RESULT;
	 }

	 public void setAVAIL_SERVICES(AvailServices AVAIL_SERVICESObject) {
	  this.AVAIL_SERVICESObject = AVAIL_SERVICESObject;
	 }
	}
