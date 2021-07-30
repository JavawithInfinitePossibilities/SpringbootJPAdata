/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services;

import com.sid.springboot.springdata.JPA.hospital.model.db.DoctorDetails;

/**
 * @author Lenovo
 *
 */
public interface IDoctorServices {

	public DoctorDetails save(DoctorDetails doctorDetails);

	public DoctorDetails get(int doctorId);

	public DoctorDetails getDoctorByName(String firstName);

	public DoctorDetails update(DoctorDetails doctorDetails);
}
