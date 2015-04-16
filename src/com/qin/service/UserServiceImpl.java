package com.qin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qin.dao.UserDaoImpl;
import com.qin.entity.User;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public User getUserInfo(String username,String password){
		return userDaoImpl.getUserInfo(username, password);
	}
	
	public User getUserInfo(String userid){
		return userDaoImpl.getUserInfo(userid);
	}
	
	public List<Map<String,Object>> getUserList(){
		return userDaoImpl.getUserList();
	}
}
