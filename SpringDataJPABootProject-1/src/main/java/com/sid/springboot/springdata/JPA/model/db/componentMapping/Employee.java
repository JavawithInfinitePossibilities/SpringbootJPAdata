/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.componentMapping;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Lenovo
 *
 */
@Entity(name = "employee")
@Table
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_Name", valueColumnName = "gen_Val", allocationSize = 100)
	 *@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	private String firstName;
	private String lastName;

	@Embedded
	private Address address;

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
