/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Lenovo
 *
 */
@Entity
@DiscriminatorValue(value = "CH")
public class Check extends Payment {

	private String checkNumber;

	/**
	 * 
	 */
	public Check() {
		super();
	}

	/**
	 * @param id
	 * @param amount
	 */
	public Check(int id, double amount) {
		super();
	}

	/**
	 * @param id
	 * @param amount
	 * @param checkNumber
	 */
	public Check(double amount, String checkNumber) {
		super(amount);
		this.checkNumber = checkNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
	public String toString() {
		return "Check [checkNumber=" + checkNumber + ", getId()=" + getId() + ", getAmount()=" + getAmount() + "]";
	}

}
