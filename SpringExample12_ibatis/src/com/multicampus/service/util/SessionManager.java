package com.multicampus.service.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionManager {
	public static SqlSessionFactory ibatisSession;
	
	static{
		String resource = "sql-map-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			ibatisSession = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSession(){
		return ibatisSession;
	}
}
