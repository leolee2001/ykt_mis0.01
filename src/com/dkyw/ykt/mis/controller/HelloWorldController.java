package com.dkyw.ykt.mis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.print("aaa");
		ModelAndView m = new ModelAndView("aaa/index.jsp");
		m.addObject("a", "hehe");
		return m;
	}
	
//	public ModelAndView indexPage(){
//		return null;
//	}

}
