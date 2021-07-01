package com.axity.course.oop.pojo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PojoApp
{

  public static void main( String[] args )
  {
    PojoApp app = new PojoApp();

    app.clientes();
  }

  private void clientes()
  {
    Client cliente1 = new Client( 176, "Abarrotes La Divina" );
    Client cliente2 = new Client( 180, "Farmacias El Zenzontle" );
    Client cliente3 = new Client( 190, "Panaderia Garcia" );
    Client cliente4 = new Client( 210, "Llantera Lopez" );

    Client clienteNuevo = new Client( 176, "Abarrotes La Divina" );

    System.out.println( "Reflexivo:");
    System.out.println(  cliente1.equals( cliente1 ) );
    System.out.println( "-------" );
    System.out.println( cliente1.equals( cliente2 ) );
    System.out.println( cliente1.equals( cliente3 ) );
    System.out.println( cliente1.equals( cliente4 ) );
    System.out.println( "-------" );
    System.out.println( "Simetría:" );
    System.out.println( cliente1.equals( clienteNuevo ) );
    System.out.println( clienteNuevo.equals( cliente1 ) );
    
    System.out.println( "-------" );
    System.out.println( "Consistente:" );
    clienteNuevo.setId( 176 );
    System.out.println( cliente1.equals( clienteNuevo ) );
    
    System.out.println( "Hashes:" );
    System.out.println("cliente1.hashCode:"+ cliente1.hashCode() );
    System.out.println("cliente2.hashCode:"+  cliente2.hashCode() );
    System.out.println("cliente3.hashCode:"+  cliente3.hashCode() );
    System.out.println("cliente4.hashCode:"+  cliente4.hashCode() );
    System.out.println("clienteN.hashCode:"+  clienteNuevo.hashCode() );
    
    System.out.println( cliente1.toString() );

    Set<Client> clientes = new HashSet<>( Arrays.asList( cliente1, cliente2, cliente3, cliente4, clienteNuevo ) );
    System.out.println( clientes.size() );

    // System.out.println(cliente1.hashCode());
    // System.out.println(cliente2.hashCode());
    // System.out.println(cliente3.hashCode());
    // System.out.println(cliente4.hashCode());
    //
    // System.out.println(cliente1.equals(cliente2));
    // System.out.println(cliente1.equals(cliente3));
    // System.out.println(cliente1.equals(cliente4));
    // System.out.println(cliente2.equals(cliente3));
    // System.out.println(cliente2.equals(cliente4));

    // System.out.println(cliente3.equals(cliente4));

    // Client temp = new Client(176, "Abarrotes La Divina");
    // temp.setContact("Luis Gomez");
    // System.out.println(temp.hashCode());
    // System.out.println(cliente1.equals(temp));
  }

}
