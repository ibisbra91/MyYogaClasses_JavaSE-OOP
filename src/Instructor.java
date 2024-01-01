public class Instructor {
    static int id = 0;        //autoincrement
    String name;
    String style;

//    puedo tener varios métodos constructor creados en la clase (a instanciar luego en la Main class),
//    porque sólo se invocará aquel que llame en la creación del objeto. Básicamente, depende del proyecto.

    // constructor por default
    Instructor(){
        System.out.println("Construyendo el Objeto Instructor con Constructor *VACÍO o por default*: ");
        id++;                                                                                               //cuando cree uno, incrementa el valor de la variable es 1
    }

    // constructor por inicialización
    Instructor(String name){
        System.out.println("Construyendo el Objeto Instructor con Constructor *por inicialización*: " + name);
    }


    public void showName(){
        System.out.println(name);
    }

    /** DESCRIPCIÓN: Este método imprime el valor del id del Instructor.*/
    public void showId(){
        System.out.println("ID Instructor: " + id);         //como id es 'static' puedo acceder a su valor sin escribir 'Instructor.id' dentro de la misma clase
    }


}
