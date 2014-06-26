package com.multicampus.biz.user.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

public class UserServiceClient {
	public static void main(String[] args) {
		
		ApplicationContext factory = 
			new ClassPathXmlApplicationContext("applicationContext.xml");

		UserVO vo = new UserVO();
		UserService userService = (UserService)factory.getBean("userService");

		userService.addUser(vo);
		userService.deleteUser(vo);
		userService.getUser(vo);
		userService.getUserList();
	}
}
