package com.btireland.talos.spqr.nbiadapter.domain;

import java.io.Serializable;

public class Siro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String PREMISES_ID;

	// Getter Methods

	public String getPREMISES_ID() {
		return PREMISES_ID;
	}

	// Setter Methods

	public void setPREMISES_ID(String PREMISES_ID) {
		this.PREMISES_ID = PREMISES_ID;
	}
}
