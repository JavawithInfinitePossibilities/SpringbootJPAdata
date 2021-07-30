/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.onetomanyR;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.onetomanyR.Client;

/**
 * @author Lenovo
 *
 */
public interface IClientRepo extends CrudRepository<Client, Integer> {

}
