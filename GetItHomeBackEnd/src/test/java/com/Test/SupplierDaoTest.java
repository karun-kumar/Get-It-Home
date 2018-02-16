package com.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAOInterface.SupplierDao;
import com.Model.Supplier;

public class SupplierDaoTest {

	static SupplierDao supplierDao;
	
	@BeforeClass
	public static void preExecution() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		supplierDao = (SupplierDao)context.getBean("supplierDao");
		
	}
	
	@Ignore
	@Test
	public void addSupplier() {
		
		Supplier supplier = new Supplier();
		supplier.setSupplierName("Electronic sales");
		supplier.setSupplierAddress("Gajuwaka, visakhapatnam");
		
		assertTrue("problem in adding a supplier",supplierDao.addSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void updateSupplier() {
		
		Supplier supplier = supplierDao.getSupplier(8);
		supplier.setSupplierAddress("New Gajuwaka,visakhapatnam");
		
		assertTrue("problem in updating the supplier info",supplierDao.updateSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void deleteSupplier() {
		
		Supplier supplier = supplierDao.getSupplier(8);
		
		assertTrue("Problem is deleting the supplier",supplierDao.deleteSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void listSupplier() {
		
		List<Supplier> listSupplier = supplierDao.listSuppliers();
		
		assertNotNull("Problem to show all suppliers",listSupplier);
	}
}
