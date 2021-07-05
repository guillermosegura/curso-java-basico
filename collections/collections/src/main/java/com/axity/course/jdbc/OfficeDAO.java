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
import com.axity.course.to.Address;
import com.axity.course.to.Office;

public class OfficeDAO
{
  private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
  private static final String USER = "sa";
  private static final String PASS = "sa";

  public List<Office> findOffices()
  {
    Connection conn = conn();
    Statement st = null;
    List<Office> offices = null;
    try
    {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery( "SELECT * FROM offices ORDER BY OFFICECODE" );
      offices = new ArrayList<>();
      while( rs.next() )
      {
        Office office = extractOffice( rs );
        offices.add( office );
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

    return offices;
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

  public Office findOfficeById( String officeCode )
  {
    Connection conn = conn();
    PreparedStatement ps = null;
    Office office = null;
    try
    {

      ps = conn.prepareStatement( "SELECT * FROM offices WHERE OFFICECODE = ?" );
      ps.setString( 1, officeCode );
      ResultSet rs = ps.executeQuery();
      if( rs.next() )
      {
        office = extractOffice( rs );
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

    return office;
  }

  private Office extractOffice( ResultSet rs ) throws SQLException
  {
    Office office;
    office = new Office();
    office.setId( rs.getString( "OFFICECODE" ) );
    Address address = new Address();
    address.setCity( rs.getString( "CITY" ) );
    address.setPhone( rs.getString( "PHONE" ) );
    address.setAddressLine1( rs.getString( "ADDRESSLINE1" ) );
    address.setAddressLine2( rs.getString( "ADDRESSLINE2" ) );
    address.setState( rs.getString( "STATE" ) );
    address.setCountry( rs.getString( "COUNTRY" ) );
    address.setZip( rs.getString( "POSTALCODE" ) );
    office.setAddress( address );
    office.setTerritory( rs.getString( "TERRITORY" ) );
    return office;
  }

}
