package com.qin.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qin.entity.User;
import com.qin.service.UserServiceImpl;
import com.qin.util.UtilTools;

@Controller
public class logonAction {
	
    @Autowired  
    private  HttpServletRequest request;
    @Autowired
    private UserServiceImpl userServiceImpl;
    
	@RequestMapping(value="/doLogin")
	public ModelAndView doLogin(String checkcode,String username,String password){
		
		User user=null;
		String cd = (String)request.getSession().getAttribute("rand");
		if(null==cd||null==checkcode){
			return new ModelAndView("forward:/login.action");
		}
		if (checkcode.equalsIgnoreCase(cd)) {    // 关闭验证码
			user = userServiceImpl.getUserInfo(username, UtilTools.MD5(password));
			if (null == user) {
				return new ModelAndView("forward:/login.action","errorMsg","用户名或密码错误！");
			} else {
				request.getSession().setAttribute("LOGIN_USER", user);
				return new ModelAndView("redirect:/index.action");
			}
		} else {
			return new ModelAndView("forward:/login.action","errorMsg","验证码输入不正确！");
		}
		//return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}

	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/logout")
	public String logout() {
		request.getSession().removeAttribute("LOGIN_USER");
		return "redirect:/";
	}
}
