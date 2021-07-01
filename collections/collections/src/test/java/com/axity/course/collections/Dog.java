package com.axity.course.collections;

public class Dog extends Animal implements Woof
{

  public Dog()
  {
    super();
  }

  public Dog( String name )
  {
    super( name );
  }

  @Override
  public void eat()
  {
    System.out.println( "Dog eats" );
  }

  public void woof()
  {
    System.out.println( "Dog says woof" );
  }

  @Override
  public String toString()
  {
    return "[Dog] " + super.name;
  }
}
