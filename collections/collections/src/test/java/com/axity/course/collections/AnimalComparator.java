package com.axity.course.collections;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal>
{

  @Override
  public int compare( Animal left, Animal right )
  {
    int compare = 1;
    if( right != null )
    {
      if( left.getClass().equals( right.getClass() ) )
      {
        compare = left.compareTo( right );
      }
      else
      {
        compare = left.getClass().getName().compareTo( right.getClass().getName() );
      }
    }

    return compare;
  }

}
