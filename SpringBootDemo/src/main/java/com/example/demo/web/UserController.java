package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.business.UserBean;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@Value("${my.property}")
    String word;
	
	
	@PostMapping(value = "/insert")
	public String addUser(@RequestBody UserBean userBean) throws Exception{
		UserBean user = userService.adduser(userBean);		
		return ("Client Data Added Successfully. User ID: " + user.getUserId());		
	}
	@GetMapping("/get")
    public List<UserBean> getAllUsers() {
		return userService.getAllUsers();
    }
	@GetMapping("/value")
	public String value() {
		return  word;
	}
}
