package com.axity.course.oop.interfaces;

public interface Operator
{

  void operate();
  
  default void operate(int id) {
    System.out.println( "No aplica" );
  }

}
