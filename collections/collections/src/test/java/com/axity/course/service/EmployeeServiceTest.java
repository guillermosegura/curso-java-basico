package com.axity.course.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.to.Employee;

public class EmployeeServiceTest
{

  private EmployeeService employeeService;

  @Before
  public void setUp()
  {
    this.employeeService = new EmployeeService();
  }

  @Test
  public void testGetEmployees()
  {
    List<Employee> employees = employeeService.getEmployees();
    assertNotNull( employees );
    assertFalse( employees.isEmpty() );
    employees.stream().forEach( e -> System.out.println( e ) );
  }

}
