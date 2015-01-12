package com.qin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.qin.entity.User;

public class CommonInterceptor extends HandlerInterceptorAdapter  {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
		 String className = handler.getClass().getName();// packageName.ClassName   
		 User user = (User) request.getSession().getAttribute("LOGIN_USER");
			if (user == null) {
				if (className.equals("home")){
					//return "login"; // ��ת�������̨��¼ҳ
				}else{
					//return "timeout"; // ��ת���������ڵ�¼ҳ
			}
		}
		return true;  
	}
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
