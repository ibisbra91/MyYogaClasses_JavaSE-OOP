package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Instructor extends User{
    private String style;

    // constructor por inicialización
   public Instructor(String name, String email){
        super(name, email);
    }

//getter y setter
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    /** DESCRIPCIÓN: El objeto aA contiene la lista de clases de Yoga Disponibles del model.Instructor.
     *  Es un array de AvailableYogaClass que he estado construyendo cada vez que añadí una clase.
     *  Voy a estar convirtiendo al objeto/array aA en un toString() al sobreescribir el toString()
     *  para que almacene los datos de cada clase.*/
    ArrayList<AvailableYogaClass> aA = new ArrayList<>();           //colección de OBJETOS de tipo AvailableYogaClass

    public void addClass(String date, String time){                   //incrementa la lista de clases de yoga de ese model.Instructor
        aA.add(new Instructor.AvailableYogaClass(date, time));
    }

    public ArrayList<AvailableYogaClass> getaA(){                   //devuelve la lista completa de clases de yoga
        return aA;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Style: " + style + "\n Available: " + aA.toString();      //para model.Instructor voy a reutilizar el comportamiento que ya está definido para el toString() en su superclase model.User y le añado que también muestre el valor de su atributo propio -> styley fecha con formato sencillo.
    }

    /** DESCRIPCIÓN: Este método brinda información acerca de los usuarios Instructor.*/
    @Override
    public void showDataUser() {
        System.out.println("Fundación donde se formó como Instructor de Instructores de Yoga:\n Escuela Internacional de la Cultura Ayurveda");
        System.out.println("Sede: Barcelona");
        System.out.println("Barrio: Gracia");
        System.out.println("\n");
    }

    public static class AvailableYogaClass{
        private int id;
        private Date date;   //Available Class
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");              //esta clase permite FORMATEAR FECHAS y trabajar con ellas
                                                                                           //con ella, puedo definir el formato de Date/String que será aceptado

        public AvailableYogaClass(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId_AvailableClass() {
            return id;
        }

        public void setId_AvailableClass(int id_AvailableClass) {
            this.id = id_AvailableClass;
        }

        public Date getDate() {    //puede que lo use para mostrar los datos de una Fuente de Datos (en un formato de Date)
            return date;
        }

        /**DESCRIPCIÓN: Este método convierte la fecha 'DATE' que recibe por parámetro, de formato Date a String. */
        public String getDate(String DATE) {  //para mostrar datos, puede que me resulte más útil menipular la date como String (que haga lo INVERSO)
            return format.format(date);       //ejemplo de sobrecarga del método getDate()
                                              //donde DATE funciona como flag
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

