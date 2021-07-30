/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.model.dto;

import javax.persistence.Embeddable;

/**
 * @author Lenovo
 *
 */
@Embeddable
public class Insurance {
	private String providerName;
	private double copay;

	/**
	 * 
	 */
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param providerName
	 * @param copay
	 */
	public Insurance(String providerName, double copay) {
		super();
		this.providerName = providerName;
		this.copay = copay;
	}

	/**
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	/**
	 * @return the copay
	 */
	public double getCopay() {
		return copay;
	}

	/**
	 * @param copay the copay to set
	 */
	public void setCopay(double copay) {
		this.copay = copay;
	}

}
