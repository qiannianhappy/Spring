package com.qin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qin.dao.MenuDaoImpl;

@Service
public class MenuServiceImpl {
	
	@Autowired
	private MenuDaoImpl menuDaoImpl;
	
	public List<Map<String,Object>> getMenuList(){
		return menuDaoImpl.getMenuList();
	}
}
