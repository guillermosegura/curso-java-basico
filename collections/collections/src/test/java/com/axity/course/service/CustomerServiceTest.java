package com.axity.course.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.to.CountryCity;
import com.axity.course.to.Customer;

public class CustomerServiceTest
{

  private CustomerService customerService;

  @Before
  public void setUp()
  {
    this.customerService = new CustomerService();
  }

  @Test
  public void testGetCustomers()
  {
    List<Customer> customers = customerService.getCustomers();
    assertNotNull( customers );
    assertFalse( customers.isEmpty() );
    customers.stream().forEach( e -> System.out.println( e ) );
    System.out.println( "Tamaño : " + customers.size() );

    List<Customer> nuevaLista = new LinkedList<>( customers );
    try
    {
      nuevaLista.clear();
      System.out.println( "Nueva lista " + nuevaLista.isEmpty() );
    }
    catch( RuntimeException e )
    {
      e.printStackTrace();
    }
  }

  @Test
  public void testCustomers_USA_California()
  {
    List<Customer> customers = customerService.getCustomers();

    List<Customer> usaCustomers = customers.stream()
        .filter( c -> c.getAddress().getCountry().equals( "USA" ) && c.getAddress().getState().equals( "CA" ) )
        .collect( Collectors.toList() );

    usaCustomers.stream().forEach( c -> System.out.println( c ) );
  }

  @Test
  public void testAddresses()
  {
    List<Customer> customers = customerService.getCustomers();

    AddressUtil t = new AddressUtil();

    List<CountryCity> data = customers.stream().map( c -> {
      return t.transform2CountryCity( c );
    } ).collect( Collectors.toList() );

    data = customers.stream().map( c -> t.transform2CountryCity( c ) ).collect( Collectors.toList() );

    data = customers.stream().map( t::transform2CountryCity ).collect( Collectors.toList() );

    data.stream().distinct().sorted().forEach( System.out::println );

    System.out.println( "-----" );
    CountryCity countryCity = data.stream().filter( c -> c.getCountry().equals( "UNKOWN" ) ).findFirst()
        .orElse( getDummy() );
    System.out.println( countryCity );

    System.out.println( "-----" );
    countryCity = data.stream().filter( c -> c.getCountry().equals( "UNKOWN" ) ).findFirst()
        .orElseGet( AddressUtil.dummy );
    System.out.println( countryCity );

  }

  private CountryCity getDummy()
  {
    CountryCity dummy = new CountryCity();
    dummy.setCity( "dummy" );
    dummy.setCountry( "dummy" );
    return dummy;
  }

  @Test
  public void testGetCustomer()
  {
    int[] ids = { 363, 369, 376 };
    for( int id : ids )
    {
      Customer customer = this.customerService.getCustomerById( id );
      assertNotNull( customer );
    }
  }
}
