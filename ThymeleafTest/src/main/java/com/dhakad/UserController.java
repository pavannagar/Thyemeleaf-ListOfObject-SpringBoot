package com.dhakad;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhakad.service.UserService;

@Controller
public class UserController {
    
	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	/*
	@RequestMapping("/my/reg")
	public String addUser() {

		User user=new User("n123","pavan","nagar","abc","admin");
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
			userService.adduser(user);
		return "home.html";
	}
	
	*/
	
	@RequestMapping("/user/ab")
	public String show() {
		User user=userService.getUserById("p123");
		
		System.out.print("user" +user);
		return "home.html";
	}
	
	@RequestMapping("/user")
	public String userDB(Principal principal) {
		
		String name=principal.getName();
		System.out.println("name : "+name);
		
		return "userdb.html";
	}
	
	
	
	
	
}
