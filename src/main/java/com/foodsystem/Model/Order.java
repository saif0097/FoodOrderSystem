package com.foodsystem.Model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User customer;
	
	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;
	
	private Long totalAmount;
	
	private String orderStatus ;
	
	private Date createdAt;
	
	@ManyToOne
	private Address deliveryAddress;
	
	@OneToMany
	private List<OrderItem>items;
	
//	private Payment payment;
	
	private int totalItem;
	
	private Long totalPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", restaurant=" + restaurant + ", totalAmount="
				+ totalAmount + ", orderStatus=" + orderStatus + ", createdAt=" + createdAt + ", deliveryAddress="
				+ deliveryAddress + ", items=" + items + ", totalItem=" + totalItem + ", totalPrice=" + totalPrice
				+ "]";
	}

	public Order(Long id, User customer, Restaurant restaurant, Long totalAmount, String orderStatus, Date createdAt,
			Address deliveryAddress, List<OrderItem> items, int totalItem, Long totalPrice) {
		super();
		this.id = id;
		this.customer = customer;
		this.restaurant = restaurant;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.createdAt = createdAt;
		this.deliveryAddress = deliveryAddress;
		this.items = items;
		this.totalItem = totalItem;
		this.totalPrice = totalPrice;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
