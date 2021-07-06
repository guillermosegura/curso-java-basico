package com.axity.course.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public final class JdbcUtil
{
  public static void close( Statement st )
  {
    if( st != null )
    {
      try
      {
        st.close();
      }
      catch( SQLException e )
      {
        st = null;
      }
    }
  }
  
  public static void close( PreparedStatement ps )
  {
    if( ps != null )
    {
      try
      {
        ps.close();
      }
      catch( SQLException e )
      {
        ps = null;
      }
    }
  }
  
  public static void close( Connection conn )
  {
    if( conn != null )
    {
      try
      {
        conn.close();
      }
      catch( SQLException e )
      {
        conn = null;
      }
    }
  }

  public static void safeSetString( int column, String value, int type, PreparedStatement ps )
  {
    // TODO Auto-generated method stub
    
  }
}
