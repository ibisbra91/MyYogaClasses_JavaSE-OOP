public class Instructor {
    int id;
    String name;
    String style;

/*   constructor por default
     Instructor(){                                                               //el método Constructor nunca retona nada. Lo que sí puedo es especificar elemntos con los que quiero que construya cuando yo lo use
        System.out.println("Construyendo el objeto Instructor");                //o incluso, especificar alguna acción que quiero que se desencadene tras ejecutarse él (sólo se usa para crear isntancias del objeto de la clase que inicializa)
    }   */                                                                        //de modo que cada vez que se invoque el constructor, ejecutará ese comportamiento que se le especifique

    // constructor por inicialización
    Instructor(String name){                                                    //otro modo de uso del método Constructor
        System.out.println("El nombre del Instructor asignado es: " + name);
    }

    public void showName(){
        System.out.println(name);
    }

    /*cuándo :
     A. asignarle el valor del atributo en la declaración de atributos de la clase Instructor o directamente en la clase Main justo después de crear la instancia del objeto
    o,
     B. asignarle el valor del atributo como argumento en el constructor es:
    depende de varios factores y del diseño de la clase en particular.


    Asignar valor directamente en la declaración del atributo:
java
Copy code
public class Ejemplo {
    private String nombre = "Default";

    // Resto de la clase...
}
Ventajas:

Valor predeterminado: Puedes proporcionar un valor predeterminado directamente en la declaración del atributo. Este valor se utilizará si no se proporciona otro valor mediante el constructor.
Desventajas:

Falta de flexibilidad: Si necesitas cambiar el valor del atributo durante la vida del objeto, tendrías que hacerlo a través de métodos de la clase, ya que el valor se estableció en la declaración y no puede ser modificado directamente por fuera de la clase.



Asignar valor en el constructor de la clase:
java
Copy code
public class Ejemplo {
    private String nombre;

    public Ejemplo(String nombre) {
        this.nombre = nombre;
    }

    // Resto de la clase...
}
Ventajas:

Flexibilidad: Permite proporcionar diferentes valores durante la creación del objeto a través del constructor. Esto es útil cuando se necesita inicializar el objeto con información específica.
Cálculos o lógica personalizada: Puedes realizar cálculos o lógica personalizada antes de asignar un valor al atributo en el constructor.
Desventajas:

Menos conciso: Puede requerir más líneas de código si necesitas inicializar varios atributos en el constructor.
Elección:
Valores predeterminados: Si un atributo tiene un valor predeterminado que no cambiará frecuentemente y no depende de información específica del objeto, asignar el valor directamente puede ser conveniente.

Inicialización con lógica personalizada: Si la inicialización del atributo implica cálculos o lógica específica, es mejor hacerlo en el constructor para mantener el código más limpio y coherente.

Flexibilidad: Si necesitas flexibilidad para proporcionar diferentes valores durante la creación del objeto, es preferible asignarlos en el constructor.

En última instancia, la elección depende del diseño específico de la clase y de los requisitos del programa.
    */



}
