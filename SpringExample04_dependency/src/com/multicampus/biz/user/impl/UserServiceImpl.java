package com.multicampus.biz.user.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public ArrayList<UserVO> getUserList() {
		return userDAO.getUserList();
	}
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	public void addUser(UserVO vo) {
		userDAO.addUser(vo);
	}	
	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);	
	}
}
