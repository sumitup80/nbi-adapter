package com.btireland.talos.spqr.nbiadapter.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="INTERNAL_AVAIL")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class InternalAvail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name="EIRCOM")
	EirCom EIRCOMObject = new EirCom();

	@XmlElement(name="SIRO")
    com.btireland.talos.spqr.nbiadapter.domain.Siro SIROObject = new com.btireland.talos.spqr.nbiadapter.domain.Siro();


	 // Getter Methods 

	 public com.btireland.talos.spqr.nbiadapter.domain.Siro getSIRO() {
	  return SIROObject;
	 }

	 // Setter Methods 

	 public void setSIRO(com.btireland.talos.spqr.nbiadapter.domain.Siro SIROObject) {
	  this.SIROObject = SIROObject;
	 }
	 // Getter Methods 

	 public EirCom getEIRCOM() {
	  return EIRCOMObject;
	 }

	 // Setter Methods 

	 public void setEIRCOM(EirCom EIRCOMObject) {
	  this.EIRCOMObject = EIRCOMObject;
	 }
	}