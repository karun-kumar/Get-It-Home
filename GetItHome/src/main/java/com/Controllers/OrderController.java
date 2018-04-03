package com.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DAOInterface.CartDao;
import com.DAOInterface.OrderDao;
import com.Model.Cart;
import com.Model.Order;

@Controller
public class OrderController {
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	OrderDao orderDao;
	
	@RequestMapping(value="/checkOut")
	public String checkout(Model m,HttpSession session) {
	
		String username=((String)session.getAttribute("username"));
		
		List<Cart> listCartItems = cartDao.listCartItems(username);
		m.addAttribute("listItems",listCartItems);
		
		m.addAttribute("totalPayment",this.calcTotalAmount(listCartItems));
		
		return "OrderPage";
	}
	
	@RequestMapping(value="/proceed",method=RequestMethod.POST)
	public String proceed(@RequestParam("pmode")String pmode,HttpSession session, Model m) {
		
		Order order = new Order();
		String username=((String)session.getAttribute("username"));
		
		List<Cart> listCartItems = cartDao.listCartItems(username);
		m.addAttribute("listItems",listCartItems);
		
		order.setPaymentMode(pmode);
		order.setUsername(username);
		order.setTotalAmountPaid(this.calcTotalAmount(listCartItems));
		order.setOrderDate(new java.util.Date());
		
		return "ThankYou";
	}
	
	private int calcTotalAmount(List<Cart> cartItems) {
		int item=0,totalAmount=0;
		while(item<cartItems.size()) {
			Cart cart = cartItems.get(item);
			totalAmount = totalAmount+(cart.getPrice()*cart.getQuantity());
			item++;
		}
		return totalAmount;
	}
}
