package com.dkyw.ykt.mis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dkyw.ykt.mis.pojo.User;
import com.dkyw.ykt.mis.util.JDBCUtil;

public class UserDAO {

	public Boolean getUsers(User u){
		
		Connection conn = null;
		ResultSet rs = null;
		String sql = "select * from users where uname = ? and pwd = ?";
		
		conn = JDBCUtil.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setNString(1, u.getUname());
			ps.setString(2, u.getPwd());
			rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
