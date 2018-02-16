package com.DAOInterface;

import java.util.List;

import com.Model.Product;

public interface ProductDao {
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product getProduct(int productId);
	public List<Product> listProducts();
	
}
