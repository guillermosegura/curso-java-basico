package com.axity.course.oop.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable
{

  private static final long serialVersionUID = 5468967851674309518L;

  private Integer id;
  private String name;
  private String contact;
  private String address;
  private String country;
  private String zip;

  public Client()
  {
  }

  public Client( Integer id, String name )
  {
    this.id = id;
    this.name = name;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId( Integer id )
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public String getContact()
  {
    return contact;
  }

  public void setContact( String contact )
  {
    this.contact = contact;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress( String address )
  {
    this.address = address;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( String country )
  {
    this.country = country;
  }

  public String getZip()
  {
    return zip;
  }

  public void setZip( String zip )
  {
    this.zip = zip;
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "id: " ).append( this.id );
    sb.append( ", name: " ).append( this.name );
    sb.append( ", contact: " ).append( this.contact );
    sb.append( ", address: " ).append( this.address );
    sb.append( ", country: " ).append( this.country );
    sb.append( ", zip: " ).append( this.zip );
    return sb.toString();

  }

  @Override
  public boolean equals( Object object )
  {
    boolean isEquals = false;
    if( this == object )
    {
      isEquals = true;
    }
    else if( object != null && object.getClass().equals( this.getClass() ) )
    {
      Client that = (Client) object;
      isEquals = Objects.equals( this.id, that.id );
      isEquals &= Objects.equals( this.name, that.name );
    }

    return isEquals;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash( this.id, this.name );
  }

}
