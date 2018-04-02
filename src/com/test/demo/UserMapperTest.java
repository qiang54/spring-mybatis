package com.test.demo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.mapper.UserMapper;
import com.test.pojo.User;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	@Before
	public void init() {
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testFindByUserId() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findById(1);
		System.out.println(user);
	}
		
}
