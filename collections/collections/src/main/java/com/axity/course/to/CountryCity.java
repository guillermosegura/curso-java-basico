package com.axity.course.to;

import java.util.Objects;

public class CountryCity implements Comparable<CountryCity>
{
  private String city;
  private String country;

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
      CountryCity that = (CountryCity) object;
      isEquals = Objects.equals( this.country, that.country );
      isEquals &= Objects.equals( this.city, that.city );
    }

    return isEquals;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash( this.country, this.city );
  }

  @Override
  public String toString()
  {
    return this.country + ", " + this.city;
  }

  @Override
  public int compareTo( CountryCity that )
  {

    int compare = 1;

    if( that != null )
    {
      if( this.country != null )
      {
        if( that.country != null )
        {
          compare = this.country.compareTo( that.country );
        }
        else
        {
          compare = 1;
        }
      }
      else
      {
        compare = -1;
      }

      if( compare == 0 )
      {
        if( this.city != null )
        {
          if( that.city != null )
          {
            compare = this.city.compareTo( that.city );
          }
          else
          {
            compare = 1;
          }
        }
        else
        {
          compare = -1;
        }

      }

    }

    return compare;
  }
}
