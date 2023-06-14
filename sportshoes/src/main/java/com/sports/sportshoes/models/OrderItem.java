package com.sports.sportshoes.models;

import java.math.BigDecimal;

import javax.persistence.*;



@Entity
@Table(name="orderItems")
public class OrderItem {
	
	//Properties
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="itemId")    
	private Long id; //primary key	
	
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "orderId", referencedColumnName="orderId")
	private Order orderId; //foreign key
	
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "productId", referencedColumnName="productId")
	private Product productId; //foreign key
	
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinColumn(name = "sizeId", referencedColumnName="sizeId")
	private Size sizeId; //foreign key
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category",referencedColumnName="occasion_name")
	private Occasion category;
	
	
	private Long quantity;
	private BigDecimal subtotal;
	
	//Default Constructor
	public OrderItem() {}

	//Parameterized Constructor
	public OrderItem(Long id,Occasion category, Order orderId, Product productId, Size sizeId, Long quantity, BigDecimal subtotal) {
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.sizeId = sizeId;
		this.category=category;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Size getSizeId() {
		return sizeId;
	}

	public void setSizeId(Size sizeId) {
		this.sizeId = sizeId;
	}

	public Occasion getCategory() {
		return category;
	}

	public void setCategory(Occasion category) {
		this.category = category;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", sizeId=" + sizeId
				+ ", category=" + category + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
	}
	
	
	
}//end 