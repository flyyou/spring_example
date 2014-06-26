package com.multicampus.biz.user.impl;

import org.springframework.stereotype.Repository;

import com.multicampus.biz.user.vo.UserVO;

@Repository
public class UserDAO {
	public UserVO getUser(UserVO vo) {
		UserVO user = new UserVO();
		user.setName("superman");
		return user;
	}
}
