package com.axity.course.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import com.axity.course.to.Address;
import com.axity.course.to.Customer;
import com.axity.course.to.Order;
import com.axity.course.to.OrderDetail;
import com.axity.course.to.OrderTotal;

public class LambdaIntro
{

  public static void main( String[] args )
  {

    RandomNumber dado = ( b ) -> {
      return (int) (Math.random() * b) + 1;
    };

    for( int i = 0; i < 10; i++ )
    {
      System.out.println( "Lanzamiento " + (i + 1) + " = " + dado.lanza( 20 ) );
    }

  }

  private interface RandomNumber
  {
    int lanza( int num );
  }

  private static Function<Integer, Integer> duplicar = v -> {
    return v * 2;
  };

  private static Order createOrder( String clientName, String country, Integer orderId )
  {
    Order order = new Order();
    order.setOrderId( orderId );
    Customer client = new Customer();
    client.setName( clientName );
    Address address = new Address();
    address.setCountry( country );
    client.setAddress( address  );
    
    order.setClient( client );
    List<OrderDetail> details = Arrays.asList( new OrderDetail( "A001", 10, 20.0 ), new OrderDetail( "A002", 10, 50.0 ),
      new OrderDetail( "A003", 10, 35.0 ) );
    order.setDetails( details );
    return order;
  }

  private static Function<Order, OrderTotal> transform = order -> {
    OrderTotal orderTotal = new OrderTotal();
    orderTotal.setClientName( order.getClient().getName() );
    orderTotal.setCountry( order.getClient().getAddress().getCountry() );
    orderTotal.setOrderId( order.getOrderId() );

    double subtotal = order.getDetails().stream()
        .collect( Collectors.summarizingDouble( x -> x.getPrice() * x.getQuantity() ) ).getSum();
    orderTotal.setTotal( subtotal );
    return orderTotal;
  };

}
