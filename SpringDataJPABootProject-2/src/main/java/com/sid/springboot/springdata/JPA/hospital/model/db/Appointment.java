/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.model.db;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
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
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date appointmentTime;
	private boolean strat;
	private boolean end;
	private String reason;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patientId", referencedColumnName = "id")
	private PatientDetails patientDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctorId", referencedColumnName = "id")
	private DoctorDetails doctorDetails;

	/**
	 * 
	 */
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param appointmentTime
	 * @param strat
	 * @param end
	 * @param reason
	 */
	public Appointment(Date appointmentTime, boolean strat, boolean end, String reason) {
		super();
		this.appointmentTime = appointmentTime;
		this.strat = strat;
		this.end = end;
		this.reason = reason;
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
	 * @return the appointmentTime
	 */
	public Date getAppointmentTime() {
		return appointmentTime;
	}

	/**
	 * @param appointmentTime the appointmentTime to set
	 */
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	/**
	 * @return the strat
	 */
	public boolean isStrat() {
		return strat;
	}

	/**
	 * @param strat the strat to set
	 */
	public void setStrat(boolean strat) {
		this.strat = strat;
	}

	/**
	 * @return the end
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(boolean end) {
		this.end = end;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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

	/**
	 * @return the doctorDetails
	 */

	public DoctorDetails getDoctorDetails() {
		return doctorDetails;
	}

	/**
	 * @param doctorDetails the doctorDetails to set
	 */
	public void setDoctorDetails(DoctorDetails doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

}
