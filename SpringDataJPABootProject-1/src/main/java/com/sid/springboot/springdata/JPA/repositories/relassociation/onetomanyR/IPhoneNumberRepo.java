/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation.onetomanyR;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.relassociation.onetomanyR.PhoneNumber;

/**
 * @author Lenovo
 *
 */
public interface IPhoneNumberRepo extends CrudRepository<PhoneNumber, Integer> {

}
