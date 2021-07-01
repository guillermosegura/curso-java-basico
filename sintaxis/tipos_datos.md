# Tipos de datos

Cada tipo de datos se identifica por un nombre y es capaz de almacenar una determinada clase de información así como un 
rango de valores concreto.

## Tipos primitivos

|Data Type | Size | Description|
|----------|------|------------|
|byte | 1 byte | Stores whole numbers from -128 to 127|
|short | 2 bytes | Stores whole numbers from -32,768 to 32,767|
|int | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647|
|long | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits|
|double | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits|
|boolean | 1 bit | Stores true or false values|
|char | 2 bytes | Stores a single character/letter or ASCII values|

### Números

* Tipos numéricos, guardan valores enteros positivos o negativos:
    * byte
    * short
    * int
    * long
* Tipos de punto flotante, emplea el formato [IEEE 754][2]
    * float (simple precisión)
    * double (doble precisión)

    <b>Nota:</b> Se debe tener en cuenta que estos tipos de datos no sos precisos y pueden con llevar errores de cálculo, se suguiere emplear la clase <b>java.math.BigDecimal</b> para cálculos monetarios o de mucha precisión.

    ```java
    import java.math.BigDecimal;

    public class Precision {

        public static void main(String[] args) {

            float f1 = 1.1f;
            double f2 = 2.2f;
            System.out.println(f1 + f2);

            double d1 = 1.1;
            double d2 = 2.2;
            System.out.println(d1 + d2);

            BigDecimal bigDecimal1 = new BigDecimal("1.1");
            BigDecimal bigDecimal2 = new BigDecimal("2.2");

            System.out.println(bigDecimal1.add(bigDecimal2));
        }

    }
    ```
    La salida será:
    <br>3.3000000715255737
    <br>3.3000000000000003
    <br>3.3

    [Precision.java][3]


[Regresar][1]

[1]: ../README.md
[2]: https://es.wikipedia.org/wiki/IEEE_754
[3]: sintaxis/src/main/java/com/axity/course/sintaxis/Precision.java