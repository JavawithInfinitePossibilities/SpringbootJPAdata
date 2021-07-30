/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.springboot.springdata.JPA.hospital.model.db.Appointment;
import com.sid.springboot.springdata.JPA.hospital.repositories.AppointmentRepo;
import com.sid.springboot.springdata.JPA.hospital.services.IAppointmentService;

/**
 * @author Lenovo
 *
 */
@Service
@Transactional
public class AppointmentServicesImpl implements IAppointmentService {

	@Autowired
	private AppointmentRepo appointmentRepo;

	@Override
	public Appointment save(Appointment doctorDetails) {
		return appointmentRepo.save(doctorDetails);
	}

	@Override
	public Appointment get(int appointmentId) {
		return appointmentRepo.findById(appointmentId).get();
	}

	@Override
	public Appointment update(Appointment doctorDetails) {
		return appointmentRepo.save(doctorDetails);
	}

}
