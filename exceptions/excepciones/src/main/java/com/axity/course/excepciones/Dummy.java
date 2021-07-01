package com.axity.course.excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dummy
{
  private static final Logger LOG = LoggerFactory.getLogger( Dummy.class );

  @SuppressWarnings("deprecation")
  public static void main( String[] args )
  {
    Date date = new Date( 2021, 5, 22 );
    LOG.info( date.toGMTString() );

    try
    {
      openFile();
    }
    catch( BusinessExcepcion e )
    {
      LOG.error( e.getMessage() );
      LOG.error( e.getLocalizedMessage(), e );
    }
    finally
    {
      LOG.info( "Fin del método main" );
    }

  }

  private static void openFile()
  {
    File file = null;
    FileInputStream fis = null;
    FileWriter writer = null;
    try
    {
      file = new File( "c:/tm/a.txt" );
      fis = new FileInputStream( file );
      writer = new FileWriter( file );
    }
    catch( IOException e )
    {
      BusinessExcepcion be = new BusinessExcepcion( "Ooops", e );
      be.setCode( BusinessExcepcionCode.FILE_NOT_FOUND );
      be.setUuid( UUID.randomUUID().toString() );
      throw be;
    }
    finally
    {
      closeFis( fis );
      closeWriter( writer );
      LOG.info( "Fin del método openFile" );
    }

  }

  private static void closeWriter( FileWriter writer )
  {
    try
    {
      if( writer != null )
      {
        writer.close();
      }
    }
    catch( IOException e )
    {
      LOG.error( "Error al cerrar el writer" );
    }
    finally
    {
      LOG.info( "Termina closeWriter" );
    }

  }

  private static void closeFis( FileInputStream fis )
  {

    try
    {
      if( fis != null )
      {
        fis.close();
      }
    }
    catch( IOException e )
    {
      LOG.error( "No se pudo cerrar fis" );
    }
    finally
    {
      LOG.info( "Termina closeFis" );
    }
  }

}
