package com.DBconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.DAOImplements.CategoryDaoImpl;
import com.DAOImplements.ProductDaoImpl;
import com.DAOImplements.SupplierDaoImpl;
import com.DAOImplements.UserDaoImpl;
import com.DAOInterface.CategoryDao;
import com.DAOInterface.ProductDao;
import com.DAOInterface.SupplierDao;
import com.DAOInterface.UserDao;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;
import com.Model.User;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	
	
	public DataSource getH2Data() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("Karun");
		dataSource.setPassword("1234");
		System.out.println("Data Source object created");
		return dataSource;
	}
	
	private Properties getHiber() {
		Properties p = new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		System.out.println("Tables Created");
		return p;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getHiberSession(){
		 
		LocalSessionFactoryBuilder lsfb = new LocalSessionFactoryBuilder(getH2Data());
		lsfb.addProperties(getHiber());
		
		lsfb.addAnnotatedClass(Category.class);
		lsfb.addAnnotatedClass(Supplier.class);
		lsfb.addAnnotatedClass(Product.class);
		lsfb.addAnnotatedClass(User.class);
		
		SessionFactory sessionFactory= lsfb.buildSessionFactory();	
		System.out.println("SessionFactory object created");
		return sessionFactory;
	}
	
	@Bean(name="categoryDao")
	public CategoryDao getCategoryDao() {
		return new CategoryDaoImpl();
	}
	
	@Bean(name="productDao")
	public ProductDao getProductDao() {
		return new ProductDaoImpl();
	}
	
	@Bean(name="supplierDao")
	public SupplierDao getSupplierDao() {
		return new SupplierDaoImpl();
	}
	
	@Bean(name="userDao")
	public UserDao getUserDao() {
		return new UserDaoImpl();
	}

	@Bean
	public HibernateTransactionManager getHibernateSessionFactory(SessionFactory sessionFactory) {
		 
	    System.out.println("Hibernate Transaction Manager object created");
		return new HibernateTransactionManager(sessionFactory);
			
	}
}
