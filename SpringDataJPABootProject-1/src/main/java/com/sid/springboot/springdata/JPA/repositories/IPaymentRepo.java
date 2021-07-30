/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.Payment;

/**
 * @author Lenovo
 *
 */
public interface IPaymentRepo extends CrudRepository<Payment, Integer> {

}
