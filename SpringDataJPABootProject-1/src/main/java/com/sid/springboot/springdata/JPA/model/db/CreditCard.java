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
@DiscriminatorValue(value = "CC")
public class CreditCard extends Payment {

	private String creditCardNumber;

	/**
	 * @param id
	 * @param amount
	 */
	public CreditCard() {
		super();
	}

	/**
	 * @param id
	 * @param amount
	 * @param creditCardNumber
	 */
	public CreditCard(double amount, String creditCardNumber) {
		super(amount);
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", getId()=" + getId() + ", getAmount()=" + getAmount() + "]";
	}

}
