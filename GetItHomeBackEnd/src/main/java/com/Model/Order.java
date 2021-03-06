package com.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myOrder")
public class Order {

	@Id
	@GeneratedValue
	private int orderId;
	
	private String username;
	private Date orderDate;
	private int totalAmountPaid;
	private String paymentMode;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
		}
	
	public int getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void setTotalAmountPaid(int totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
