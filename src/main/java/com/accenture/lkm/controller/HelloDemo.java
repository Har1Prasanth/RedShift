package com.accenture.lkm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemo {


	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() throws Exception {
		{
			String str1="Hello, My Name is Hari Prasanth!!!";
			String str2="sas";

			String str3="sas";

			String str4="sas";
			return str1;
		}
	}

	
}
