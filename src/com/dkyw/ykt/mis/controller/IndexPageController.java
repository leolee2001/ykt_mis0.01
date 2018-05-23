package com.dkyw.ykt.mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dkyw.ykt.mis.pojo.User;
import com.dkyw.ykt.mis.service.UserService;

@Controller
public class IndexPageController {
	
	@RequestMapping("/")
	public String IndexPage(){
		return "login/login";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(User user){
		
		UserService us = new UserService();
		
//		System.out.println("user.uname = " + user.getUname() + "  " + "user.pwd = " + user.getPwd());
		if(null == us.userIs(user) || !us.userIs(user)){
			return "redirect:/";
		}
		return "ok";
	}
}
