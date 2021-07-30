/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.Person;

/**
 * @author Lenovo
 *
 */
public interface IPersonRepo extends CrudRepository<Person, Integer> {

}
