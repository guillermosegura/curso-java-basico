package com.axity.course.oop.casting;

import java.io.Serializable;

public class Cat extends Animal implements Meow, Serializable
{

  private static final long serialVersionUID = -322380312692239018L;

  @Override
  public void eat()
  {
    System.out.println( "Cat eats" );
  }

  public void meow()
  {
    System.out.println( "Cat says meow" );
  }

  @Override
  public String toString()
  {
    return "Cat";
  }
}
