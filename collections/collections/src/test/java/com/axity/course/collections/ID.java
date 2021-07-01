package com.axity.course.collections;

import java.util.Objects;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class ID implements Comparable<ID>
{

  private int id;
  private String name;
  public ID()
  {
  }

  public ID( int id, String name )
  {
    this.id = id;
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  public void setId( int id )
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
      isEquals = Objects.equals( this.id, ((ID) object).id );
      isEquals &= Objects.equals( this.name, ((ID) object).name );
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
    return "id:" + id + ", name:" + this.name;
  }

  @Override
  public int compareTo( ID that )
  {
    return new CompareToBuilder()
        .append( this.name, that.name )
        .append( this.id, that.id )
        .toComparison();
  }

}
