/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db;

import javax.persistence.Entity;

/**
 * @author Lenovo
 *
 */
@Entity
public class Manager extends Person {

	private String employeeNumber;

	/**
	 * 
	 */
	public Manager() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	public Manager(String firstName, String lastName, String employeeNumber) {
		super(firstName, lastName);
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "Manager [employeeNumber=" + employeeNumber + ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}

}
