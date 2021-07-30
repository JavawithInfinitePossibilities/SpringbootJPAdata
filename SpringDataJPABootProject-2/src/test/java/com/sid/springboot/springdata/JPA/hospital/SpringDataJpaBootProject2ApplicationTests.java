package com.sid.springboot.springdata.JPA.hospital;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.springboot.springdata.JPA.hospital.model.db.Appointment;
import com.sid.springboot.springdata.JPA.hospital.model.db.DoctorDetails;
import com.sid.springboot.springdata.JPA.hospital.model.db.PatientDetails;
import com.sid.springboot.springdata.JPA.hospital.model.dto.Insurance;
import com.sid.springboot.springdata.JPA.hospital.services.IAppointmentService;
import com.sid.springboot.springdata.JPA.hospital.services.IDoctorServices;
import com.sid.springboot.springdata.JPA.hospital.services.IPatientService;

@SpringBootTest
class SpringDataJpaBootProject2ApplicationTests {

	Random random = new Random();

	@Autowired
	private IDoctorServices iDoctorServices;

	@Disabled
	@Test
	void testLoadDoctor() {
		int count = 2;
		while (count < 6) {
			count++;
			DoctorDetails doctorDetails = new DoctorDetails("Doctor-First-" + random.nextInt(10), "Doctor-last-"
					+ random.nextInt(10), "Doctor-Specility-" + random.nextInt(10));
			iDoctorServices.save(doctorDetails);
		}
	}

	@Autowired
	private IPatientService iPatientService;

	@Test
	public void testLoadPatient() {
		int count = 2;
		while (count < 11) {
			count++;
			Insurance insurance = new Insurance("Insurance-" + random.nextInt(10), 10d);
			PatientDetails patientDetails = new PatientDetails("Patient-First-" + random.nextInt(10), "Patient-Last-"
					+ random.nextInt(10), "1230645789", insurance);
			DoctorDetails doctorDetail = iDoctorServices.get(21);
			Set<DoctorDetails> doctorDetails = new HashSet<DoctorDetails>();
			doctorDetails.add(doctorDetail);
			patientDetails.setDoctorDetails(doctorDetails);
			iPatientService.save(patientDetails);
		}
	}

	@Autowired
	private IAppointmentService iAppointmentService;

	@Disabled
	@Test
	public void testLoadAppointment() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date(ts.getTime());
		Appointment appointment = new Appointment(date, true, true, "cardiac arrest");
		DoctorDetails doctorDetail = iDoctorServices.get(1);
		PatientDetails patientDetails = iPatientService.get(1);

		appointment.setDoctorDetails(doctorDetail);
		appointment.setPatientDetails(patientDetails);
		iAppointmentService.save(appointment);
	}
}
