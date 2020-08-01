package com.btireland.talos.spqr.nbiadapter.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="ATTRIBUTE")
@XmlAccessorType(XmlAccessType.FIELD)
public class Attribute implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String NAME;
	@XmlElement
	private String VALUE;

	// Getter Methods

	public String getNAME() {
		return NAME;
	}

	public String getVALUE() {
		return VALUE;
	}

	// Setter Methods

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public void setVALUE(String VALUE) {
		this.VALUE = VALUE;
	}
}
