/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.springboot.springdata.JPA.hospital.model.db.PatientDetails;
import com.sid.springboot.springdata.JPA.hospital.services.IPatientService;

/**
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	private IPatientService iPatientService;

	@RequestMapping(value = "/getAllPatient", method = RequestMethod.GET)
	private List<PatientDetails> getAllPatient() {
		return iPatientService.getAllPatient();
	}

	@RequestMapping(value = "/getPatientById/{patientId}", method = RequestMethod.GET)
	public PatientDetails getPatient(@PathVariable("patientId") int patientId) {
		return iPatientService.get(patientId);
	}

	@RequestMapping(value = "/savePatient", method = RequestMethod.POST)
	public PatientDetails savePatient(@RequestBody PatientDetails patientDetails) {
		return iPatientService.save(patientDetails);
	}
}
