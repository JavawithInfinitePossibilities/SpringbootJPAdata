/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Lenovo
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String vahicleNumber;
	private String vahicleCategory;

	/**
	 * 
	 */
	public Vehicle() {
		super();
	}

	/**
	 * @param vahicleNumber
	 * @param vahicleCategory
	 */
	public Vehicle(String vahicleNumber, String vahicleCategory) {
		super();
		this.vahicleNumber = vahicleNumber;
		this.vahicleCategory = vahicleCategory;
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
	 * @return the vahicleNumber
	 */
	public String getVahicleNumber() {
		return vahicleNumber;
	}

	/**
	 * @param vahicleNumber the vahicleNumber to set
	 */
	public void setVahicleNumber(String vahicleNumber) {
		this.vahicleNumber = vahicleNumber;
	}

	/**
	 * @return the vahicleCategory
	 */
	public String getVahicleCategory() {
		return vahicleCategory;
	}

	/**
	 * @param vahicleCategory the vahicleCategory to set
	 */
	public void setVahicleCategory(String vahicleCategory) {
		this.vahicleCategory = vahicleCategory;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vahicleNumber=" + vahicleNumber + ", vahicleCategory=" + vahicleCategory + "]";
	}

}
