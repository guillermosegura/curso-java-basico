package com.axity.course.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SetTest
{

  private Set<Integer> set;
  @Before
  public void setUp() throws Exception
  {
    set = new HashSet<>(
        Arrays.asList( 66, 86, 44, 53, 49, 49, 99, 17, 88, 8, 29, 79, 40, 10, 19, 75, 39, 90, 78, 53, 82, 28, 61, 71,
          94, 92, 71, 90, 55, 38, 55, 28, 43, 17, 90, 14, 16, 17, 96, 82, 22, 28, 19, 8, 80, 33, 65, 56, 83, 54 ) );
  }

  @Test
  public void test()
  {
    System.out.println( set.size() );
    print( set );
    set.add( 13 );
    set.add( 1 );
    set.add( 11 );
    set.add( 12 );
    print( set );

    List<Integer> list = Arrays.asList( 6, 7, 8, 9, 10, 12, 13, 15, 120, 12, 14, 1, 5, 3, 6, 7 );

    System.out.println( "Todos en set:" + set.containsAll( Arrays.asList( 1, 8, 10, 15 ) ) );

//    for( int i : list )
//    {
//      if( set.contains( i ) )
//      {
//        System.out.println( String.format( "Ya fue procesado %d", i ) );
//      }
//      else
//      {
//        set.add( i );
//        print( i, set );
//      }
//    }
    
    set.addAll( list );
    print( set );
  }

  private static <T> void print( Collection<T> col )
  {
    print( null, col );
  }

  private static <T> void print( T t, Collection<T> col )
  {
    if( t != null )
    {
      System.out.print( String.format( "Elemento: %d -> ", t ) );
    }
    col.forEach( e -> System.out.print( e + ", " ) );
    System.out.println();
  }

  @Test
  public void test2()
  {

    Set<Animal> animales = new TreeSet<>(new AnimalComparator()  );
    
    //new AnimalComparator() 

    animales.add( new Cat( "Figaro" ) );
    animales.add( new Cat( "Felix" ) );
    animales.add( new Cat( "Ditto" ) );
    animales.add( new Cat( "Romualdo" ) );
    animales.add( new Cat( "Garfield" ) );

    animales.add( new Dog( "Basty" ) );
    animales.add( new Dog( "Tachito" ) );
    animales.add( new Dog( "Scooby" ) );
    animales.add( new Dog( "Scrappy" ) );

    print( animales );

  }
}
