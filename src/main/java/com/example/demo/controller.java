package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class controller {

	public controller() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method=RequestMethod.GET, value="/")
	public String init() {
		return "Hello WOrld";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/welcome")
	public String method1() {
		return "Hello WOrld, welcome back";
	}

}
