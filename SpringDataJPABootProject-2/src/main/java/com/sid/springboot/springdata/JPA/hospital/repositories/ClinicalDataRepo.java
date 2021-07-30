/**
 * 
 */
package com.sid.springboot.springdata.JPA.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.springboot.springdata.JPA.hospital.model.db.ClinicalData;

/**
 * @author Lenovo
 *
 */
public interface ClinicalDataRepo extends JpaRepository<ClinicalData, Integer> {

}
