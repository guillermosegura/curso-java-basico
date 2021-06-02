# Sintaxis

Java sigue una sintaxis similar a C/C++


1. Se crea una estructura de paquetes (carpetas) separadas por <b>"."</b>
```
C:.
└───com
    └───axity
        └───course
            └───sintaxis
                    MyClase.java
```

2. Se importan otras clases por medio de la *keyword* <font color="blue"><b>import</b></font>

* Las líneas se terminan con <b>";"</b>


```java
package com.axity.course.sintaxis;

import java.util.Date;

public class MyClase {
    private String name;
    private Date date;

    public MyClase() {
        this.date = new Date();
    }

    public static void main (String args[]) {
        MyClase myClase = new MyClase();
        myClase.name = "Axity";

        System.out.println(myClase.name + " [" + myClase.date + "]");
    }
}

```




## Lista de palabras reservadas en Java

|   |   |   |   |   |  |
| -------- | ------ | ------- | ----- | ---- | ---- |
| abstract | assert | boolean | break | byte | case |
| catch | char | class | const | continue | default |
| double | do | else | enum | extends | false |
| final | finally | float | for | goto | if |
| implements | import | instanceof | int | interface | long |
| native | new | null | package | private | protected |
| public | return | short | static | strictfp | super |
| switch | synchronized | this | throw | throws | transient |
| true | try | void | volatile | while | | 


[Regresar][1]

[1]: ../README.md