package com.axity.course.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.axity.course.exception.BusinessExcepcion;
import com.axity.course.exception.BusinessExcepcionCode;
import com.axity.course.to.Employee;
import com.axity.course.to.Office;

public class EmployeeService
{
  private Map<Integer, Employee> employees;

  public void load()
  {
    loadEmployees();
    OfficeService officeService = new OfficeService();
    employees.values().stream().forEach( e -> {
      e.setOffice( officeService.getOfficeById( e.getOffice().getId() ) );
    } );
  }

  private void loadEmployees()
  {
    employees = new TreeMap<>();

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    try
    {
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      is = loader.getResourceAsStream( "data/employees.csv" );
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
        Employee employee = new Employee();
        employee.setId( Integer.valueOf( parts[0] ) );
        employee.setLastName( parts[1] );
        employee.setFirstName( parts[2] );
        employee.setExtension( parts[3] );
        employee.setEmail( parts[4] );
        Office office = new Office();
        office.setId( parts[5] );
        employee.setOffice( office );
        if( parts[6] != null && NumberUtils.isCreatable( parts[6] ) )
        {
          Employee reportsTo = new Employee();
          reportsTo.setId( Integer.valueOf( parts[6] ) );
          employee.setReportsTo( reportsTo );
        }
        employee.setJobTitle( parts[7] );

        employees.put( employee.getId(), employee );
      }while( line != null );
      br.close();

    }
    catch( IOException e )
    {
      String msg = "Error al abrir el archivo data/employees.csv";
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

    for( Employee employee : employees.values() )
    {
      if( employee.getReportsTo() != null )
      {
        employee.setReportsTo( employees.get( employee.getReportsTo().getId() ) );
      }
    }

  }

  public List<Employee> getEmployees()
  {
    if( this.employees == null )
    {
      this.load();
    }

    return new ArrayList<>( this.employees.values() );
  }

  public Employee getEmployeeById( int id )
  {
    if( this.employees == null )
    {
      this.load();
    }
    
    if( !this.employees.containsKey( id ) )
    {
      String msg = "Empleado no encontrado";
      BusinessExcepcion be = new BusinessExcepcion( msg );
      be.setCode( BusinessExcepcionCode.EMPLOYEE_NOT_FOUND );
      throw be;
    }

    return this.employees.get( id );
  }
}
