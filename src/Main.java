import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {


       // showMenu();  // para que este metodo sea accesible desde fuera de la clase donde esta declarado el método que lo construye
                     //es preciso, ponerle al metodo allá donde se declaró/creó, la palabra reservada (modificador de acceso) "public"

        //Ahora quiero hacer que: cuando el discípulo elija la opción 1 del 2do menú ("1. Book an class"),
        //el programa muestre una lista de meses, específicamente que muestre un bloque/lista de 3 meses =>que muestre los meses en bloques de trimestres (q).
        //De modo que el discípulo sólo pueda agendar clases durante un trimestre.

/*        Instructor myInstructor = new Instructor("Ibis Quezada", "Hatha Yoga");
        System.out.println(myInstructor.name);
        System.out.println(myInstructor.style);*/

        Disciple myDiscipleIris = new Disciple("Iris Diaz", "idiaz@gmail.com");
        String a = myDiscipleIris.name;
        String b = myDiscipleIris.email;
        System.out.println("This disciple is: " + a + ". Her email is: " + b);


        }


    }

