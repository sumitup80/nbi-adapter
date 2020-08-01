package com.btireland.talos.spqr.nbiadapter.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table (name = "supplier_registry")
@XmlRootElement (name = "supplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlElement
	private Integer supplierId;
	
	@XmlElement
	@Column(name = "supplier_code")
	private String supplierCode;

	@XmlElement
	@Column(name = "supplier_name")
	private String supplierName;
	
	@XmlElement
	@Column(name = "adapter_endpoint")
	private String adapterEndPoint;

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAdapterEndPoint() {
		return adapterEndPoint;
	}

	public void setAdapterEndPoint(String adapterEndPoint) {
		this.adapterEndPoint = adapterEndPoint;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierCode=" + supplierCode + ", supplierName="
				+ supplierName + ", adapterEndPoint=" + adapterEndPoint + "]";
	}

}
