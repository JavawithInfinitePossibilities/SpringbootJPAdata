/**
 * 
 */
package com.sid.springboot.springdata.JPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.springboot.springdata.JPA.model.db.BankAccount;
import com.sid.springboot.springdata.JPA.repositories.IBankAccountRepo;
import com.sid.springboot.springdata.JPA.services.IBankAccountService;

/**
 * @author Lenovo
 *
 */
@Service
public class BankAccountServicesImpl implements IBankAccountService {

	@Autowired
	private IBankAccountRepo iBankAccountRepo;

	@Override
	public BankAccount save(BankAccount account) {
		return iBankAccountRepo.save(account);
	}

	@Override
	@Transactional
	public void transactionAccount(BankAccount from, BankAccount to, int substract) {
		from.setBalance(from.getBalance() - substract);
		iBankAccountRepo.save(from);
		if (true) {
			throw new RuntimeException();
		}
		to.setBalance(to.getBalance() + substract);
		iBankAccountRepo.save(to);
	}
}
