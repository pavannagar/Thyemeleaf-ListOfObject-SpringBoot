package com.dhakad;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhakad.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
	
	@RequestMapping("/xy/reg")
	public String addAdmin() {
		
		Admin admin=new Admin(123, "1234", "admin");
		admin.setPassword(passwordEncoder.encode(admin.getPassword()));
		
		adminService.addAdmin(admin);
		System.out.println("admin reg : "+admin.toString());
		return "home.html";
	}
	
	
	@RequestMapping("/admin/data")
	public String getAdmin() {
		
		System.out.println(adminService.getAdminById(1234));
		
		
		return "home.html";
	}
	
	@RequestMapping("/admin")
	public String adminDB(Principal principal) {
		String name=principal.getName();
		System.out.println("name : "+name);
		return "admindb.html";
	}
	
}
