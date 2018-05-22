package com.dkyw.ykt.mis.service;

import com.dkyw.ykt.mis.dao.UserDAO;
import com.dkyw.ykt.mis.pojo.User;

public class UserService {
	
	//查询user表确定用户是否存在
	public Boolean userIs(User u){
		UserDAO ud = new UserDAO();
		return ud.getUsers(u);
	}
}
