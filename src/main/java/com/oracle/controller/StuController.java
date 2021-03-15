package com.oracle.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


import com.oracle.service.StuService;

@Controller
public class StuController {
	
	//学生业务接口 
	private StuService stuService; 
	
	/**
	 * 业务跳转方法 return处写的login是要跳转的有页面,页面完整名称是login.jsp 
	 * 
	 */ 

	@RequestMapping("/login.html")
	public String execPage() { 
		return "login"; 
	}
}
