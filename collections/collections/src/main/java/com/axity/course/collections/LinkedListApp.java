package com.axity.course.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.axity.course.to.Order;

public class LinkedListApp
{

  public static void main( String[] args )
  {
    // queue();
    // deque();
    // stack();
    list();

    Order order = emptyOrder.get();
    order = new Order();
  }

  private static void list()
  {
    Random r = new Random();
    List<Integer> list = r.ints( 0, 100 ).limit( 100 ).collect( LinkedList::new, LinkedList::push, LinkedList::addAll );

    List<List<Integer>> aleatorios = new ArrayList<>();

    for( int i = 0; i < 10; i++ )
    {
      int start = i * 10;
      int end = start + 9;
      List<Integer> listAleatorios = list.stream().filter( x -> x >= start && x < end ).collect( Collectors.toList() );
      aleatorios.add( listAleatorios );
    }

    aleatorios.stream().forEach( l -> {
      l.stream().forEach( e -> {
        System.out.print( e + ", " );
      } );
      System.out.println();
    } );
    System.out.println( "---------------" );
    for( List<Integer> listAleatorios : aleatorios )
    {
      for( Integer e : listAleatorios )
      {
        System.out.print( e + ", " );
      }
      System.out.println();
    }
    System.out.println( "---------------" );
    for( int i = 0; i < aleatorios.size(); i++ )
    {
      for( int j = 0; j < aleatorios.get( i ).size(); j++ )
      {
        System.out.print( aleatorios.get( i ).get( j ) + ", " );
      }
      System.out.println();
    }
  }

  private static void stack()
  {
    Deque<Integer> stack = new LinkedList<>();
    stack.push( 9 );
    print( stack );
    stack.push( 8 );
    print( stack );
    stack.push( 7 );
    print( stack );
    stack.push( 6 );
    print( stack );
    stack.push( 5 );
    print( stack );
    stack.push( 4 );
    print( stack );
    stack.push( 3 );
    print( stack );

    while( !stack.isEmpty() )
    {
      int e = stack.pop();
      print( e, stack );
    }
  }

  private static void deque()
  {
    Deque<Integer> deque = new LinkedList<>();
    deque.addFirst( 1 );
    print( deque );
    deque.addFirst( 2 );
    print( deque );
    deque.addFirst( 3 );
    print( deque );
    deque.addLast( 9 );
    print( deque );
    deque.addLast( 8 );
    print( deque );
    deque.addLast( 7 );
    print( deque );

    deque.add( 11 );
    print( deque );
    deque.add( 12 );
    print( deque );
    deque.add( 13 );
    print( deque );

    deque.offerLast( 15 );
    print( deque );
    deque.offerFirst( 43 );
    print( deque );
    deque.offer( 44 );
    print( deque );

    // for( Integer e : deque )
    // {
    // System.out.println( e );
    // }
  }

  private static void print( Collection<Integer> col )
  {
    print( null, col );
  }

  private static void print( Integer i, Collection<Integer> col )
  {
    if( i != null )
    {
      System.out.print( String.format( "Elemento: %d -> ", i ) );
    }
    col.forEach( e -> System.out.print( e + ", " ) );
    System.out.println();
  }

  private static void queue()
  {
    Queue<Integer> queue = new LinkedList<>();

    queue.add( 1 );
    print( queue );
    queue.add( 2 );
    print( queue );
    queue.add( 3 );
    print( queue );
    queue.add( 4 );
    print( queue );
    queue.add( 5 );
    print( queue );
    queue.add( 6 );
    print( queue );

    System.out.println( "Peek:" + queue.peek() );

    System.out.println( queue.size() );
    while( !queue.isEmpty() )
    {
      Integer e = queue.remove();
      System.out.println( "Quitando " + e );
    }
    try
    {
      // queue.remove();
      Integer ie = queue.poll();
      System.out.println( ie );
    }
    catch( RuntimeException e )
    {
      e.printStackTrace();
    }
  }

  static Supplier<Order> emptyOrder = () -> {
    Order order = new Order();
    return order;
  };
  static class MYSup implements Supplier<Integer>
  {

    @Override
    public Integer get()
    {
      // TODO Auto-generated method stub
      return null;
    }

  }
}
