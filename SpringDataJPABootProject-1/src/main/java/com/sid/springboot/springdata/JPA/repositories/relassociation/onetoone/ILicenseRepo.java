/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.onetoone;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.onetoone.License;

/**
 * @author Lenovo
 *
 */
public interface ILicenseRepo extends CrudRepository<License, Integer> {

}
