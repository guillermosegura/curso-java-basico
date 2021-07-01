package com.axity.course.oop.generics;

public interface DemoService<T, U>
{
  U doSomething( T t);
  T doReverse( U u );
}

