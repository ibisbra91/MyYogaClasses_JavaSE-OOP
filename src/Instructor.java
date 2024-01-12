import java.util.ArrayList;
import java.util.Date;

public class Instructor {

    static int id = 0;        //autoincrement
    private String name;
    private String email;       //agregado, pues el programa va a permitir elegir si soy un Instructor o si soy un Discípulo, y esa identificación será a partir de usar el email de cada uno.
    private String style;


    Instructor(){
        System.out.println("Construyendo el Objeto Instructor con Constructor *VACÍO o por default*: ");
    }

    // constructor por inicialización
    Instructor(String name, String style){
        id++;
        System.out.println("Construyendo el Objeto Instructor con Constructor *por inicialización*: " + name);
        this.name = name;
        this.style = style;
    }


    public void showName(){
        System.out.println(name);
    }


/** DESCRIPCIÓN: Este método imprime el valor del id del Instructor.*/

    public void showId(){
        System.out.println("ID Instructor: " + id);         //como id es 'static' puedo acceder a su valor sin escribir 'Instructor.id' dentro de la misma clase
    }

    ArrayList<AvailableYogaClass> aA = new ArrayList<>();           //colección de OBJETOS de tipo AvailableYogaClass

    public void addClass(Date date, String time){                   //incrementa la lista de clases de yoga de ese Instructor
        aA.add(new Instructor.AvailableYogaClass(date, time));
    }

    public ArrayList<AvailableYogaClass> getaA(){                   //devuelve la lista completa de clases de yoga
        return aA;
    }

    //NEGOCIO: un Instructor puede definir ciertas fechas en las que él está disponible. Un Instructor puede tener muchas clases disponibles.
    //Las clases Helper (clases anidadas y 'static' dentro de otra clase externa) suelen usarse cuando así lo requiere la Lógica de Negocio,
    //o, cuando empiece detecte un atributo cuya estructura de datos empieza a tener muchos datos -> es  momento de analizarlo pues puede que en ese caso sea óptimo que sean declarados dentro de una clase anidada (y static o no) dentro de la clase inicial.'
    //una vía para resolverlo es crear un clase independiente para agendar/modificar una clase de yoga con determinado Instructor -> una clase anidada (Helper class) haría:
    public static class AvailableYogaClass{
        private int id_AvailableClass;
        private Date date;   //Available Class
        private String time;

        public AvailableYogaClass(Date date, String time) {  //como mínimo una clase deberá tener fecha y hora
            this.date = date;
            this.time = time;
        }

        public int getId_AvailableClass() {
            return id_AvailableClass;
        }

        public void setId_AvailableClass(int id_AvailableClass) {
            this.id_AvailableClass = id_AvailableClass;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
