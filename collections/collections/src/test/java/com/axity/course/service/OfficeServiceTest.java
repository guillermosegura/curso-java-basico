package com.axity.course.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.to.Office;

public class OfficeServiceTest
{

  private OfficeService officeService;

  @Before
  public void setUp()
  {
    this.officeService = new OfficeService();
  }

  @Test
  public void testGetOffices()
  {
    List<Office> offices = officeService.getOffices();
    assertNotNull( offices );
    assertFalse( offices.isEmpty() );
    offices.stream().forEach( e -> System.out.println( e ) );
  }

  @Test
  public void testGetOffice()
  {
    String[] ids = { "1", "2", "3", "4", "5", "6", "7" };
    for( String id : ids )
    {
      Office office = this.officeService.getOfficeById(id);
      assertNotNull( office );
      System.out.println( office );
    }
  }

}
