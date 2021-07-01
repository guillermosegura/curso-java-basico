package com.axity.course.oop.innerclass;

//import com.axity.course.oop.innerclass.Order.OrderDetail;

public class InnerClassApp {

	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderId(1247);

		Order.OrderDetail detail =  new Order.OrderDetail();
		detail.setSku("012346");
		detail.setQuantity(5);
		detail.setPrice(10.15);
		order.add(detail);

		detail = new Order.OrderDetail();
		detail.setSku("206550");
		detail.setQuantity(10);
		detail.setPrice(12.50);
		order.add(detail);

		detail = new Order.OrderDetail();
		detail.setSku("033601");
		detail.setQuantity(2);
		detail.setPrice(88.8);
		order.add(detail);
		
		System.out.println(order);
		System.out.println(order.getSubtotal());

	}

}
