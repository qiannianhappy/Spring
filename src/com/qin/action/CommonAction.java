package com.qin.action;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qin.service.MenuServiceImpl;

@Controller
@RequestMapping(value="/common")
public class CommonAction {
	
	// Request«Î«Û∂‘œÛ
    @Autowired 
    private  HttpServletRequest request;

    @Autowired
    private MenuServiceImpl menuServiceImpl;
    
    @RequestMapping(value="/menu")
	public String menu(){
		List list = menuServiceImpl.getMenuList();
		request.setAttribute("list", list);
		return "common/menu";
	}
    

	@RequestMapping(value="/menuList")
	@ResponseBody
	public Map<String, Object> menuList(){
		List list = menuServiceImpl.getMenuList();
		Map<String, Object> modelMap = new HashMap<String, Object>(2);
		modelMap.put("statusCode", 200);
		modelMap.put("message", list);
		return modelMap;
	}
	
}
