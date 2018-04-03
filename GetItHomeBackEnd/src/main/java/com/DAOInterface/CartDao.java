package com.DAOInterface;

import java.util.List;

import com.Model.Cart;

public interface CartDao {

	public boolean addToCart(Cart cart);
	public boolean deleteFromCart(Cart cart);
	public boolean updateFromCart(Cart cart);
	public Cart getCart(int cartId);
	public List<Cart> listCartItems(String userName);
}
