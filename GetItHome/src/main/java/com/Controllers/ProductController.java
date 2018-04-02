package com.Controllers;

import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.DAOInterface.CategoryDao;
import com.DAOInterface.ProductDao;
import com.DAOInterface.SupplierDao;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping(value="/product")
	public String val(Model m) {
		
		Product product = new Product();
		m.addAttribute(product);
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		m.addAttribute("categoryList", this.getCategories());
		m.addAttribute("supplierList", this.getSuppliers());
		
		return "Product";
	}
	/*Adding the list of categories in the add product form*/
	public LinkedHashMap<Integer,String> getCategories(){
		
		List<Category> listCategories = categoryDao.listCategories();
		
		LinkedHashMap<Integer,String> categoryList = new LinkedHashMap<Integer,String>();
		
		for (Category category:listCategories) {	
			categoryList.put(category.getCategoryId(), category.getCategoryName());
		}
		return categoryList;
	}
	
	public LinkedHashMap<Integer,String> getSuppliers(){
		
		List<Supplier> listSuppliers = supplierDao.listSuppliers();
		
		LinkedHashMap<Integer,String> supplierList = new LinkedHashMap<Integer,String>();
		
		for (Supplier supplier:listSuppliers) {	
			supplierList.put(supplier.getSupplierId(),supplier.getSupplierName());
		}
		return supplierList;
	}
	
	@RequestMapping(value="/InsertProduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,Model m,@RequestParam("pimage")MultipartFile filedetail) {
		
		productDao.addProduct(product);
		
		Product product1 = new Product();
		m.addAttribute(product1);
		
		m.addAttribute("categoryList", this.getCategories());
		m.addAttribute("supplierList", this.getSuppliers());
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		//==> Adding the Image
		String path = "E:\\karun 32gb\\Git-Hub\\Get-It-Home\\Get-It-Home\\GetItHome\\src\\main\\webapp\\resources\\Images\\";
		path = path+String.valueOf(product.getProductId())+".jpg";
		File file = new File(path);
		
		if(!filedetail.isEmpty())
		{
			try {
				byte[] buffer = filedetail.getBytes();
				FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				bos.write(buffer);
				bos.close();
			} catch (Exception e) {
				m.addAttribute("ErrorInfo", "Exception Arised:"+e.getMessage());
			}
		}
		else {
			m.addAttribute("ErrorInfo", "There is system problem No Image is been added");
		}
		//==> Image Added
		
		return "Product";
		
	}
	
	@RequestMapping(value ="/DeleteProduct,{productID}",method=RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable("productID")int productid, Model m) {
		
		Product product =productDao.getProduct(productid);
		productDao.deleteProduct(product);
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		Product product1 = new Product();
		m.addAttribute(product1);
		
		m.addAttribute("categoryList", this.getCategories());
		m.addAttribute("supplierList", this.getSuppliers());
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Product");
		return mv;
	}

	@RequestMapping(value ="/EditProduct,{productID}",method=RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable("productID")int productid, Model m) {
		
		Product product =productDao.getProduct(productid);
		m.addAttribute(product);
		
		m.addAttribute("categoryList", this.getCategories());
		m.addAttribute("supplierList", this.getSuppliers());
		
		Product product1 =productDao.getProduct(productid);
		productDao.deleteProduct(product1);
				
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Product");
		return mv;
	}
	
	@RequestMapping(value ="/viewProducts,{categoryId}",method=RequestMethod.GET)
	public ModelAndView viewProducts(@PathVariable("categoryId")int categoryid, Model m) {
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		m.addAttribute("categoryid",categoryid);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewProducts");
		return mv;
	}
	
	@RequestMapping(value="/ProductDesc,{productId}",method=RequestMethod.GET)
	public String productDesc(@PathVariable("productId")int productid,Model m) {
		Product product =productDao.getProduct(productid);
		m.addAttribute("product",product);

		return "ProductDesc";
	}
}

