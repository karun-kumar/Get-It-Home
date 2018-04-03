package com.DAOImplements;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DAOInterface.OrderDao;
import com.Model.Order;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean paymentProcess(Order order) {
		try 
		{
		sessionFactory.getCurrentSession().save(order);
		return true;
		}
		catch(Exception e) 
		{
		System.out.println("Exception Arised"+e);
		return false;
		}
	}

}
