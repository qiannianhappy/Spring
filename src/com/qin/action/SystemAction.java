package com.qin.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qin.entity.User;
import com.qin.service.UserServiceImpl;

@Controller
@RequestMapping(value="/system")
public class SystemAction {
	
    @Autowired  
    private  HttpServletRequest request;
    @Autowired
    private UserServiceImpl userServiceImpl;
    
	@RequestMapping(value="/user")
	public String userManage(){
		List list = userServiceImpl.getUserList();
		request.setAttribute("list", list);
		return "system/user";
	}
	
	@RequestMapping(value="/userList")
	@ResponseBody
	public Map<String, Object> userList(){
		List list = userServiceImpl.getUserList();
		Map<String, Object> modelMap = new HashMap<String, Object>(2);
		modelMap.put("statusCode", 200);
		modelMap.put("message", list);
		return modelMap;
	}
	
	@RequestMapping(value="/userAdd")
	public String userAdd(){
		return "system/user_add";
	}
	
	@RequestMapping(value="/userEdit")
	public String userEdit(String userid){
		User user=userServiceImpl.getUserInfo(userid);
		request.setAttribute("User", user);
		return "system/user_edit";
	}
	
	@RequestMapping(value="/passwordModify")
	public @ResponseBody String passwordModify(){
		return "ÐÞ¸Ä³É¹¦";
	}
	
	@RequestMapping(value="/role")
	public String roleManage(){
		return "system/role";
	}
}
