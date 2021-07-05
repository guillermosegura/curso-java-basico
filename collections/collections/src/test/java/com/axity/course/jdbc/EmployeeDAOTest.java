package com.axity.course.jdbc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.to.Employee;
import com.axity.course.to.Office;

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
    String[] ids = { "1002", "1056", "1076", "1088", "1102" };
    for( String id : ids )
    {
      Employee employee = this.employeeDAO.findEmployeeById( id );
      assertNotNull( employee );
      System.out.println( employee );
    }
  }

}
