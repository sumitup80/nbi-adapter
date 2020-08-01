package com.btireland.talos.spqr.nbiadapter.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement(name="AVAIL_SERVICE")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String SERVICE_CLASS;
	@XmlElement
	private String SERVICE_RESULT;
	@XmlElement
	private String SERVICE_STATUS;
	@XmlElement
	private String LINE_ID;
	@XmlElement
	ArrayList<QualifiedService> QUALIFIED_SERVICE = new ArrayList<QualifiedService>();
	@XmlElement(name="SERVICE_ATTRIBUTES")
    ServiceAttributes SERVICE_ATTRIBUTESObject;
	@XmlElement(name="INTERNAL_AVAL")
    InternalAvail INTERNAL_AVAILObject = new InternalAvail();
	@XmlElement(name="SURVEY_DETAILS")
	private SurveyDetails surveyDetails;
	// Getter Methods

	public String getSERVICE_CLASS() {
		return SERVICE_CLASS;
	}

	public String getSERVICE_RESULT() {
		return SERVICE_RESULT;
	}

	public String getSERVICE_STATUS() {
		return SERVICE_STATUS;
	}

	public String getLINE_ID() {return LINE_ID; }

	public void setLINE_ID(String LINE_ID) {
		this.LINE_ID = LINE_ID;
	}

	public SurveyDetails getSurveyDetails() {
		return surveyDetails;
	}

	public void setSurveyDetails(SurveyDetails surveyDetails) {
		this.surveyDetails = surveyDetails;
	}

	public com.btireland.talos.spqr.nbiadapter.domain.ServiceAttributes getSERVICE_ATTRIBUTES() {
		return SERVICE_ATTRIBUTESObject;
	}

	public com.btireland.talos.spqr.nbiadapter.domain.InternalAvail getINTERNAL_AVAIL() {
		return INTERNAL_AVAILObject;
	}

	// Setter Methods

	public void setSERVICE_CLASS(String SERVICE_CLASS) {
		this.SERVICE_CLASS = SERVICE_CLASS;
	}

	public void setSERVICE_RESULT(String SERVICE_RESULT) {
		this.SERVICE_RESULT = SERVICE_RESULT;
	}

	public void setSERVICE_STATUS(String SERVICE_STATUS) {
		this.SERVICE_STATUS = SERVICE_STATUS;
	}

	public void setSERVICE_ATTRIBUTES(com.btireland.talos.spqr.nbiadapter.domain.ServiceAttributes SERVICE_ATTRIBUTESObject) {
		this.SERVICE_ATTRIBUTESObject = SERVICE_ATTRIBUTESObject;
	}

	public void setINTERNAL_AVAIL(com.btireland.talos.spqr.nbiadapter.domain.InternalAvail INTERNAL_AVAILObject) {
		this.INTERNAL_AVAILObject = INTERNAL_AVAILObject;
	}
}
