package com.dhakad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhakad.Address;
import com.dhakad.User;

@Service
public interface UserService {

	public User adduser(User user);
	public User getUserById(String id);
	

	
}
