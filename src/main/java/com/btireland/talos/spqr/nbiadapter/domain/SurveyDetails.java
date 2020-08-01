package com.btireland.talos.spqr.nbiadapter.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="SURVEY_DETAILS")
@XmlAccessorType(XmlAccessType.FIELD)
public class SurveyDetails implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name="SERVICE_ATTRIBUTES")
    private String SurveyRequired;

    public String getSurveyRequired() {
        return SurveyRequired;
    }

    public void setSurveyRequired(String surveyRequired) {
        SurveyRequired = surveyRequired;
    }


}
