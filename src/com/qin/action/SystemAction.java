package com.qin.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qin.dao.UserDaoImpl;
import com.qin.entity.User;
import com.qin.service.UserServiceImpl;
import com.qin.util.UtilTools;

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
	
	@RequestMapping(value="/passwordModify")
	public @ResponseBody String passwordModify(){
		return "ÐÞ¸Ä³É¹¦";
	}
	
	 
	@RequestMapping(value="/role")
	public String roleManage(){
		return "system/role";
	}
}
