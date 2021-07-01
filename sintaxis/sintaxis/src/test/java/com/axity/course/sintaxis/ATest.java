package com.axity.course.sintaxis;

import java.util.TreeSet;

import org.junit.Test;

public class ATest
{

  @Test
  public void test()
  {

    TreeSet<Integer> s = new TreeSet<>();
    s.add( null );
    s.add( 1 );
    s.add( 2 );
    System.out.println( s.size() );
  }

  class Animal
  {
  }

  interface Meow
  {
  }

  interface Woof
  {
  }

  class Cat extends Animal implements Meow
  {
  }

  class Dog extends Animal implements Woof
  {
  }
}
