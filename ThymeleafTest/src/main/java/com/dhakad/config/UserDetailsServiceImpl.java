package com.dhakad.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dhakad.User;
import com.dhakad.service.UserService;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserService userService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// fetching user fro m database
		System.out.println("come to user details load/....upp");
		User user=userService.getUserById(username);  
		System.out.println("come to user details load/....down");
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		CustomeUserDetails customeUserDetails=new CustomeUserDetails(user);
		
		return customeUserDetails;
	}

}
