package com.axity.course.oop.innerclass;

import java.io.IOException;
import java.io.InputStream;

import com.axity.course.oop.casting.Meow;

public class AnonymousClassApp
{

  public static void main( String[] args )
  {
    // orderNormal();
    System.out.println( "---------" );
    // anonymousClass();

    // anonymousAbstractClasses();

    System.out.println( "---------" );
    anonymousInterface();
  }

  private static void anonymousAbstractClasses()
  {
    AbstractMyClase m = new AbstractMyClase()
    {
      @Override
      public String toString()
      {
        return "Hello world!";
      }
    };

    AbstractMyClase m2 = new AbstractMyClase()
    {
      @Override
      public String toString()
      {
        return "Hola mundo!!!";
      }
    };

    M3 m3 = new M3();

    System.out.println( m );
    System.out.println( m2 );
    System.out.println( m3 );
  }

  private static void orderNormal()
  {
    Order orderNormal = new Order( 1247 );

    Order.OrderDetail detail = new Order.OrderDetail();
    detail.setSku( "012346" );
    detail.setQuantity( 5 );
    detail.setPrice( 10.15 );
    orderNormal.add( detail );

    detail = new Order.OrderDetail();
    detail.setSku( "206550" );
    detail.setQuantity( 10 );
    detail.setPrice( 12.50 );
    orderNormal.add( detail );

    detail = new Order.OrderDetail();
    detail.setSku( "033601" );
    detail.setQuantity( 2 );
    detail.setPrice( 88.8 );
    orderNormal.add( detail );

    System.out.println( orderNormal );
  }

  private static void anonymousInterface()
  {
    Meow kitty = new Meow()
    {
      @Override
      public void meow()
      {
        System.out.println( "prrrr" );
      }
    };

    kitty.meow();
  }

  private static void anonymousClass()
  {
    Order order = new Order( 1247 )
    {

      @Override
      protected void init()
      {
        System.out.println( "Creando el nuevo ORDEN MUNDIAL!!!" );
      }

      @Override
      public void setOrderId( int orderId )
      {
        super.setOrderId( orderId );
        System.out.println( "Seteando el ID" );
      }

      @Override
      public String toString()
      {
        StringBuilder sb = new StringBuilder();
        sb.append( "orderId: " ).append( this.getOrderId() );

        double subtotal = 0.0;
        for( OrderDetail detail : this.getDetails() )
        {
          subtotal += detail.getPrice() * detail.getQuantity();
        }

        sb.append( ", subtotal " ).append( subtotal );

        return sb.toString();
      }
    };

    order.setOrderId( 1247 );

    Order.OrderDetail detail = new Order.OrderDetail();
    detail.setSku( "012346" );
    detail.setQuantity( 5 );
    detail.setPrice( 10.15 );
    order.add( detail );

    detail = new Order.OrderDetail();
    detail.setSku( "206550" );
    detail.setQuantity( 10 );
    detail.setPrice( 12.50 );
    order.add( detail );

    detail = new Order.OrderDetail();
    detail.setSku( "033601" );
    detail.setQuantity( 2 );
    detail.setPrice( 88.8 );
    order.add( detail );

    System.out.println( order );
    // System.out.println( order.getSubtotal() );
  }

  public static abstract class AbstractMyClase
  {
    public abstract String toString();
  }

  public static class M3 extends AbstractMyClase
  {

    @Override
    public String toString()
    {
      return "Aló mundo!!!";
    }

  }
}
