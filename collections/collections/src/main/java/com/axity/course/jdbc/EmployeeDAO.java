package com.axity.course.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.axity.course.exception.BusinessExcepcion;
import com.axity.course.exception.BusinessExcepcionCode;
import com.axity.course.to.Employee;
import com.axity.course.to.Office;

public class EmployeeDAO
{
  private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
  private static final String USER = "sa";
  private static final String PASS = "sa";

  public List<Employee> findEmployees()
  {
    Connection conn = conn();
    Statement st = null;
    List<Employee> employees = null;
    try
    {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery( "SELECT * FROM employees ORDER BY EMPLOYEENUMBER" );
      employees = new ArrayList<>();
      while( rs.next() )
      {
        Employee employee = extractEmployee( rs );
        employees.add( employee );
      }

    }
    catch( SQLException e )
    {
      BusinessExcepcion be = new BusinessExcepcion( "Error al crear la conexión a la BD", e );
      be.setCode( BusinessExcepcionCode.DB_CONNECTION_ERROR );
      throw be;
    }
    finally
    {
      JdbcUtil.close( st );
      JdbcUtil.close( conn );
    }

    return employees;
  }

  private Connection conn()
  {
    Connection conn;
    try
    {
      conn = DriverManager.getConnection( DB_URL, USER, PASS );
    }
    catch( SQLException e )
    {
      BusinessExcepcion be = new BusinessExcepcion( "Error al crear la conexión a la BD", e );
      be.setCode( BusinessExcepcionCode.DB_CONNECTION_ERROR );
      throw be;
    }
    return conn;
  }

  public Employee findEmployeeById( String officeCode )
  {
    Connection conn = conn();
    PreparedStatement ps = null;
    Employee employee = null;
    try
    {

      ps = conn.prepareStatement( "SELECT * FROM employees WHERE EMPLOYEENUMBER = ?" );
      ps.setString( 1, officeCode );
      ResultSet rs = ps.executeQuery();
      if( rs.next() )
      {
        employee = extractEmployee( rs );
      }
      else
      {
        String msg = "Oficina no encontrado";
        BusinessExcepcion be = new BusinessExcepcion( msg );
        be.setCode( BusinessExcepcionCode.OFFICE_NOT_FOUND );
        throw be;
      }

    }
    catch( SQLException e )
    {
      BusinessExcepcion be = new BusinessExcepcion( "Error al crear la conexión a la BD", e );
      be.setCode( BusinessExcepcionCode.DB_CONNECTION_ERROR );
      throw be;
    }
    finally
    {
      JdbcUtil.close( ps );
      JdbcUtil.close( conn );
    }

    return employee;
  }

  private Employee extractEmployee( ResultSet rs ) throws SQLException
  {
    //﻿EMPLOYEENUMBER,LASTNAME,FIRSTNAME,EXTENSION,EMAIL,OFFICECODE,REPORTSTO,JOBTITLE  
    Employee employee = new Employee();
    employee.setId( rs.getInt( "EMPLOYEENUMBER" ) );
    employee.setLastName( rs.getString( "LASTNAME" ) );
    employee.setFirstName( rs.getString( "FIRSTNAME" ) );
    employee.setExtension( rs.getString( "EXTENSION" ) );
    employee.setEmail( rs.getString( "EMAIL" ) );
    employee.setJobTitle( rs.getString( "JOBTITLE" ) );
    int reportsToId = rs.getInt( "REPORTSTO" );
    if (reportsToId != 0) {
      Employee reportsTo = new Employee();
      reportsTo.setId( reportsToId );
      employee.setReportsTo( reportsTo );
    }
    Office office = new Office();
    office.setId( rs.getString( "OFFICECODE" )  );
    employee.setOffice( office  );

    return employee;
  }

}
