package com.axity.course.service;

import java.util.function.Supplier;

import com.axity.course.to.CountryCity;
import com.axity.course.to.Customer;

public class AddressUtil
{

  public CountryCity transform2CountryCity( Customer c )
  {
    CountryCity cc = new CountryCity();
    cc.setCity( c.getAddress().getCity() );
    cc.setCountry( c.getAddress().getCountry() );
    return cc;
  }
  
  public static Supplier<CountryCity> dummy = () -> {
    CountryCity dummy = new CountryCity();
    dummy.setCity( "dummy" );
    dummy.setCountry( "dummy" );
    return dummy;
  };
}
