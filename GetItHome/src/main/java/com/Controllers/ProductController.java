package com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAOInterface.ProductDao;
import com.Model.Category;
import com.Model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;

	@RequestMapping(value="/product")
	public String val(Model m) {
		
		Product product = new Product();
		m.addAttribute(product);
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		return "Product";
	}
	
	@RequestMapping(value="/InsertProduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,Model m) {
		
		productDao.addProduct(product);
		
		Product product1 = new Product();
		m.addAttribute(product1);
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
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
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Product");
		return mv;
	}

	@RequestMapping(value ="/EditProduct,{productID}",method=RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable("productID")int productid, Model m) {
		
		Product product =productDao.getProduct(productid);
		m.addAttribute(product);
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Product");
		return mv;
	}

}
