/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.model.db;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.sid.springboot.springdata.JPA.hospital.model.dto.Insurance;

/**
 * @author Lenovo
 *
 */
@Entity(name = "patients")
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	@Embedded
	private Insurance insurance;
	private int age;

	@ManyToMany
	@JoinTable(name = "doctor_patient", joinColumns = @JoinColumn(name = "patientId", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "doctorId", referencedColumnName = "id"))
	private Set<DoctorDetails> doctorDetails;

	@OneToMany(mappedBy = "patientDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Appointment> appointments;

	@OneToMany(mappedBy = "patientDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ClinicalData> clinicalDatas;

	/**
	 * 
	 */
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param insurance
	 */
	public PatientDetails(String firstName, String lastName, String phone, Insurance insurance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.insurance = insurance;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the insurance
	 */
	public Insurance getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	/**
	 * @return the doctorDetails
	 */

	public Set<DoctorDetails> getDoctorDetails() {
		return doctorDetails;
	}

	/**
	 * @param doctorDetails the doctorDetails to set
	 */

	public void setDoctorDetails(Set<DoctorDetails> doctorDetails) {
		this.doctorDetails = doctorDetails;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the clinicalDatas
	 */
	public List<ClinicalData> getClinicalDatas() {
		return clinicalDatas;
	}

	/**
	 * @param clinicalDatas the clinicalDatas to set
	 */
	public void setClinicalDatas(List<ClinicalData> clinicalDatas) {
		this.clinicalDatas = clinicalDatas;
	}

}
