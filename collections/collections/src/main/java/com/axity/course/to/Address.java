package com.axity.course.to;

import java.io.Serializable;

public class Address implements Serializable
{
  private static final long serialVersionUID = -9158828305171762217L;
  private String phone;
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String country;
  private String zip;
  public String getPhone()
  {
    return phone;
  }

  public void setPhone( String phone )
  {
    this.phone = phone;
  }

  public String getAddressLine1()
  {
    return addressLine1;
  }

  public void setAddressLine1( String addressLine1 )
  {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2()
  {
    return addressLine2;
  }

  public void setAddressLine2( String addressLine2 )
  {
    this.addressLine2 = addressLine2;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( String city )
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( String country )
  {
    this.country = country;
  }

  public String getState()
  {
    return state;
  }

  public void setState( String state )
  {
    this.state = state;
  }

  public String getZip()
  {
    return zip;
  }

  public void setZip( String zip )
  {
    this.zip = zip;
  }

}
