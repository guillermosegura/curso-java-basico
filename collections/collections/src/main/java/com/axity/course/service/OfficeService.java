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

import com.axity.course.exception.BusinessExcepcion;
import com.axity.course.exception.BusinessExcepcionCode;
import com.axity.course.to.Address;
import com.axity.course.to.Office;

public class OfficeService
{
  private Map<String, Office> offices;

  public void load()
  {
    loadOffices();
    
  }

  private void loadOffices()
  {
    offices = new TreeMap<>();

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    try
    {
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      is = loader.getResourceAsStream( "data/offices.csv" );
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
        Office office = new Office();
        office.setId( parts[0] );
        Address address = new Address();
        address.setCity( parts[1] );
        address.setPhone( parts[2] );
        address.setAddressLine1( parts[3] );
        address.setAddressLine2( parts[4] );
        address.setState( parts[5] );
        address.setCountry( parts[6] );
        address.setZip( parts[7] );
        office.setAddress( address );
        office.setTerritory( parts[8] );

        this.offices.put( office.getId(), office );
      }while( line != null );
      br.close();

    }
    catch( IOException e )
    {
      String msg = "Error al abrir el archivo data/offices.csv";
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

  public List<Office> getOffices()
  {
    if( this.offices == null )
    {
      this.load();
    }

    return new ArrayList<>( this.offices.values() );
  }

  public Office getOfficeById( String id )
  {
    if( this.offices == null )
    {
      this.load();
    }
    
    if( !this.offices.containsKey( id ) )
    {
      String msg = "Oficina no encontrado";
      BusinessExcepcion be = new BusinessExcepcion( msg );
      be.setCode( BusinessExcepcionCode.OFFICE_NOT_FOUND );
      throw be;
    }
    
    return this.offices.get( id );
  }
}
