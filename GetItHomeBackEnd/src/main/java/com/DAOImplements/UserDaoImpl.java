package com.DAOImplements;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.DAOInterface.UserDao;
import com.Model.User;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	@Override
	public boolean registerUser(User user) {
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception arised" +e);
			return false;
		}
	}

	@Transactional
	@Override
	public boolean updateUser(User user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception arised" +e);
			return false;
		}
	}

	@Transactional
	@Override
	public User getUser(String userName) {
		Session session = sessionFactory.openSession();
		User user = (User)session.get(User.class, userName);
		session.close();
		return user;
	}

	@Override
	public boolean approveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
