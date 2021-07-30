/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.springboot.springdata.JPA.hospital.model.db.PatientDetails;

/**
 * @author Lenovo
 *
 */
public interface PatientRepo extends JpaRepository<PatientDetails, Integer> {

	public PatientDetails getPatientDetailsByFirstName(String firstName);

}
