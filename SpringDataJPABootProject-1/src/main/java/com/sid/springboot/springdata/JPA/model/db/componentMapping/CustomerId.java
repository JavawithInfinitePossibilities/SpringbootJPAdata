/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.componentMapping;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author Lenovo
 *
 */
@Embeddable
public class CustomerId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;

	/**
	 * 
	 */
	public CustomerId() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param email
	 */
	public CustomerId(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
