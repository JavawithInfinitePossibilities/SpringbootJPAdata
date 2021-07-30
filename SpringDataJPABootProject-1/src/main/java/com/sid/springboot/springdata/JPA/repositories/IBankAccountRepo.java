/**
 * 
 */
package com.sid.springboot.springdata.JPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.springdata.JPA.model.db.BankAccount;

/**
 * @author Lenovo
 *
 */
public interface IBankAccountRepo extends CrudRepository<BankAccount, Integer> {

}
