package com.axity.course.oop.generics;

public class DemoServiceImpl implements DemoService<String, Integer>
{

  public Integer doSomething( String t )
  {
    return Integer.valueOf( t );
  }

  public String doReverse( Integer i )
  {
    return i.toString();
  }
}
