package com.axity.course.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferTest
{

  @Test
  public void test() throws IOException
  {
    File fd = new File( "c:\\temp\\carpeta2\\archivo.txt" );
    FileWriter fw = new FileWriter( fd );

    FileReader fr = new FileReader( fd );

    BufferedReader br = new BufferedReader( fr );
    BufferedWriter bw = new BufferedWriter( fw );

    String data = "Person of interest [%d]" + System.lineSeparator();
    for( int i = 0; i < 10; i++ )
    {
      bw.write( String.format( data, i ) );
    }

    bw.close();

    String line;

    while( (line = br.readLine()) != null )
    {
      System.out.println( line );
    }

    fr.close();
  }

}
