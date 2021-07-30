/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services;

import java.util.List;

import com.sid.springboot.springdata.JPA.hospital.model.db.PatientDetails;

/**
 * @author Lenovo
 *
 */
public interface IPatientService {

	public PatientDetails save(PatientDetails patientDetails);

	public PatientDetails get(int patientId);

	public PatientDetails getPatientByName(String firstName);

	public PatientDetails update(PatientDetails patientDetails);

	public List<PatientDetails> getAllPatient();
}
