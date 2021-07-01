package com.axity.course.collections;

import java.util.Objects;

public class Animal implements Comparable<Animal>
{

  protected String name;

  public Animal()
  {
  }

  public Animal( String name )
  {
    this.name = name;
  }

  public void eat()
  {
    System.out.println( "Animal eats" );
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
      isEquals = Objects.equals( this.name, ((Animal) object).name );
    }
    return isEquals;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash( this.name );
  }

  @Override
  public String toString()
  {
    return this.name;
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
  public int compareTo( Animal that )
  {
    int compare = 1;
    if( that != null && that.name != null )
    {
      compare = this.name.compareTo( that.name );
    }

    return compare;
  }

}
