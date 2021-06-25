package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.Address;
import com.dhakad.User;
import com.dhakad.repository.UserRepo;
import com.dhakad.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

	
}
