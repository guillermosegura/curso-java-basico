package com.axity.course.io;

import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrintWriterTest
{

  @Test
  public void test() throws IOException
  {
    FileWriter archivo = null;
    PrintWriter pw = null;
    archivo = new FileWriter( "c:\\temp\\carpeta3\\archivo.txt" );

    pw = new PrintWriter( archivo );

    for( int i = 0; i < 10; i++ )
    {
      pw.println( "L\u00ednea " + i );
    }

    pw.close();
  }

}
