package com.DAOInterface;

import com.Model.Order;

public interface OrderDao {
	
	public boolean paymentProcess(Order order);

}
