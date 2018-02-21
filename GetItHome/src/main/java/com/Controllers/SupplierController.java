package com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAOInterface.SupplierDao;
import com.Model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping(value ="/supplier")
	public ModelAndView supplierPage(Model m) {
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		m.addAttribute("supplierList", listSuppliers);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Supplier");
		return mv;
	}
	
	@RequestMapping(value ="/InsertSupplier", method=RequestMethod.POST)
	public ModelAndView addSupplier(@RequestParam("supname")String supname,@RequestParam("supadd")String supadd, Model m) {
		
		Supplier supplier = new Supplier();
		supplier.setSupplierName(supname);
		supplier.setSupplierAddress(supadd);
		
		supplierDao.addSupplier(supplier);
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		m.addAttribute("supplierList", listSuppliers);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Supplier");
		return mv;
	}
	
	@RequestMapping(value ="/DeleteSupplier,{supplierID}")
	public ModelAndView deleteSupplier(@PathVariable("supplierID")int supplierid, Model m) {
		
		Supplier supplier = supplierDao.getSupplier(supplierid);
		supplierDao.deleteSupplier(supplier);
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		m.addAttribute("supplierList", listSuppliers);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Supplier");
		return mv;
	}

	@RequestMapping(value ="/EditSupplier,{supplierID}")
	public ModelAndView editSupplier(@PathVariable("supplierID")int supplierid, Model m) {
		
		Supplier supplier = supplierDao.getSupplier(supplierid);
		m.addAttribute("supplierInfo", supplier);
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		m.addAttribute("supplierList", listSuppliers);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("UpdateSupplier");
		return mv;
	}

	@RequestMapping(value ="/UpdateSupplier", method=RequestMethod.POST)
	public ModelAndView updateSupplier(@RequestParam("supname")String supname,@RequestParam("supid")int supid,@RequestParam("supadd")String supadd, Model m) {
		
		
		Supplier supplier = supplierDao.getSupplier(supid);
		supplier.setSupplierName(supname);
		supplier.setSupplierAddress(supadd);
		
		supplierDao.updateSupplier(supplier);
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		m.addAttribute("supplierList", listSuppliers);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Supplier");
		return mv;
	}

}
