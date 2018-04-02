package com.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.CartDao;
import com.Model.Cart;
import com.Model.Category;

public class CartDaoTest {

static CartDao cartDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		cartDao = (CartDao)context.getBean("cartDao");
		
	}
	
	@Ignore
	@Test
	public void addcartTest() {
		
		Cart cart = new Cart();
		cart.setPrice(18900);
		cart.setProductId(5);
		cart.setProductName("VIVO V7 PLUS");
		cart.setQuantity(1);
		cart.setStatus("NP");
		cart.setUserName("kiran");
		
		assertTrue("problem in adding category",cartDao.addToCart(cart));
		
	}
	@Ignore
	@Test
	public void updateCategoryTest() {
		
		Cart cart = cartDao.getCart(42);
		cart.setQuantity(4);
		
		assertTrue("problem in adding category",cartDao.updateFromCart(cart));	
	}
	
	@Ignore
	@Test
	public void deleteCategoryTest() {
		Cart cart = cartDao.getCart(43);
		assertTrue("problem in adding category",cartDao.deleteFromCart(cart));
		}
	
	@Ignore
	@Test
	public void listCategoriesTest() {
		List<Cart> listCartItems = cartDao.listCartItems();

		assertNotNull("problem in providing the list of categories",listCartItems);	
		}


}
