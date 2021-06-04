# Comentarios

## Comentarios de línea 

* Se emplean <b>//</b> seguido del comentario.

* Pueden escribirse arriba del código para describir un algoritmo, procedimiento, condiciones iniciales, consideraciones del ambiente.

```java
	public void addAddress(Address address) {
		// Validar si está inicializada la lista de direcciones
		if (this.addresses == null) {
			this.addresses = new ArrayList<>();
		}
		// Validar si la direccion no existe
		if (!this.addresses.contains(address)) {
			// Agregar la nueva direccion
			this.addresses.add(address);
		}
	}
```

* Pueden agregarse metalenguaje para ubicar cambios pendientes por realizar o mejoras.
```java
	public void removeAddress(Address address) {
        // TODO implementar el código correspondiente
	}

    public void complexMethod(Somevalue someValue) {
        // FIXME refactorizar el método, convertir en utilerías
	}
```

* Pueden escribirse al final de la línea para agregar comentarios aclaratorios <b>cortos y sencillos</b>.

```java
	public void countCourses(Student student) {
		int c = 0; // contador inicial
        // ...
        return c;
	}
```

* Pueden emplearse para comentar código fuente.
```java
	public Address removeAddress(Address address) {
		Address addressRemoved = null;
//		if (this.addresses != null) {
//			if (this.addresses.contains(address)) {
//				addressRemoved = this.addresses.get(this.addresses.indexOf(address));
//				this.addresses.remove(address);
//			}
//		}
		return addressRemoved;
	}
```

## Comentarios multilínea

* Se emplea el inicio de comentario de línea <b>/\*</b> y termina con el fin de comentario de línea <b>\*/</b>
```java
	public void lorem() {
	 /* 
      * Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo
	  * ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis
	  * parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec,
	  * pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec
	  * pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo,
	  * rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede
	  * mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper
	  * nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu,
	  * consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra
	  * quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.
	  * Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur
	  * ullamcorper ultricies nisi. Nam eget dui.
	  */
	}
```

* Por estilo se acostumbra *alinear* los \*, pero no es necesario.

```java
	public void lorem() {
	 /* 
       Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo
	   ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis
	   parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec,
	   pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec
	   pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo,
	   rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede
	   mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper
	   nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu,
	   consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra
	   quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.
	   Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur
	   ullamcorper ultricies nisi. Nam eget dui.
	  */
	}
```

* Normalmente se utiliza en lugar de múltiples líneas de //.

* Se emplean para definir licencias, copyright, comentarios muy largos y/o descriptivos. 
```java
	/*
	 * The MIT License (MIT)
	 * 
	 * Copyright (c) 2018 Mapbox
	 * 
	 * Permission is hereby granted, free of charge, to any person obtaining a copy
	 * of this software and associated documentation files (the "Software"), to deal
	 * in the Software without restriction, including without limitation the rights
	 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	 * copies of the Software, and to permit persons to whom the Software is
	 * furnished to do so, subject to the following conditions:
	 * 
	 * The above copyright notice and this permission notice shall be included in
	 * all copies or substantial portions of the Software.
	 * 
	 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	 * SOFTWARE.
	 */
```
## Javadoc

* Consiste en comentarios multilínea con la finalidad de geneear documentación de APIs en formato HTML a partir del código fuente. 

* Se pueden emplear etiquetas HTML para forzar saltos de línea, agregar énfasis, usar listas.

* Se emplea el inicio de comentario de línea <b>/\*\*</b> y termina con el fin de comentario de línea <b>\*/</b>

* Se puede agregar información a nivel del paquete, la clase, los atributos, los constructores y los métodos (públicos).

* Se emplean etiquetas (*tags*) que están precedidas por el caracter *@*, por ejemplo:

    | Tag | Descripción |
    | --- | ----------- |
    | @author | Nombre del programador | 
    | @version | Versión del método o de la clase | 
    | @param | Definición del parámetro | 
    | @return | Informa que devuelve el método | 
    | @throws | Excepciones que son lanzadas por el método | 
    | @see | Asocia con otro método o clase | 
    | @since | Indica la versión desde la cuál está habilitado el método | 
    | @deprecated | Indica que el método o clase es antiguo y ya no se recomienda su uso | 

* Por estilo se acostumbra *alinear* los \*, pero no es necesario.

* Por ejemplo:

```java
package com.axity.course.sintaxis;

import java.util.Date;

/**
 * Clase ejemplo para mostrar la sintaxis del lenguaje
 * 
 * @author guillermo.segura@axity.com
 *
 */
public class MyClase {
	/** Identificador */
	private int id;
	/** Nombre */
	private String name;
	/** Fecha */
	private Date date;

	/** Constructor default */
	public MyClase() {
		this.id = 0;
		this.date = new Date();
	}

	/**
	 * Constructor por id y nombre
	 * 
	 * @param id   asigna el id
	 * @param name asigna el nombre
	 */
	public MyClase(int id, String name) {
		this.id = id;
		this.name = name;
		this.date = new Date();
	}

	/**
	 * Método main, no emplea argumentos
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		MyClase myClase = new MyClase();
		myClase.name = "Axity";

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);

		myClase = new MyClase(1, "Curso Java");

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);
	}
}
```

* [How to Write Doc Comments for the Javadoc Tool][2]

[Regresar][1]

[1]: ../README.md

[2]: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html