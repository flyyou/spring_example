package com.multicampus.biz.user.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	public ArrayList<UserVO> getUserList() {
		System.out.println("########################");
		System.out.println("##### getUserList() ȣ��... #####");
		System.out.println("########################");
		return null;
	}
	public UserVO getUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### getUser() ȣ��... #####");
		System.out.println("########################");
		return null;
	}
	public void addUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### addUser() ȣ��... #####");
		System.out.println("########################");
	}	
	public void deleteUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### deleteUser() ȣ��... #####");
		System.out.println("########################");
	}
}
