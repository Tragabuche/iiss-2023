### Descripcion
- **Definición de tipos de datos:**  se define una clase sellada (`sealed trait Lista[+A]`) y dos casos (`case object Nil` y `case class Cons`) que representan la lista vacía y una lista no vacía respectivamente. La clase sellada y los casos permiten definir el tipo de dato `Lista[A]` de manera segura, evitando que se creen clases derivadas que puedan alterar la implementación. Además, la definición del tipo de dato `Lista[A]` es genérica en cuanto al tipo `A`, lo que permite la creación de listas con elementos de cualquier tipo. 
- **Ocultación de la implementación:**  se oculta la implementación de la clase sellada y los casos mediante la definición de los métodos `cabeza`, `cola` y `isEmpty`, que son los únicos métodos públicos para acceder a los elementos de una lista. De esta manera, se evita que se acceda a los elementos de una lista de forma directa y se asegura que sólo se pueda acceder a ellos a través de los métodos definidos. 
- **Aplicación del principio de acceso uniforme:**  se aplica el principio de acceso uniforme al definir los métodos `cabeza`, `cola` y `isEmpty` de forma que se pueden acceder a ellos de la misma manera en todos los casos (lista vacía y lista no vacía). 
- **Especificación de la inmutabilidad del estado de un objeto:**  se especifica la inmutabilidad del estado de un objeto mediante la definición de los métodos `isEmpty`, `cabeza` y `cola` como métodos que sólo devuelven información y no modifican el estado interno de la lista.


### Instrucciones
- Para ejecutar el programa, sigue las siguientes instrucciones: 
1. Asegúrate de estar en el directorio donde se encuentran los archivos `anotaciones.scala` y `main.scala`. 
2. Ejecuta el siguiente comando en la terminal:

```
scalac anotaciones.scala main.scala
```

Esto compilará los archivos `.scala` y generará los archivos `.class` correspondientes. 
3. Una vez terminada la compilación, ejecuta el siguiente comando:

```
scala Main
```


Esto ejecutará el programa y mostrará la salida correspondiente en la terminal.