package com.axity.course.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class IOTest
{

  @Test
  public void carpetas() throws IOException
  {
    File carpeta1 = new File( "c:\\temp\\carpeta1" );
    System.out.println( carpeta1.isDirectory() );

    File carpeta2 = new File( "c:\\temp\\carpeta2" );
    System.out.println( carpeta2.isDirectory() );

    File carpeta3 = new File( "c:\\temp\\carpeta3" );
    System.out.println( carpeta3.isDirectory() );

    File file1 = new File( carpeta1, "file1.txt" );
    file1.createNewFile();

    File temp = File.createTempFile( "nombre", ".txt", carpeta1 );
    temp.deleteOnExit();
    System.out.println( File.separator );
    System.out.println( File.pathSeparator );
  }

  @Test
  public void readFileInputStream() throws IOException
  {
    File lorem = new File( "c:\\temp\\carpeta1\\lorem.txt" );

    InputStream is = new FileInputStream( lorem );

    while( true )
    {
      byte[] buffer = new byte[256];
      int bytesReaded = is.read( buffer );

      if( bytesReaded == -1 )
      {
        break;
      }
      System.out.println( bytesReaded );
      System.out.println( new String( buffer ) );
    }
    is.close();

  }

  @Test
  public void writeFileOutputStream() throws IOException
  {
    File lorem = new File( "c:\\temp\\carpeta1\\lorem_out.txt" );

    String data = "[%d] - Lorem ipsum dolor sit amet" + System.lineSeparator();

    boolean append = false;
    OutputStream os = new FileOutputStream( lorem, append );
    for( int i = 0; i < 10; i++ )
    {
      os.write( String.format( data, i ).getBytes() );
    }

    os.close();

  }

  @Test
  public void printStream() throws IOException
  {
    File lorem = new File( "c:\\temp\\carpeta1\\lorem_out.txt" );

    String data = "[ps:%d] - Lorem ipsum dolor sit amet";

    boolean append = false;
    PrintStream ps = new PrintStream( new FileOutputStream( lorem, append ) );
    for( int i = 0; i < 10; i++ )
    {
      ps.println( String.format( data, i ) );
    }

    ps.close();

  }
}
