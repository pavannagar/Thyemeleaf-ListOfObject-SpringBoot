package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.Address;

@Service
public interface AddressService {

	public Address addAddress(Address address);
	public Address getAddressById(int id);
	
	
}
