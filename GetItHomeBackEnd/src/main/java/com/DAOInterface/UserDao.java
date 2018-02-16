package com.DAOInterface;

import com.Model.User;

public interface UserDao {
	
	public boolean registerUser(User user);
	public boolean updateUser(User user);
	public User getUser(String userName);
	public boolean approveUser(User user);

}
