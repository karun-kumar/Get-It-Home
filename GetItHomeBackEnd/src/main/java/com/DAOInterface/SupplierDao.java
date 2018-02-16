package com.DAOInterface;

import java.util.List;

import com.Model.Supplier;

public interface SupplierDao {
	
	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public  Supplier getSupplier(int supplierId); 
	public List<Supplier> listSuppliers();

}
