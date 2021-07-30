/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.model.db;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Lenovo
 *
 */
@Entity
public class ClinicalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String component_name;
	private String component_value;
	@Temporal(TemporalType.DATE)
	private Date measuredDateTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patientId", referencedColumnName = "id")
	private PatientDetails patientDetails;

	/**
	 * 
	 */
	public ClinicalData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param component_name
	 * @param component_value
	 * @param measuredDateTime
	 */
	public ClinicalData(String component_name, String component_value, Date measuredDateTime) {
		super();
		this.component_name = component_name;
		this.component_value = component_value;
		this.measuredDateTime = measuredDateTime;
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
	 * @return the component_name
	 */
	public String getComponent_name() {
		return component_name;
	}

	/**
	 * @param component_name the component_name to set
	 */
	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}

	/**
	 * @return the component_value
	 */
	public String getComponent_value() {
		return component_value;
	}

	/**
	 * @param component_value the component_value to set
	 */
	public void setComponent_value(String component_value) {
		this.component_value = component_value;
	}

	/**
	 * @return the measuredDateTime
	 */
	public Date getMeasuredDateTime() {
		return measuredDateTime;
	}

	/**
	 * @param measuredDateTime the measuredDateTime to set
	 */
	public void setMeasuredDateTime(Date measuredDateTime) {
		this.measuredDateTime = measuredDateTime;
	}

	/**
	 * @return the patientDetails
	 */
	public PatientDetails getPatientDetails() {
		return patientDetails;
	}

	/**
	 * @param patientDetails the patientDetails to set
	 */
	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}

}
