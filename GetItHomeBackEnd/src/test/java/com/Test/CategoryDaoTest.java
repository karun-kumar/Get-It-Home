package com.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.CategoryDao;
import com.Model.Category;

public class CategoryDaoTest {
	
	static CategoryDao categoryDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		categoryDao = (CategoryDao)context.getBean("categoryDao");
		
	}
	
	@Ignore
	@Test
	public void addCategoryTest() {
		
		Category category = new Category();
		category.setCategoryName("SmartTv's");
		
		assertTrue("problem in adding category",categoryDao.addCategory(category));
		
	}
	@Ignore
	@Test
	public void updateCategoryTest() {
		Category category = categoryDao.getCategory(4);
		category.setCategoryName("SmartTvs");
		
		assertTrue("problem in updating the category",categoryDao.updateCategory(category));
		
	}
	
	@Ignore
	@Test
	public void deleteCategoryTest() {
		Category category = categoryDao.getCategory(4);
		
		assertTrue("problem in deleting the category",categoryDao.deleteCategory(category));
	}
	
	@Ignore
	@Test
	public void listCategoriesTest() {
		
		List<Category> listCategories = categoryDao.listCategories();
		
		assertNotNull("problem in providing the list of categories",listCategories);
	}

}
