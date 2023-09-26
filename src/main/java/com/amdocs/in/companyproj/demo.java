package com.amdocs.in.companyproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@GetMapping("/get")
	public String show() {
		String s="Hello , This is Asia , Welecome to Spring boot and Jenkins your ID is";
		return s + "7008";
				
		
	}
	

}
