package com.axity.course.oop.innerclass;

import java.util.ArrayList;
import java.util.List;

public class Order
{

  private int orderId;

  private List<OrderDetail> details;

  public Order()
  {
    details = new ArrayList<>();
    this.init();
  }

  public Order( int orderId )
  {
    this();
    this.orderId = orderId;
  }

  protected void init()
  {
    System.out.println( "Creando order" );

  }

  public static class OrderDetail
  {
    private String sku;
    private int quantity;
    private double price;

    public String getSku()
    {
      return sku;
    }

    public void setSku( String sku )
    {
      this.sku = sku;
    }

    public int getQuantity()
    {
      return quantity;
    }

    public void setQuantity( int quantity )
    {
      this.quantity = quantity;
    }

    public double getPrice()
    {
      return price;
    }

    public void setPrice( double price )
    {
      this.price = price;
    }

    @Override
    public String toString()
    {
      StringBuilder sb = new StringBuilder();
      // sb.append("order:").append(orderId);
      sb.append( "sku=" ).append( this.sku );
      sb.append( ", quantity=" ).append( this.quantity );
      sb.append( ", price=" ).append( this.price );
      return sb.toString();
    }
  }

  public int getOrderId()
  {
    return orderId;
  }

  public void setOrderId( int orderId )
  {
    this.orderId = orderId;
  }

  public List<OrderDetail> getDetails()
  {
    return details;
  }

  public void setDetails( List<OrderDetail> details )
  {
    this.details = details;
  }

  public void add( OrderDetail detail )
  {
    this.details.add( detail );
  }

  public double getSubtotal()
  {
    double subtotal = 0.0;
    for( OrderDetail detail : this.details )
    {
      subtotal += detail.price * detail.quantity;
    }
    return subtotal;
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "orderId: " ).append( this.orderId );
    sb.append( ", details: [" );

    int i = 0;
    for( OrderDetail detail : this.details )
    {
      sb.append( detail );

      if( ++i < this.details.size() )
      {
        sb.append( ", " );
      }

    }
    sb.append( "]" );

    return sb.toString();
  }

}
