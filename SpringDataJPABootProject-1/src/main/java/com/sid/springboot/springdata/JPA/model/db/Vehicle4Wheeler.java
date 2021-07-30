/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author Lenovo
 *
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Vehicle4Wheeler extends Vehicle {

	private String vehicleType;
	private String vehileBrand;

	/**
	 * @param vahicleNumber
	 * @param vahicleCategory
	 * @param vehicleType
	 * @param vehileBrand
	 */
	public Vehicle4Wheeler(String vahicleNumber, String vahicleCategory, String vehicleType, String vehileBrand) {
		super(vahicleNumber, vahicleCategory);
		this.vehicleType = vehicleType;
		this.vehileBrand = vehileBrand;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the vehileBrand
	 */
	public String getVehileBrand() {
		return vehileBrand;
	}

	/**
	 * @param vehileBrand the vehileBrand to set
	 */
	public void setVehileBrand(String vehileBrand) {
		this.vehileBrand = vehileBrand;
	}

	@Override
	public String toString() {
		return "Vehicle4Wheeler [vehicleType=" + vehicleType + ", vehileBrand=" + vehileBrand + ", getId()=" + getId() + ", getVahicleNumber()=" + getVahicleNumber()
				+ ", getVahicleCategory()=" + getVahicleCategory() + "]";
	}

}
