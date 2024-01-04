public class Instructor {

    static int id = 0;        //autoincrement
    String name;
    String style;

//sobrecarga de métodos (de constructores en este caso)

    // constructor por default
    Instructor(){
        System.out.println("Construyendo el Objeto Instructor con Constructor *VACÍO o por default*: ");
    }

    // constructor por inicialización
    Instructor(String name, String style){
        id++;                                                                                               //cuando cree un objeto Instructor nuevo, incrementa el valor de la variable es 1
        System.out.println("Construyendo el Objeto Instructor con Constructor *por inicialización*: " + name);
        this.name = name;                   //así, cuando cree la instancia fuera de esta clase usando este Constructor, inicializo los atributos del objeto con valores por default
        this.style = style;                 //es decir, no se inicializará ese objeto en null; sino que contendrá estos 2 valores por default, siempre que sea un OBJETO construido invocando este Constructor
    }


    public void showName(){
        System.out.println(name);
    }


/** DESCRIPCIÓN: Este método imprime el valor del id del Instructor.*/

    public void showId(){
        System.out.println("ID Instructor: " + id);         //como id es 'static' puedo acceder a su valor sin escribir 'Instructor.id' dentro de la misma clase
    }



}
