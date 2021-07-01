package com.axity.course.to;

public class OrderTotal
{
  private String clientName;
  private Integer orderId;
  private String country;
  private double total;
  public String getClientName()
  {
    return clientName;
  }

  public void setClientName( String clientName )
  {
    this.clientName = clientName;
  }

  public Integer getOrderId()
  {
    return orderId;
  }

  public void setOrderId( Integer orderId )
  {
    this.orderId = orderId;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( String country )
  {
    this.country = country;
  }

  public double getTotal()
  {
    return total;
  }

  public void setTotal( double total )
  {
    this.total = total;
  }

  @Override
  public String toString()
  {
    return String.format( "orderId:%d, client:%s, country:%s, total: %.2f", this.orderId, this.clientName, this.country,
      this.total );
  }
}
