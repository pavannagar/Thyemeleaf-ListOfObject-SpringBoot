package com.dhakad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.Admin;
import com.dhakad.repository.AdminRepo;

@Service
public class AdminService implements com.dhakad.service.AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	
	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminRepo.findById(id).get();
	}

}
