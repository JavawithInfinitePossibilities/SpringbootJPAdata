/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lenovo
 *
 */
@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNo;

	private String name;
	private int balance;

	/**
	 * 
	 */
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param balance
	 */
	public BankAccount(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
