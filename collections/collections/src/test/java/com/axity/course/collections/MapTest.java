package com.axity.course.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class MapTest
{

  private Map<ID, String> map;

  @Before
  public void setUp()
  {
    String[] names = { "alfa", "beta", "gamma" };
    map = new TreeMap<>();
    for( int i = 0; i < 20; i++ )
    {
      map.put( new ID( i, names[i % 3] ), "QWERTY" + i );
    }

  }

  @Test
  public void test()
  {
    // System.out.println( map.size() );
    //
    // for( ID i : map.keySet() )
    // {
    // System.out.println( i );
    // }
    // System.out.println();
    // System.out.println( "Valores" );
    // for( String value : map.values() )
    // {
    // System.out.println( value );
    // }

    for( ID i : map.keySet() )
    {
      String value = map.get( i );
      System.out.println( "ID:" + i + ", value:" + value );
    }

    for( Entry<ID, String> entry : map.entrySet() )
    {
      System.out.println( "ID:" + entry.getKey() + ", value:" + entry.getValue() );
    }

  }

}
