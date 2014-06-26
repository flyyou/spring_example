package com.multicampus.biz.user.client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:./resource/applicationContext.xml" })
public class UserServiceClient {
	@Autowired
	private UserService userService;

	@Test
	public void getUser() throws Exception {
		UserVO vo = new UserVO();

		UserVO user = userService.getUser(vo);
		assertEquals("superman", user.getName());
	}
}
