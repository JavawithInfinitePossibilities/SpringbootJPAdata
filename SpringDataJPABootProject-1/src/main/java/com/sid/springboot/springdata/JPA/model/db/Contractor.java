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
public class Contractor extends Person {

	private String employeeNumber;
	private String managerNumber;

	/**
	 * 
	 */
	public Contractor() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param managerNumber
	 */
	public Contractor(String firstName, String lastName, String employeeNumber, String managerNumber) {
		super(firstName, lastName);
		this.employeeNumber = employeeNumber;
		this.managerNumber = managerNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}

	@Override
	public String toString() {
		return "Contractor [employeeNumber=" + employeeNumber + ", managerNumber=" + managerNumber + "]";
	}

}
