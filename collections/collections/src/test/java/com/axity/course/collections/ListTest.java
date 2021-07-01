package com.axity.course.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ListTest
{

  private List<Integer> list;

  private List<Animal> animales;

  @Before
  public void setUp() throws Exception
  {
    Random r = new Random();
    // list = r.ints( 1, 100 ).limit( 50 ).collect( ArrayList::new, ArrayList::add, ArrayList::addAll );
    list = new ArrayList<>(
        Arrays.asList( 66, 86, 44, 53, 49, 49, 99, 17, 88, 8, 29, 79, 40, 10, 19, 75, 39, 90, 78, 53, 82, 28, 61, 71,
          94, 92, 71, 90, 55, 38, 55, 28, 43, 17, 90, 14, 16, 17, 96, 82, 22, 28, 19, 8, 80, 33, 65, 56, 83, 54 ) );

    animales = new LinkedList<>();

    animales.add( new Cat( "Figaro" ) );
    animales.add( new Cat( "Felix" ) );
    animales.add( new Cat( "Ditto" ) );
    animales.add( new Cat( "Romualdo" ) );
    animales.add( new Cat( "Garfield" ) );

    animales.add( new Dog( "Basty" ) );
    animales.add( new Dog( "Tachito" ) );
    animales.add( new Dog( "Scooby" ) );
    animales.add( new Dog( "Scrappy" ) );
  }

  @Test
  public void test()
  {
    // System.out.println( this.list.size() );
    // System.out.println( this.list.isEmpty() );

    printList( this.list );

    System.out.println( "-----" );
    list.add( 99 );
    list.add( 111 );
    list.add( 100 );

    list.addAll( Arrays.asList( 200, 205, 215, 214 ) );

    list.addAll( 10, Arrays.asList( 304, 305, 315, 314 ) );
    printList( this.list );

    // System.out.println( this.list.size() );

    System.out.println( "-------------" );

    Collections.sort( list );

    printList( this.list );

    System.out.println( "-------------" );

    Collections.shuffle( list );

    printList( this.list );

    if( true )
      return;

    List<Integer> listSync = Collections.synchronizedList( list );
    System.out.println( listSync.getClass().getCanonicalName() );

    printList( listSync );
    System.out.println();
    System.out.println( "---------" );

    // System.out.println( "list.get(10) = " + list.get( 10 ) );

    int pageSize = 10;
    int limit = listSync.size() / pageSize;
    if( listSync.size() % pageSize > 0 )
    {
      limit++;
    }
    for( int page = 0; page < limit; page++ )
    {

      int init = page * pageSize;
      int end = init + pageSize;
      if( end > listSync.size() )
      {
        end = listSync.size();
      }
      System.out.println( String.format( "Página %d [%d-%d]", page, init, end ) );
      List<Integer> sublista = listSync.subList( init, end );

      printList( sublista );
    }

  }

  private void printList( List<Integer> list )
  {
    int i = 0;
    // System.out.print( "\t" );
    for( int n : list )
    {
      System.out.print( n );
      if( ++i == 10 )
      {
        System.out.println( "\t" );
        i = 0;
      }
      else
      {
        System.out.print( ", " );
      }
    }
  }

  @Test
  public void testListObjects()
  {

//    Collections.shuffle( animales );
//    print( animales );
//
//    Collections.sort( animales, new AnimalComparator() );
//
//    print( animales );
//
//    Collections.sort( animales );
//
//    print( animales );
//
//    System.out.println( "--------" );
//
//    if( true )
//      return;
//    for( Animal a : animales )
//    {
//      System.out.println( a );
//    }

    System.out.println( animales.size() );

    animales.add( new Dog( "Juanito" ) );
    System.out.println( animales.size() );

    System.out.println( animales.contains( new Dog( "Scooby" ) ) );

    System.out.println( animales.contains( new Dog( "Tobias" ) ) );

    String[] perros = { "Scooby", "Tobias" };

    for( String nombre : perros )
    {
      Dog dog = new Dog( nombre );
      if( animales.contains( dog ) )
      {
        int index = animales.indexOf( dog );
        System.out.println( animales.get( index ) );
      }
      else
      {
        System.out.println( "No está" );
      }
    }

  }

  @Test
  @Ignore
  public void testListCollections()
  {
    System.out.println( animales.size() );

    // List<Animal> otros = new ArrayList<>();
    // otros.addAll( animales );

    List<Animal> otros = new ArrayList<>( animales );

    otros.clear();
    try
    {
      otros.get( 5 );
    }
    catch( RuntimeException e )
    {
      e.printStackTrace();
    }
    System.out.println( "otros.size()=" + otros.size() );
    System.out.println( "otros.isEmpty()=" + otros.isEmpty() );
    System.out.println( "animales.size()=" + animales.size() );
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
}
