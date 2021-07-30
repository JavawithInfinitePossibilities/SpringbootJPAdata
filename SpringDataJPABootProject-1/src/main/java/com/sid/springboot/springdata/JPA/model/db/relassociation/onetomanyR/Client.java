/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.relassociation.onetomanyR;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Lenovo
 *
 */
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String name;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PhoneNumber> phoneNumbers;

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Client(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param phoneNumber
	 */
	public Client(String name, Set<PhoneNumber> phoneNumber) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumber;
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
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
	 * @return the phoneNumbers
	 */
	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void addPhoneNumber(PhoneNumber phoneNumber) {
		if (phoneNumber != null) {
			if (phoneNumbers == null) {
				phoneNumbers = new HashSet<PhoneNumber>();
			}
			phoneNumbers.add(phoneNumber);
			phoneNumber.setClient(this);
		}
	}

	/*
	 * We can not include the toString method as it cause the cyclic dependency which will lead to stackoverflow issue
	 */
}
