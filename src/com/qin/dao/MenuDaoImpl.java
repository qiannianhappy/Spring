package com.qin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String,Object>> getMenuList(){
		
		String sql="select MENUID,MENUNO,MENUPARENTNO,MENUORDER,MENUNAME,MENUURL,ISVISIBLE " +
				"from sys_menu";
		List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
}
