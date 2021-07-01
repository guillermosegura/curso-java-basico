package com.axity.course.oop.casting;

public class Dog extends Animal
{
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
    return "Dog";
  }
}
