package com.axity.course.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaApp
{

  public static void main( String[] args )
  {

    // streamForEach();

    // consumer();
    // message();

    // randomer();
    // operation();
    //
     Random r = new Random();
    // r.ints( 1, 101 ).limit( 1000 ).forEach( System.out::println );
    // r.ints( 1, 21 ).limit( 20 ).forEach( i -> System.out.print( i + " " ) );
    //
    // List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 );
    // for( int i : list )
    // {
    //
    // }
    //
    // Consumer<Integer> consumer1 = System.out::println;
    // Consumer<Integer> consumer2 = e -> System.out.println( e );
    // Consumer<Integer> consumer3 = e -> {
    // System.out.println( e );
    // };

    // System.out.println();
    // list.stream().forEach( consumer3 );
    // list.stream().forEach(e -> {
    // System.out.print(e + " ");
    // });
    //
    // Set<Integer> doubled = list.stream().map( e -> {
    // return e % 5;
    // } ).collect( Collectors.toSet() );
    // doubled.stream().forEach( consumer1 );
    // //
    //
    // Set<Integer> double2 = r.ints( 1, 1000 ).limit( 500 ).parallel().map( e -> e * 2 ).collect( HashSet::new,
    // HashSet::add, HashSet::addAll );
    //
    // double2.stream().forEach( i -> System.out.print( i + " " ) );

    //
    //
    // doubled.stream().forEach(e -> System.out.print(e + " "));
    // System.out.println();
    // double2.stream().forEach(e -> System.out.print(e + " "));
    //
    // System.out.println("-------");
    // List<Integer> listModulus3 = list.stream().filter(e -> e % 3 == 0).collect(Collectors.toList());
    //
    // listModulus3.stream().forEach(System.out::println);
    //
    // System.out.println("-------");
    // list.stream().limit(5).forEach(System.out::println);
    //
    // System.out.println("-------");
    //
     List<Integer> randomInts = r.ints(1, 200).limit(100).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
     randomInts.stream().distinct().sorted().forEach(e -> System.out.print(e + " "));
    //
     System.out.println("\n----");
    
     System.out.println("count:" + randomInts.stream().collect(Collectors.counting()));
     System.out.println("sum:" + randomInts.stream().collect(Collectors.summingInt(Integer::intValue)));
     System.out.println("avg:" + randomInts.stream().collect(Collectors.averagingDouble(Integer::doubleValue)));
    
     System.out.println("---- Statistics:");
     List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    
     IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
    
     System.out.println("Count: " + stats.getCount());
     System.out.println("Max: " + stats.getMax());
     System.out.println("Min: " + stats.getMin());
     System.out.println("Sum: " + stats.getSum());
     System.out.println("Avg: " + stats.getAverage());

  }

  private static void randomer()
  {
    Randomer randomer = ( start, end ) -> {
      return (int) (Math.random() * (end - start) + start);
    };

    for( int i = 0; i < 100; i++ )
    {
      String s = String.format( "random[%d]: %d", i, randomer.createRandom( 1, 21 ) );
      System.out.println( s );
    }
  }

  private static void operation()
  {
    Operation suma = ( a, b ) -> {
      // System.out.println( a + " + " + b );
      return a + b;
    };

    Operation resta = ( a, b ) -> {
      // System.out.println( a + " - " + b );
      return a - b;
    };

    Operation multiplicacion = ( a, b ) -> {
      // System.out.println( a + " * " + b );
      return a * b;
    };

    Operation division = ( a, b ) -> {
      // System.out.println( a + " / " + b );
      return a / b;
    };

    for( int i = 100; i < 110; i++ )
    {
      for( int j = 0; j < 10; j++ )
      {
        System.out.println( "suma: " + suma.op( i, j ) + ", resta: " + resta.op( i, j ) + ", multiplicacion: "
            + multiplicacion.op( i, j ) + ", division: " + division.op( i, j ) );
      }
    }

  }

  private static void message()
  {
    Message message = s -> {
      StringBuilder sb = new StringBuilder();
      sb.append( "Hello " ).append( s ).append( "!" );
      return sb.toString();
    };

    List<String> names = Arrays.asList( "Juan", "Maria", "Pedro" );
    for( String name : names )
    {
      System.out.println( message.create( name ) );
    }
  }

  private static void streamForEach()
  {
    List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5 );

    Consumer<Integer> consumer = n -> {
      System.out.println( n + 10 );

    };

    list.stream().forEach( consumer );
  }

  private static void consumer()
  {
    // int m = 0;
    Consumer<Integer> consumer = n -> {
      System.out.println( n + 10 );

    };

    for( int i = 0; i < 5; i++ )
    {
      consumer.accept( i );
    }

    consumer.accept( 20 );
  }

  private interface Message
  {
    String create( String s );
  }

  private interface Randomer
  {
    int createRandom( int start, int end );
  }

  private interface Operation
  {
    double op( double a, double b );
  }

}
