/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories.relassociation;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.componentMapping.Customer;
import com.sid.springboot.springdata.JPA.model.db.componentMapping.CustomerId;

/**
 * @author Lenovo
 *
 */
public interface ICustomerRepo extends CrudRepository<Customer, CustomerId> {

}
