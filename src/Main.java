public class Main {
    public static void main(String[] args) {
        Instructor myInstructor = new Instructor();                       //utilizo el metodo constructor de la clase Instructor que provee el compilador de Java
        myInstructor.name = "Ibis Brito";                                 //(por defecto lo tiene, aunque no exista físicamente en el clase de la que construye esa instancia/objeto)
        myInstructor.showName();                                          //el método Constructor tiene el miso nombre de la clase que lo inicializa. Más exacto en Herencia e Interfaces Java.

//        el otro modo de uso del método Constructor
        Instructor myInstructor2 = new Instructor("Ibita");
        String n = myInstructor2.name;
        System.out.println(n);

        }

    }
