package com.dhakad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "email")
	private List<Address> addresses= new ArrayList<Address>();
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String email) {
		super();
		this.email = email;
	}


	public User(List<Address> addresses) {
		super();
		this.addresses = addresses;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddress(List<Address> addresses) {
		this.addresses = addresses;
	}


	public User(String email, String firstName, String lastName, String password, String role, List<Address> addresses) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
		this.addresses = addresses;
	}


	

	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", role=" + role + ", addresses=" + addresses + "]";
	}

	

	
	
}
