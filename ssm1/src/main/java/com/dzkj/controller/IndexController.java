package com.dzkj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj.pojo.Users;
import com.dzkj.service.IUsersDao;

@Controller
public class IndexController {
@Autowired
private IUsersDao user_service;
@RequestMapping("/findAll")
   public String findAll(Map<String, Object> map) {
		System.out.println("hello");
	    List<Users> users=user_service.findAll();
	    System.out.println(users.get(0).getU_name());
	    map.put("users", users);
	  return "list"; 
   }
}
