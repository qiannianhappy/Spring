package com.qin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qin.entity.User;

@Repository
public class UserDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User getUserInfo(String username,String password){
		
		String sql="select USERID,USERNAME,PASSWORD,FULLNAME,SEX,PHONE,EMAIL,ACTIVEFLAG,CREATEDATE " +
				"from sys_user where username=? and password=?";
		try{
			return jdbcTemplate.queryForObject(sql, new Object[]{username,password},new userMapper());
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	
	public List<Map<String,Object>> getUserList(){
		
		String sql="select USERID,USERNAME,PASSWORD,FULLNAME,SEX,PHONE,EMAIL,ACTIVEFLAG,CREATEDATE " +
				"from sys_user";
		List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
	 class userMapper implements RowMapper {  
		  
		  public User mapRow(ResultSet rs, int rowNum) throws SQLException {  
			User user =new User();
			user.setUserid(rs.getInt("userid"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setFullname(rs.getString("fullname"));
			user.setSex(rs.getString("sex"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			user.setActiveflag(rs.getString("activeflag"));
			user.setCreatedate(rs.getString("createdate"));
			return user;  
		  }
	 }
}
