package com.axity.course.oop.generics;

import java.util.List;

import com.axity.course.oop.abstraccion.User;
import com.axity.course.oop.casting.Animal;
import com.axity.course.oop.casting.Cat;
import com.axity.course.oop.casting.Dog;

public class GenericApp
{

  public static void main( String[] args )
  {
    GenericApp app = new GenericApp();

    // app.demoGeneric();
    // app.demoService();
    // app.util();
    // app.entity();

    Response<AbstractHeader, AbstractBody, AbstractFooter> response = new Response<>();
//    response.setHeader(  );
    //
    // app.bounded();

  }

  private void bounded()
  {
    Util util = new Util();

    Integer[] s = { 1, 2 };

    List<Integer> list = util.fromArray( new Integer[] { 1, 2 } );
    // List<String> strings = util.fromArray(new String[] {"A","B"});
  }

  private void entity()
  {
    Entity<String> entity = new Entity<>( "QWERTY" );
    System.out.println( entity.getT() );

    Entity<User> user = new Entity<>( new User() );

  }

  private void util()
  {
    Util util = new Util();

    Integer[] arreglo = { 3, 7, 5, 6, 3, 2, 1, 3, 4, 3, 7, 8, 9, 10, 3, 1, 3 };

    int n = util.count( arreglo, 3 );
    System.out.println( n );

    Animal cat = new Cat();
    Animal dog = new Dog();
    Animal[] animales = { cat, cat, dog, dog, cat, dog, dog, cat };

    n = util.count( animales, cat );
    System.out.println( "Hay " + n + " gatos" );

  }

  private void demoService()
  {
    DemoService<String, Integer> demoService = new DemoServiceImpl();
    int n = demoService.doSomething( "123" ) + 1;
    String str = demoService.doReverse( n );
    System.out.println( str );
  }

  private void demoGeneric()
  {
    DemoGenericClass<String> demo1 = new DemoGenericClass<>();
    demo1.set( "ABC" );
    System.out.println( demo1.get() );

    DemoGenericClass<Cat> demo2 = new DemoGenericClass<>();
    demo2.set( new Cat() );
    System.out.println( demo2.get() );
    demo2.get().meow();

    DemoGenericClass<Animal> demo3 = new DemoGenericClass<>();
    demo3.set( new Dog() );
    System.out.println( demo3.get() );

    Demo demo4 = new Demo();
    demo4.set( new Cat() );
    System.out.println( demo4.get() );
    if( demo4.get() instanceof Cat )
    {
      ((Cat) demo4.get()).meow();
    }

  }

  public static class Demo
  {
    private Object o;

    public void set( Object o )
    {
      this.o = o;
    }

    public Object get()
    {
      return o;
    }

  }

}
