/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.springboot.springdata.JPA.hospital.model.db.ClinicalData;
import com.sid.springboot.springdata.JPA.hospital.repositories.ClinicalDataRepo;
import com.sid.springboot.springdata.JPA.hospital.services.IClinicalDataServices;

/**
 * @author Lenovo
 *
 */
@Service
public class ClinicalDataServiceImpl implements IClinicalDataServices {

	@Autowired
	private ClinicalDataRepo clinicalDataRepo;

	@Override
	public ClinicalData save(ClinicalData clinicalData) {
		return null;
	}

	@Override
	public ClinicalData get(int ClinicalDataId) {
		return null;
	}

	@Override
	public ClinicalData update(ClinicalData clinicalData) {
		return null;
	}

}
