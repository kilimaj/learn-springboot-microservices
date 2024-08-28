package dev.kilima.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class DaoFactory {

	private DaoFactory() {

	}

	public static CustomerDao getCustomerDao() throws IOException {
		// Create input stream
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		// Creates an SQL Session
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();

		return session.getMapper(CustomerDao.class);
	}
}
