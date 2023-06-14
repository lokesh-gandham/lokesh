package com.sports.sportshoes.models;

import java.math.BigDecimal;

import javax.persistence.*;



@Entity //One order can have many order items
@Table(name="orders")
public class Order {
	//Properties
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderId")    
	private Long id; //primary key
	
	//FK: userId
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "userId", referencedColumnName="userId")
	private User userId; 

	
	private String orderNum;
	private BigDecimal shippingCost;
	private BigDecimal orderTotal;
	
	
	//Default Constructor
	public Order() {}
	
	//Parameterized Constructor
	public Order(Long id, String orderNum, BigDecimal shippingCost, BigDecimal orderTotal) {
		this.id = id;

		this.orderNum = orderNum;
		this.shippingCost = shippingCost;
		this.orderTotal = orderTotal;
		
	}
	
	//Getters & Setters
	

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public BigDecimal getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(BigDecimal shippingCost) {
		this.shippingCost = shippingCost;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}



	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", orderNum=" + orderNum + ", shippingCost=" + shippingCost
				+ ", orderTotal=" + orderTotal + "]";
	}
	



}