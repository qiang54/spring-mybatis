package com.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.test.pojo.User;
/**
 * DAO的开发
 * 1.原生dao的开发
 * @author qiang
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	
	
	
	/**
	 * 按id查找
	 */
	@Override
	public User findUserById(Integer id) {
		SqlSession openSession = this.getSqlSession();
		User user = openSession.selectOne("test.findById", id);
		return user;
	}
	
	/**
	 * 按名称查找
	 */
	@Override
	public List<User> findUserByName(String name) {
		SqlSession openSession = this.getSqlSession();
		List<User> list = openSession.selectList("test.findByName", name);
		return list;
	}

}
