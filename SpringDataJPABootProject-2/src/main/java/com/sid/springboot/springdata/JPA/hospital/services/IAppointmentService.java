/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services;

import com.sid.springboot.springdata.JPA.hospital.model.db.Appointment;

/**
 * @author Lenovo
 *
 */
public interface IAppointmentService {

	public Appointment save(Appointment doctorDetails);

	public Appointment get(int appointmentId);

	public Appointment update(Appointment doctorDetails);
}
