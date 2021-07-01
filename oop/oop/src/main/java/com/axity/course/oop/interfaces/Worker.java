package com.axity.course.oop.interfaces;

public class Worker implements Operator, Checker
{

  @Override
  public void operate()
  {
    System.out.println( "Opera" );
  }

  @Override
  public void check()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void operate( int id )
  {
    System.out.println( "Opero con " + id );
  }
}
