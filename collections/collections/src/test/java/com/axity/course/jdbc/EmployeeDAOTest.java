package com.axity.course.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.exception.BusinessExcepcion;
import com.axity.course.exception.BusinessExcepcionCode;
import com.axity.course.to.Employee;

public class EmployeeDAOTest
{

  private EmployeeDAO employeeDAO;

  @Before
  public void setUp()
  {
    employeeDAO = new EmployeeDAO();
  }

  @Test
  public void testFindEmployees()
  {
    List<Employee> employees = this.employeeDAO.findEmployees();
    assertNotNull( employees );
    assertFalse( employees.isEmpty() );
    employees.stream().forEach( e -> System.out.println( e ) );
  }

  @Test
  public void testFindEmployeeById()
  {
    int[] ids = { 1002, 1056, 1076, 1088, 1102 };
    for( int id : ids )
    {
      Employee employee = this.employeeDAO.findEmployeeById( id );
      assertNotNull( employee );
      System.out.println( employee );
    }
  }

  @Test(expected = BusinessExcepcion.class)
  public void testFindEmployeeById_nonExistent()
  {
    try
    {
      this.employeeDAO.findEmployeeById( 9999 );
      fail( "It should never ever get here!" );
    }
    catch( BusinessExcepcion be )
    {
      assertEquals( BusinessExcepcionCode.EMPLOYEE_NOT_FOUND, be.getCode() );
      throw be;
    }
  }

}
