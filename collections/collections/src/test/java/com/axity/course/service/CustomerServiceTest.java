package com.axity.course.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

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
