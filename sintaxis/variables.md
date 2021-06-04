# Variables

Las variables son los contenedores de datos.

Sintaxis:

    <tipo> <nombre_variable>;
    <tipo> <nombre_variable> = <valor>;

```java
String name = "John";
int myNum = 15;

int a;
a = 15;
a = 20;
```

El tipo de variable puede ser un tipo de dato primitivo, una clase de Java o una clase definida por el programador o un API.

* Las variables de clases, son los atributos.

* Las variables de método son visibles sólo dentro del método que se ejecuta.

* Las variables pueden reasignarse con el símbolo <b>=</b>.

* Pueden "reutilizarse" los nombres siempre que estén en su contexto. 

```java
public class Counter {

	private int counter; // Variable-atributo contador

	public static void main(String args[]) {
		// Se define la variable counter en el método main
		Counter counter = new Counter();

		counter.showCounter();
		counter.next();
		counter.next();
		counter.next();
		counter.showCounter();

		// Variable n = 5
		int n = 5;
		counter.add(n);
		counter.showCounter();

		// Variable n = 2
		n = 2;
		counter.add(n);

		counter.showCounter();

		// Variable pair = 5
		int pair = 3;
		counter.addDouble(pair);
		counter.showCounter();

	}

	public void next() {
		// Incrementa el valor de counter de la clase
		this.counter++;
	}

	public void add(int n) {
		// Incrementa el valor de counter de la clase con el valor del parámetro n
		this.counter += n;
	}

	public void addDouble(int n) {
		// Incrementa el valor de counter de la clase con el valor del parámetro n * 2
		// Asigna el valor de la multiplicación a la variable pair
		int pair = n * 2;
		this.counter += pair;
	}

	public void showCounter() {
		System.out.println("Contador: " + this.counter);
	}

}
```
[Código fuente][2]

* <b>Nota:</b> en la práctica se sugiere evitar colisiones de nombres, en el caso de métodos getter/setter emplear el *keyword* <b>this</b> para distinguir entre el parámetro y el atributo.

```java
public class Student {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
```

[Regresar][1]

[1]: ../README.md

[2]: sintaxis/src/main/java/com/axity/course/sintaxis/Counter.java