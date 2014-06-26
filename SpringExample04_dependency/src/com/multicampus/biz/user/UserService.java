package com.multicampus.biz.user;

import java.util.ArrayList;

import com.multicampus.biz.user.vo.UserVO;

public interface UserService {
	public void addUser(UserVO vo);
	public void deleteUser(UserVO vo);
	public UserVO getUser(UserVO vo);
	public ArrayList<UserVO> getUserList();
}

