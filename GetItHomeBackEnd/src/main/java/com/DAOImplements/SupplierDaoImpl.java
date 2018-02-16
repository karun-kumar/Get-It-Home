package com.DAOImplements;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.DAOInterface.SupplierDao;
import com.Model.Supplier;

public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addSupplier(Supplier supplier) {
		
		try 
		{
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception arised" +e);
			return false;	
		}
		
	}

	@Transactional
	@Override
	public boolean updateSupplier(Supplier supplier) {
		
		try 
		{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception arised" +e);
			return false;	
		}
		
	}

	@Transactional
	@Override
	public boolean deleteSupplier(Supplier supplier) {
		
		try 
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e) 
		{
			System.out.println("Exception arised" +e);
			return false;	
		}
	}

	@Transactional
	@Override
	public Supplier getSupplier(int supplierId) {
		Session session = sessionFactory.openSession();
		Supplier supplier = session.get(Supplier.class, supplierId);
		session.close();
		return supplier;
	}

	@Transactional
	@Override
	public List<Supplier> listSuppliers() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Supplier");
		List<Supplier> listSuppliers = query.list();
		session.close();
		return listSuppliers;
	}

}
