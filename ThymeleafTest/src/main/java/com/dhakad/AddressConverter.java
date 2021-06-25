package com.dhakad;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;




@Component
public class AddressConverter implements Converter<String,Address> {

	@Override
	public Address convert(String id) {
		System.out.println(" trying convert id : "+id+" to Address");
		
		return null;
	}





}
