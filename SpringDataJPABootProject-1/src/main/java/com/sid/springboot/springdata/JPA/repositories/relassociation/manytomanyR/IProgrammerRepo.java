/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.manytomanyR;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR.Programmer;

/**
 * @author Lenovo
 *
 */
public interface IProgrammerRepo extends CrudRepository<Programmer, Integer> {

}
