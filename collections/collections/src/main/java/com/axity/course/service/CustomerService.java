package com.axity.course.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.axity.course.exception.BusinessExcepcion;
import com.axity.course.exception.BusinessExcepcionCode;
import com.axity.course.to.Address;
import com.axity.course.to.Customer;
import com.axity.course.to.Employee;

public class CustomerService
{
  private Map<Integer, Customer> customers;

  private EmployeeService employeeService;

  public CustomerService()
  {
    employeeService = new EmployeeService();
  }

  public void load()
  {
    loadEmployees();
    // EmployeeService employeeService = new EmployeeService();
    this.customers.values().stream().forEach( c -> {
      if( c.getSalesRepresentative() != null )
      {
        c.setSalesRepresentative( employeeService.getEmployeeById( c.getSalesRepresentative().getId() ) );
      }
    } );

    // for( Customer c : this.customers.values() )
    // {
    // if( c.getSalesRepresentative() != null )
    // {
    // c.setSalesRepresentative( employeeService.getEmployeeById( c.getSalesRepresentative().getId() ) );
    // }
    // }

  }

  private void loadEmployees()
  {
    customers = Collections.synchronizedMap( new TreeMap<>() );

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    try
    {
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      is = loader.getResourceAsStream( "data/customers.csv" );
      isr = new InputStreamReader( is );
      br = new BufferedReader( isr );
      String line = br.readLine();
      do
      {
        line = br.readLine();
        if( line == null )
        {
          continue;
        }
        String[] parts = line.split( "," );
        // CUSTOMERNUMBER,CUSTOMERNAME,CONTACTLASTNAME,CONTACTFIRSTNAME,PHONE,ADDRESSLINE1,ADDRESSLINE2,CITY,STATE,POSTALCODE,COUNTRY,SALESREPEMPLOYEENUMBER,CREDITLIMIT

        int id = Integer.parseInt( parts[0] );

        if( this.customers.containsKey( id ) )
        {
          System.err.println( "Llave duplicada " + id );
          continue;
        }

        Customer customer = new Customer();
        customer.setId( id );
        customer.setName( parts[1] );
        customer.setContactLastName( parts[2] );
        customer.setContactFirstName( parts[3] );
        Address address = new Address();
        address.setPhone( parts[4] );
        address.setAddressLine1( parts[5] );
        address.setAddressLine2( parts[6] );
        address.setCity( parts[7] );
        address.setState( parts[8] );
        address.setZip( parts[9] );
        address.setCountry( parts[10] );

        customer.setAddress( address );
        if( NumberUtils.isCreatable( parts[11] ) )
        {
          Employee salesRepresentative = new Employee();
          salesRepresentative.setId( Integer.valueOf( parts[11] ) );
          customer.setSalesRepresentative( salesRepresentative );
        }
        customer.setCreditLimit( new BigDecimal( parts[12] ) );

        this.customers.put( customer.getId(), customer );

      }while( line != null );
      br.close();

    }
    catch( IOException e )
    {
      String msg = "Error al abrir el archivo data/customers.csv";
      BusinessExcepcion be = new BusinessExcepcion( msg, e );
      be.setCode( BusinessExcepcionCode.FILE_NOT_FOUND );
      throw be;
    }
    finally
    {
      IOUtils.closeQuietly( br );
      IOUtils.closeQuietly( isr );
      IOUtils.closeQuietly( is );
    }

  }

  public List<Customer> getCustomers()
  {
    if( this.customers == null )
    {
      this.load();
    }

    // return new ArrayList<>( this.customers.values() );
    // return Collections.unmodifiableList( new ArrayList<>( this.customers.values() ) );
    return Collections.synchronizedList( new ArrayList<>( this.customers.values() ) );
  }

  public Customer getCustomerById( int id )
  {
    if( this.customers == null )
    {
      this.load();
    }

    if( !this.customers.containsKey( id ) )
    {
      String msg = "Cliente no encontrado";
      BusinessExcepcion be = new BusinessExcepcion( msg );
      be.setCode( BusinessExcepcionCode.CUSTOMER_NOT_FOUND );
      throw be;
    }

    return this.customers.get( id );
  }
}
