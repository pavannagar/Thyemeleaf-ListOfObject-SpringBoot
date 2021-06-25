package com.dhakad;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dhakad.service.UserService;




@Controller
public class Testing {

	@Autowired
	 private UserService userService; 
	
	@RequestMapping("/")
	public String homePage() {
		return "home.html";
	}
	
	@RequestMapping("/signup")
	public String signupPage() {
		return "signup.html";
	}
	@RequestMapping("/testform")
	public String testFormPage(Model model) {
		// Address a1=new Address(2, "ind", "iore");
		Address a2=new Address(2, "bheswa", "indore");
		Address a1=new Address(7, "sarangpur", "bhopal");
		
		List<Address> ad=List.of(a2,a1);
		
		User user=new User();
		user.setAddress(ad);
		model.addAttribute("user", user);
		model.addAttribute("arr", ad);
		return "testform.html";
	}

	
		
	@PostMapping("/register")
	public String doRegistration(@ModelAttribute("user") User user, Model model){
	
	/*	
		Address a1=new Address(1, "indore", "indore");
		Address a2=new Address(2, "ind", "iore");
		List<Address> ad=List.of(a1,a2);
	
	*/	user.setRole("user");
	//	
	
		System.out.println("typer"+user.getEmail().getClass().getName());
		System.out.println(".......................");
		System.out.println("typer"+user.getAddresses().getClass().getName());
		System.out.println(".......................");
		System.out.println("typer"+user.getClass().getName());
		System.out.println(".......................");
		//System.out.println("typer"+user.getAddresses().get(0) .getClass().getName());
		user.setAddress(user.getAddresses());
		System.out.println("user : "+user.toString());
		//user.setAddress(ad);
		//userService.adduser(user);
		System.out.println("user : "+user.toString());
		model.addAttribute("user", user);
		return "testform.html";
	}
	
	
	
	
	
	
}
