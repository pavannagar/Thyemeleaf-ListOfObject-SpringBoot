package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.Admin;

@Service
public interface AdminService {

	public Admin addAdmin(Admin admin);
	public Admin getAdminById(int id);
	
	
}
