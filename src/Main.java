public class Main {
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor();                       //utilizo el metodo constructor de la clase Instructor que provee el compilador de Java
        myInstructor.name = "Ibis Brito";                                 //(por defecto lo tiene, aunque no exista físicamente en el clase de la que construye esa instancia/objeto)
        myInstructor.showName();                                          //el método Constructor tiene el miso nombre de la clase que lo inicializa. Más exacto en Herencia e Interfaces Java.
        myInstructor.showId();
        System.out.println(Instructor.id);                               //si esta variable 'id' no fuera "static", no podría llevar el control del autoincremento
                                                                         // es decir, para cada vez que se inicializara esta variable, tomaría el mismo valor por defecto con el que se inicializó, una y otra vez
        Instructor.id++;                                                 //en cambio, si declaro una variable como "static", el valor de la variable PREVALECE más allá de la instanciación del objeto

        Instructor myInstructorViri = new Instructor();
        myInstructorViri.showName();
        myInstructorViri.showId();

        }

    }
