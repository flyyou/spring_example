package com.multicampus.biz.user.impl;

import java.util.ArrayList;

import com.multicampus.biz.user.vo.UserVO;

public interface DAO {
	public ArrayList<UserVO> getUserList(UserVO vo);
	public UserVO getUser(UserVO vo);
	public void addUser(UserVO vo);
	public void deleteUser(UserVO vo);
}
