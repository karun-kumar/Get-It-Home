package com.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.ProductDao;
import com.Model.Product;

public class ProductDaoTest {

	static ProductDao productDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		productDao = (ProductDao)context.getBean("productDao");
		
	}
	
	@Ignore
	@Test
	public void addProduct() {
		Product product = new Product();
		
		product.setProductName("samsung J7Prime");
		product.setProductDesc("2016 Release");
		product.setStock(10);
		product.setPrice(14990);
		product.setCategoryId(1);
		product.setSupplierId(1);
		
		assertTrue("problem in adding a product",productDao.addProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProduct() {
		
		Product product = productDao.getProduct(7);
		product.setPrice(14500);
		
		assertTrue("problem in updating a product info",productDao.updateProduct(product));
		
	}
	
	@Ignore
	@Test
	public void deleteProduct() {
		
		Product product = productDao.getProduct(7);
		
		assertTrue("problem in deleting a product",productDao.deleteProduct(product));
	
	}
	
	@Ignore
	@Test
	public void listProducts() {
		
		List<Product> listProducts = productDao.listProducts();
		
		assertNotNull("problem to show all products",listProducts);
	}

}
