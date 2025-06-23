package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuestbookController {
	
	//필드
	
	
	//생성자
	
	
	//메소드 gs
	
	
	//메소드 일반
	@RequestMapping(value="/aaa", method= {RequestMethod.GET, RequestMethod.POST})
	public String test() {
		System.out.println("aaaa");
		
		return "";
		
	}
	
	@RequestMapping(value="/addlist", method= {RequestMethod.GET, RequestMethod.POST})
	public String select() {
		System.out.println("guestbook4/addlist");
		
		return "";
	}

}
