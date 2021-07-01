package com.axity.course.oop.enumeration;

public class Order {

	private int orderNumber;
	private Status status;

	private enum Status {
		CANCELLED, DISPUTED, IN_PROCESS, ON_HOLD, RESOLVED, SHIPPED;
	}
}
