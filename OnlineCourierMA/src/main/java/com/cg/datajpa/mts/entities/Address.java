
package com.cg.datajpa.mts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_Sequence")
	@SequenceGenerator(name = "address_Sequence", sequenceName = "address_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "addid")
	private int addressId;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "zip")
	private int zip;

	public Address() {
		super();
	}

	public Address(String street, String city, String state, String country, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zip=" + zip + "]";
	}

}