package model;

import java.util.ArrayList;
import java.util.Date;

//subclase(clase hija) que hereda(extiende de) la Superclase(clase Padre) 'model.User'.
// Precisa actualizar el COnstructor() en coherencia con el uso de Herencia POO.
public class Instructor extends User{
    private String style;  //atributo que hace unico a cada model.Instructor (elemento importante para la Lógica de la entidad/clase model.Instructor) es: el estilo predominante de yoga que imparte en su clase

    /*
    model.Instructor(){
        System.out.println("Construyendo el Objeto model.Instructor con Constructor *VACÍO o por default*: ");
    }
*/

    // constructor por inicialización
   public Instructor(String name, String email){
        super(name, email);                 //lo genero presionando teclas alt + enter justo delante de la llave abierta de este método Constructor. Por algún motivo que aún no comprendo, el IDE da error cuando lo escribo manualmente. No así cuando lo genero con la combinación de teclas alt + enter (lo acepta sin error así.)
        // id++;                            //a futuro cercano lo manejaré a través de una BD
        System.out.println("Construyendo el Objeto model.Instructor con Constructor *por inicialización*: " + name);
        this.style = style;
    }

//getter y setter
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

/*
    public void showName(){
        System.out.println(name);
    }

*//** DESCRIPCIÓN: Este método imprime el valor del id del model.Instructor.*//*
    public void showId(){
        System.out.println("ID model.Instructor: " + id);         //como id es 'static' puedo acceder a su valor sin escribir 'model.Instructor.id' dentro de la misma clase
    }*/

    /** DESCRIPCIÓN: El objeto aA contiene la lista de clases de Yoga Disponibles del model.Instructor.
     *  Es un array de AvailableYogaClass que he estado construyendo cada vez que añadí una clase.
     *  Voy a estar convirtiendo al objeto/array aA en un toString() al sobreescribir el toString()
     *  para que almacene los datos de cada clase.*/
    ArrayList<AvailableYogaClass> aA = new ArrayList<>();           //colección de OBJETOS de tipo AvailableYogaClass

    public void addClass(Date date, String time){                   //incrementa la lista de clases de yoga de ese model.Instructor
        aA.add(new Instructor.AvailableYogaClass(date, time));
    }

    public ArrayList<AvailableYogaClass> getaA(){                   //devuelve la lista completa de clases de yoga
        return aA;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Style: " + style + "\n Available: " + aA.toString();      //para model.Instructor voy a reutilizar el comportamiento que ya está definido para el toString() en su superclase model.User y le añado que también muestre el valor de su atributo propio -> styley fecha con formato sencillo.
    }

    //NEGOCIO: un model.Instructor puede definir ciertas fechas en las que él está disponible. Un model.Instructor puede tener muchas clases disponibles.
    //Las clases Helper (clases anidadas y 'static' dentro de otra clase externa) suelen usarse cuando así lo requiere la Lógica de Negocio,
    //o, cuando empiece detecte un atributo cuya estructura de datos empieza a tener muchos datos -> es  momento de analizarlo pues puede que en ese caso sea óptimo que sean declarados dentro de una clase anidada (y static o no) dentro de la clase inicial.'
    //una vía para resolverlo es crear un clase independiente para agendar/modificar una clase de yoga con determinado model.Instructor -> una clase anidada (Helper class) haría:
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

        @Override
        public String toString() {
            return "Available Yoga Classes \n Date: "+ date + "\n Time: " + time;
        }
    }
}
