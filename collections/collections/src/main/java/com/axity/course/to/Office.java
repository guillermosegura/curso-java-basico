package com.axity.course.to;

import java.io.Serializable;
import java.util.Objects;

public class Office implements Serializable
{

  private static final long serialVersionUID = -9201688410785105176L;
  private String id;
  private Address address;
  private String territory;
  
  
  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setAddress( Address address )
  {
    this.address = address;
  }

  public String getTerritory()
  {
    return territory;
  }

  public void setTerritory( String territory )
  {
    this.territory = territory;
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
      Office that = (Office) object;
      isEquals = Objects.equals( this.id, that.id );
    }

    return isEquals;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash( this.id );
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "id: " ).append( this.id );

    if( this.address != null )
    {
      sb.append( ", country: " ).append( this.address.getCountry() );
      sb.append( ", city: " ).append( this.address.getCity() );
      sb.append( ", zip: " ).append( this.address.getZip() );
      sb.append( ", territory: " ).append( this.territory );
    }

    return sb.toString();

  }
}
