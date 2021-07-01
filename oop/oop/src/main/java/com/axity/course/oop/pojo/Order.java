package com.axity.course.oop.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order implements Serializable {

	private static final long serialVersionUID = 2862115363364783916L;
	private Integer orderId;
	private Client client;
	private List<OrderDetail> details;

	public Order() {
		details = new ArrayList<>();
	}

	public Order(Integer orderId) {
		this();
		this.orderId = orderId;
	}

	public Order(Integer orderId, Client client) {
		this(orderId);
		this.client = client;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}

	@Override
	public boolean equals(Object object) {
		boolean isEquals = false;

		if (this == object) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			Order that = (Order) object;
			isEquals = this.orderId.equals(that.orderId);
		}

		return isEquals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.orderId);
	}
}
