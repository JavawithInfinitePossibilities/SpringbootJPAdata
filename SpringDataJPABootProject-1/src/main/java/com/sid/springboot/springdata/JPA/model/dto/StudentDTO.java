/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.dto;

/**
 * @author Lenovo
 *
 */

public class StudentDTO {
	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	public StudentDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentDTO [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
