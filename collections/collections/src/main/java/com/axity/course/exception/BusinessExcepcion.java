package com.axity.course.exception;

public class BusinessExcepcion extends RuntimeException
{

  private static final long serialVersionUID = -6886450409638928998L;
  private BusinessExcepcionCode code;

  /**
   * {@inheritDoc}
   */
  public BusinessExcepcion()
  {
    super();
  }

  /**
   * {@inheritDoc}
   */
  public BusinessExcepcion( String message )
  {
    super( message );
  }

  /**
   * {@inheritDoc}
   */
  public BusinessExcepcion( String message, Throwable cause )
  {
    super( message, cause );
  }

  /**
   * {@inheritDoc}
   */
  public BusinessExcepcion( Throwable cause )
  {
    super( cause );
  }

  /**
   * @return the code
   */
  public BusinessExcepcionCode getCode()
  {
    return code;
  }

  /**
   * @param code the code to set
   */
  public void setCode( BusinessExcepcionCode code )
  {
    this.code = code;
  }

}
