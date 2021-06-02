# Sintaxis

Java sigue una sintaxis similar a C/C++, por ejemplo:


```java
package com.axity.course.sintaxis;

import java.util.Date;

public class MyClase {
	private int id;
	private String name;
	private Date date;

	public MyClase() {
		this.id = 0;
		this.date = new Date();
	}

	public MyClase(int id, String name) {
		this.id = id;
		this.name = name;
		this.date = new Date();
	}

	public static void main(String args[]) {
		MyClase myClase = new MyClase();
		myClase.name = "Axity";

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);

		myClase = new MyClase(1, "Curso Java");

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);
	}
}

```
[Código fuente][3]

1. Se crea una estructura de paquetes (carpetas) separadas por <b>"."</b>
```
C:.
└───com
    └───axity
        └───course
            └───sintaxis
                    MyClase.java
```
```java
package com.axity.course.sintaxis;
```
2. Se importan otras clases por medio de la *keyword* <h4 style="color:#d73a49"><b>import</b></h4>, se permite el uso del wildcard * en caso de querer importar todas las clases del paquete. [No es recomendable]

```java
import java.util.Date;
```

3. La *keyword* <h4 style="color:#d73a49"><b>class</b></h4> indica que se trata de una clase. 
<br>Una clase, regularmente, equivale a un archivo con extensión <b>.java</b>. 
<br>Es sensible a mayúsculas y minúsculas, por convención se utilizan nombres en Upper CamelCase (PascalCase) ([Convenciones de nombrado][2]).
<br>Las clases contienen atributos y métodos.

```java
public class MyClase {
```

4. El método principal es el método <h4 style="color:#6f42c1"><b>main</b></h4>, su firma es:
```java
public static void main (String args[]) {
    //...
}
```

5. Se emplean modificadores de acceso para los atributos y los métodos con las *keywords*:
   * <h4 style="color:#d73a49"><b>public</b></h4>,
   * <h4 style="color:#d73a49"><b>protected</b></h4>,
   * <h4 style="color:#d73a49"><b>private</b></h4>,
   * O ninguno (de paquete).

6. Los atributos se les indica su tipo, puede ser un primitivo (int, double) o una clase (String, Date).

7. Para crear instancias de objetos se emplea la *keyword* <h4 style="color:#d73a49"><b>new</b></h4> seguida de paréntesis (constructor).
    ```java
    MyClase myClase = new MyClase();
    ```

    <br>En caso de ser requerido se pueden pasar parámetros al constructor. 
    ```java
    myClase = new MyClase(1, "Curso Java");
    ```

8. Las líneas se terminan con <b>";"</b>

9. Los bloques se separan por medio de llaves <b>"{"</b> y <b>"}"</b>.
<br>Los espacios en Java son empleados para indentar el código para la lectura humana, el compilador los discrimina y trata por igual espacios y tabuladores.
<br>Se sugiere emplear espacios en lugar de tabuladores, 4 espacios por cada bloque.
<br>Evitar líneas mayores a 120 caracteres (80 en monitores con resoluciones menores).
<br>Se sugiere emplear codificación UTF-8.

10. En el caso de nombrado de paquetes, clases, atributos, métodos se sugiere seguir una convención, por ejemplo:
    * [Convenciones de nombrado][2].
    * Emplear idioma inglés a menos que se indique lo contrario.
    * Evitar acrónimos o siglas, a menos que sean reconocidos en la organización; i.e. rfc, html, url.
    * Evitar el Spanglish.
    * Emplear [comentarios][4] que sirvan para entender la lógica empleada, indiquen javadoc o sirvan como firma o copyright.

<br><br><br>

## Lista de palabras reservadas en Java

En Java no pueden emplearse las siguientes *keywords*

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

[2]: https://es.wikipedia.org/wiki/Convenci%C3%B3n_de_nombres_(programaci%C3%B3n)#Java

[3]: sintaxis/src/main/java/com/axity/course/sintaxis/MyClase.java

[4]: comentarios.md