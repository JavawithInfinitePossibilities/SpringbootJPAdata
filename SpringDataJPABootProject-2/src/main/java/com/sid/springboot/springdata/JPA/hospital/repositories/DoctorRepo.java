/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.springboot.springdata.JPA.hospital.model.db.DoctorDetails;

/**
 * @author Lenovo
 *
 */
public interface DoctorRepo extends JpaRepository<DoctorDetails, Integer> {

	public DoctorDetails getDoctorDetailsByFirstName(String firstName);

}
