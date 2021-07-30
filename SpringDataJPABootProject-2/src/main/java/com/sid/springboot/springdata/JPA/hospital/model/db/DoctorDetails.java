/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.model.db;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author Lenovo
 *
 */
@Entity(name="doctors")
public class DoctorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String specility;

	@ManyToMany(mappedBy = "doctorDetails")
	private Set<PatientDetails> patientDetails;

	@OneToMany(mappedBy = "doctorDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Appointment> appointments;

	/**
	 * 
	 */
	public DoctorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param specility
	 */
	public DoctorDetails(String firstName, String lastName, String specility) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.specility = specility;
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
	 * @return the specility
	 */
	public String getSpecility() {
		return specility;
	}

	/**
	 * @param specility the specility to set
	 */
	public void setSpecility(String specility) {
		this.specility = specility;
	}

	/**
	 * @return the patientDetails
	 */

	public Set<PatientDetails> getPatientDetails() {
		return patientDetails;
	}

	/**
	 * @param patientDetails the patientDetails to set
	 */

	public void setPatientDetails(Set<PatientDetails> patientDetails) {
		this.patientDetails = patientDetails;
	}

	/**
	 * @return the appointments
	 */

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

}
