package com.axity.course.to;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable
{

  private static final long serialVersionUID = -1894212602374788965L;
  private Integer id;
  private String lastName;
  private String firstName;
  private String extension;
  private String email;
  private Office office;
  private Employee reportsTo;
  private String jobTitle;
  public Integer getId()
  {
    return id;
  }

  public void setId( Integer id )
  {
    this.id = id;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName( String lastName )
  {
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName( String firstName )
  {
    this.firstName = firstName;
  }

  public String getExtension()
  {
    return extension;
  }

  public void setExtension( String extension )
  {
    this.extension = extension;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public Office getOffice()
  {
    return office;
  }

  public void setOffice( Office office )
  {
    this.office = office;
  }

  public Employee getReportsTo()
  {
    return reportsTo;
  }

  public void setReportsTo( Employee reportsTo )
  {
    this.reportsTo = reportsTo;
  }

  public String getJobTitle()
  {
    return jobTitle;
  }

  public void setJobTitle( String jobTitle )
  {
    this.jobTitle = jobTitle;
  }

  @Override
  public boolean equals( Object object )
  {
    boolean isEquals = false;
    if( this == object )
    {
      isEquals = true;
    }
    else if( object != null && object.getClass().equals( this.getClass() ) )
    {
      Employee that = (Employee) object;
      isEquals = Objects.equals( this.id, that.id );
    }

    return isEquals;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash( this.id );
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "id: " ).append( this.id );
    sb.append( ", jobTitle" ).append( this.jobTitle );
    sb.append( ", firstName: " ).append( this.firstName );
    sb.append( ", lastName: " ).append( this.lastName );
    sb.append( ", email: " ).append( this.email );
    sb.append( ", office: " );
    if( this.office != null )
    {

      sb.append( "[" ).append( this.office.getId() );
      if( this.office.getAddress() != null )
      {
        sb.append( "-" ).append( this.office.getAddress().getCity() );
      }
      sb.append( "]" );
    }
    if( this.reportsTo != null )
    {
      sb.append( ", reportsTo: [" );
      sb.append( "jobTitle: " ).append( this.reportsTo.jobTitle );
      sb.append( ", firstName: " ).append( this.reportsTo.firstName );
      sb.append( ", lastName: " ).append( this.reportsTo.lastName );
      sb.append( ", email: " ).append( this.email ).append( "]" );
    }

    return sb.toString();

  }

}
