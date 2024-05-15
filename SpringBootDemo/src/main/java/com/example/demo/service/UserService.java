package com.example.demo.service;

import java.util.List;

import com.example.demo.business.UserBean;

public interface UserService {
	public UserBean adduser(UserBean userBean) throws Exception;
    public List<UserBean> getAllUsers();
}
