package com.axity.course.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MyClase
{

  public static void main( String[] args ) 
  {

    File file = new File("example.txt");
    try
    {
      
      URL url = new URL( "htp://google.com" );
      
      FileOutputStream fos = new FileOutputStream(file);
      
      
    }
    catch( FileNotFoundException |  MalformedURLException e )
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
