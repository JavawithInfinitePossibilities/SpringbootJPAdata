/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.onetoone;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.onetoone.Driver;

/**
 * @author Lenovo
 *
 */
public interface IDriverRepo extends CrudRepository<Driver, Integer> {

}
