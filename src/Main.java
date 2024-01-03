import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor();                       //utilizo el metodo constructor de la clase Instructor que provee el compilador de Java
        myInstructor.name = "Viridiana Yoga";                                 //(por defecto lo tiene, aunque no exista físicamente en el clase de la que construye esa instancia/objeto)
        myInstructor.showName();                                          //el método Constructor tiene el miso nombre de la clase que lo inicializa. Más exacto en Herencia e Interfaces Java.
        myInstructor.showId();
        //System.out.println(Instructor.id);                               //si esta variable 'id' no fuera "static", no podría llevar el control del autoincremento
                                                                         // es decir, para cada vez que se inicializara esta variable, tomaría el mismo valor por defecto con el que se inicializó, una y otra vez
       // Instructor.id++;                                                 //en cambio, si declaro una variable como "static", el valor de la variable PREVALECE más allá de la instanciación del objeto

        Instructor myInstructorViri = new Instructor();
        myInstructorViri.showId();

        showMenu();  // para que este metodo sea accesible desde fuera de la clase donde esta declarado el método que lo construye
                     //es preciso, ponerle al metodo allá donde se declaró/creó, la palabra reservada (modificador de acceso) "public"

        //para moverme alante y atrás cuando abrí un método en otro tab del IDE,
        //lo hago:
        //hacia adelante   ctrol + alt + flecha derecha
        //hacia atrás   ctrol + alt + flecha izquierda

// así queda MODULARIZADO el programa con la lógica de 'ui'
//y lo estoy llamando (con el apoyo que brinda la estructura y el "import static.package.clase.*") de forma concreta, clara, ordenada, limpia y MODULARIZADA


        }


    }
