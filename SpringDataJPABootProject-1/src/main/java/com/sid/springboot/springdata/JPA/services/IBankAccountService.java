/**
 * 
 */
package com.sid.springboot.springdata.JPA.services;

import com.sid.springboot.springdata.JPA.model.db.BankAccount;

/**
 * @author Lenovo
 *
 */
public interface IBankAccountService {
	public BankAccount save(BankAccount account);

	public void transactionAccount(BankAccount from, BankAccount to, int substract);
}
