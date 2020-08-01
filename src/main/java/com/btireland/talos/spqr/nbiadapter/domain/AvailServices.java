package com.btireland.talos.spqr.nbiadapter.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement(name="AVAIL_SERVICES")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailServices implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	ArrayList<com.btireland.talos.spqr.nbiadapter.domain.AvailService> AVAIL_SERVICE = new ArrayList<com.btireland.talos.spqr.nbiadapter.domain.AvailService>();

	public ArrayList<com.btireland.talos.spqr.nbiadapter.domain.AvailService> getAVAIL_SERVICE() {
		return AVAIL_SERVICE;
	}

	public void setAVAIL_SERVICE(ArrayList<com.btireland.talos.spqr.nbiadapter.domain.AvailService> aVAIL_SERVICE) {
		AVAIL_SERVICE = aVAIL_SERVICE;
	}
}