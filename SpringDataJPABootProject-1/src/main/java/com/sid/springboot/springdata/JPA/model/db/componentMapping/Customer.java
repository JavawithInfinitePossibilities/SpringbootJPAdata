/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.componentMapping;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * @author Lenovo
 *
 */
@Entity
public class Customer {

	@EmbeddedId
	private CustomerId customerId;
	private String name;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerId
	 * @param name
	 */
	public Customer(CustomerId customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}

	/**
	 * @return the customerId
	 */
	public CustomerId getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(CustomerId customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
