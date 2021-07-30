/**
 * 
 */
package com.sid.springboot.springdata.JPA.model.db.componentMapping;

import javax.persistence.Embeddable;

/**
 * @author Lenovo
 *
 */
@Embeddable
public class Address {

	private String streetaddress;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	/**
	 * 
	 */
	public Address() {
	}

	/**
	 * @param streetaddress
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param country
	 */
	public Address(String streetaddress, String city, String state, String zipcode, String country) {
		super();
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	/**
	 * @return the streetaddress
	 */
	public String getStreetaddress() {
		return streetaddress;
	}

	/**
	 * @param streetaddress the streetaddress to set
	 */
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetaddress=" + streetaddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", country=" + country + "]";
	}

}
