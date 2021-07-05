package com.axity.course.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Customer implements Serializable
{

  private static final long serialVersionUID = -3051765424703896558L;
  private Integer id;
  private String name;
  private String contactFirstName;
  private String contactLastName;
  private Address address;
  private Employee salesRepresentative;
  private BigDecimal creditLimit;

  public Customer()
  {
  }

  public Customer( Integer id, String name )
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

  public String getContactFirstName()
  {
    return contactFirstName;
  }

  public void setContactFirstName( String contactFirstName )
  {
    this.contactFirstName = contactFirstName;
  }

  public String getContactLastName()
  {
    return contactLastName;
  }

  public void setContactLastName( String contactLastName )
  {
    this.contactLastName = contactLastName;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setAddress( Address address )
  {
    this.address = address;
  }

  public Employee getSalesRepresentative()
  {
    return salesRepresentative;
  }

  public void setSalesRepresentative( Employee salesRepresentative )
  {
    this.salesRepresentative = salesRepresentative;
  }

  public BigDecimal getCreditLimit()
  {
    return creditLimit;
  }

  public void setCreditLimit( BigDecimal creditLimit )
  {
    this.creditLimit = creditLimit;
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
      Customer that = (Customer) object;
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

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "id: " ).append( this.id );
    sb.append( ", name: " ).append( this.name );
    sb.append( ", contactFirstName: " ).append( this.contactFirstName );
    sb.append( ", contactLastName: " ).append( this.contactLastName );
    if( this.address != null )
    {
      sb.append( ", country: " ).append( this.address.getCountry() );
      sb.append( ", city: " ).append( this.address.getCity() );
      sb.append( ", zip: " ).append( this.address.getZip() );
    }
    if( this.salesRepresentative != null )
    {
      sb.append( ", salesRepresentative: [" ).append( this.salesRepresentative.getFirstName() );
      sb.append( " " ).append( this.salesRepresentative.getLastName() ).append( "]" );
    }
    return sb.toString();

  }

}
