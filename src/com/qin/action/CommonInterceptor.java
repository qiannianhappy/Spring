package com.qin.action;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.qin.entity.User;

public class CommonInterceptor extends HandlerInterceptorAdapter  {
	
	public final Log log = LogFactory.getLog(getClass());
	@Override
	public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		
		//Method Method = handler.getClass().getDeclaredMethod(name, null);
		String url=request.getRequestURL().toString(); 
		User user = (User) request.getSession().getAttribute("LOGIN_USER");
			if (user == null) {
				response.sendRedirect(request.getContextPath()+"/login.action");
				return false; // 跳转到管理后台登录页
		}
		return true;  
	}
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		String url=request.getRequestURL().toString();    
		long startTime=(Long)request.getAttribute("startTime");
		request.removeAttribute("startTime");
		long endTime=System.currentTimeMillis();
		log.info(url+" 操作耗时 "+(endTime-startTime)+" ms");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
