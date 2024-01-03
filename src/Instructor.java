public class Instructor {

    //static

   int id;        //autoincrement
    String name;
    String style;


    // constructor por default
    Instructor(){
        System.out.println("Construyendo el Objeto Instructor con Constructor *VACÍO o por default*: ");
        //id++;                                                                                               //cuando cree un objeto Instructor nuevo, incrementa el valor de la variable es 1
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
