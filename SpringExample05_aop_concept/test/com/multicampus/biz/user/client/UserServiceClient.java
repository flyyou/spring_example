package com.multicampus.biz.user.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.user.impl.DAO;
import com.multicampus.biz.user.vo.UserVO;

public class UserServiceClient {
	public static void main(String[] args) {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserVO vo = new UserVO();
		DAO dao = 
			(DAO)factory.getBean("userDAO");

		dao.getUser(vo);
		dao.getUserList(vo);
	}
}


