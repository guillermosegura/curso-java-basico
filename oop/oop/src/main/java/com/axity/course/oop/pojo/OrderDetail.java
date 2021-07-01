package com.axity.course.oop.pojo;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetail implements Serializable {

	private static final long serialVersionUID = -3939254592116838169L;
	private String sku;
	private int quantity;
	private double price;

	public OrderDetail() {
	}

	public OrderDetail(String sku, int quantity, double price) {
		this.sku = sku;
		this.quantity = quantity;
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object object) {
		boolean isEquals = false;

		if (this == object) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			OrderDetail that = (OrderDetail) object;
			isEquals = this.sku.equals(that.sku);
		}

		return isEquals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.sku);
	}

}
