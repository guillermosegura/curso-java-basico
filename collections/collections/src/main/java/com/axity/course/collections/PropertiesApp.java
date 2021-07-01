package com.axity.course.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesApp
{

  public static void main( String[] args ) throws IOException
  {
    PropertiesApp app = new PropertiesApp();
    
    
    Properties p = new Properties();
    p.setProperty( "key", "valor" );
    
    for( Entry<Object, Object> entry : p.entrySet() )
    {
      System.out.println( entry.getKey() + " : " + entry.getValue() );
    }
    

//     app.writeXML(app);
//     app.writeProperties( app );
//    Properties properties = app.load();
//    for( Entry<Object, Object> entry : properties.entrySet() )
//    {
//      System.out.println( entry.getKey() + " : " + entry.getValue() );
//    }
//    System.out.println( "------" );
//    System.out.println( properties.getProperty( "message" ) );
//    System.out.println( properties.getProperty( "message1", "undefined" ) );
  }

  private void writeXML( PropertiesApp app ) throws IOException, FileNotFoundException
  {
    Properties properties = app.load();

    for( Entry<Object, Object> entry : properties.entrySet() )
    {
      System.out.println( entry.getKey() + " : " + entry.getValue() );
    }
    File fd = new File( "a.xml" );
    FileOutputStream fos = new FileOutputStream( fd );

    properties.storeToXML( fos, "Un comentario" );
    fos.close();
  }
  
  private void writeProperties( PropertiesApp app ) throws IOException, FileNotFoundException
  {
    Properties properties = app.load();

    for( Entry<Object, Object> entry : properties.entrySet() )
    {
      System.out.println( entry.getKey() + " : " + entry.getValue() );
    }
    File fd = new File( "a.properties" );
    FileOutputStream fos = new FileOutputStream( fd );

    properties.store( fos, "Un comentario" );
    fos.close();
  }

  private Properties load() throws IOException
  {
    Properties properties = new Properties();

    InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream( "data.properties" );

    properties.load( is );
    return properties;
  }

}
