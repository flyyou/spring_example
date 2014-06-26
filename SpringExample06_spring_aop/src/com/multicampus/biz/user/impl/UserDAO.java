package com.multicampus.biz.user.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.multicampus.biz.user.vo.UserVO;

@Service("userDAO")
public class UserDAO implements DAO {
	public ArrayList<UserVO> getUserList(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### getUserList() 호출... #####");
		System.out.println("########################");
		return null;
	}
	public UserVO getUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### getUser() 호출... #####");
		System.out.println("########################");
		return null;
	}
	public void addUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### addUser() 호출... #####");
		System.out.println("########################");
	}	
	public void deleteUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### deleteUser() 호출... #####");
		System.out.println("########################");
	}
}
