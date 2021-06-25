package com.dhakad.service.impl;

import org.springframework.stereotype.Service;

import com.dhakad.Address;
import com.dhakad.repository.AddressRepo;
import com.dhakad.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepo addressRepo;
	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}

	@Override
	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		return addressRepo.findById(id).get();
	}

}
