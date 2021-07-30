/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.springboot.springdata.JPA.hospital.model.db.Appointment;

/**
 * @author Lenovo
 *
 */
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
