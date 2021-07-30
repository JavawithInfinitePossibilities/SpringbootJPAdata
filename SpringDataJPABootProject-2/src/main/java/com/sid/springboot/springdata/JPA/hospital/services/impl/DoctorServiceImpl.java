/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.springboot.springdata.JPA.hospital.model.db.DoctorDetails;
import com.sid.springboot.springdata.JPA.hospital.repositories.DoctorRepo;
import com.sid.springboot.springdata.JPA.hospital.services.IDoctorServices;

/**
 * @author Lenovo
 *
 */
@Service
@Transactional
public class DoctorServiceImpl implements IDoctorServices {

	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public DoctorDetails save(DoctorDetails doctorDetails) {
		return doctorRepo.save(doctorDetails);
	}

	@Override
	public DoctorDetails get(int doctorId) {
		return doctorRepo.findById(doctorId).get();
	}

	@Override
	public DoctorDetails getDoctorByName(String firstName) {
		return doctorRepo.getDoctorDetailsByFirstName(firstName);
	}

	@Override
	public DoctorDetails update(DoctorDetails doctorDetails) {
		return doctorRepo.save(doctorDetails);
	}

}
