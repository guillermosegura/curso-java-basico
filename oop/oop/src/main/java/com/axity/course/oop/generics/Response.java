package com.axity.course.oop.generics;

public class Response<H extends AbstractHeader, B extends AbstractBody, F extends AbstractFooter>
{
  private H header;
  private B body;
  private F footer;
  public H getHeader()
  {
    return header;
  }

  public void setHeader( H header )
  {
    this.header = header;
  }

  public B getBody()
  {
    return body;
  }
}