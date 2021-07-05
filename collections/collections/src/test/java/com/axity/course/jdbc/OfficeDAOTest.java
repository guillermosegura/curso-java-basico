package com.axity.course.jdbc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.axity.course.to.Customer;
import com.axity.course.to.Office;

public class OfficeDAOTest
{

  private OfficeDAO officeDAO;
  
  @Before
  public void setUp() {
    officeDAO = new OfficeDAO();
  }
  
  @Test
  public void testGetOffices()
  {
    List<Office> offices = officeDAO.findOffices();
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
      Office office = this.officeDAO.findOfficeById(id);
      assertNotNull( office );
      System.out.println( office );
    }
  }

}
