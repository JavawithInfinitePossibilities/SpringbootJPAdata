/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.services;

import com.sid.springboot.springdata.JPA.hospital.model.db.ClinicalData;

/**
 * @author Lenovo
 *
 */
public interface IClinicalDataServices {
	public ClinicalData save(ClinicalData clinicalData);

	public ClinicalData get(int ClinicalDataId);

	public ClinicalData update(ClinicalData clinicalData);
}
