import java.util.ArrayList;
import java.util.Date;

//subclase(clase hija) que hereda(extiende de) la Superclase(clase Padre) 'User'.
// Precisa actualizar el COnstructor() en coherencia con el uso de Herencia POO.
public class Instructor extends User{
    private String style;  //atributo que hace unico a cada Instructor (elemento importante para la Lógica de la entidad/clase Instructor) es: el estilo predominante de yoga que imparte en su clase

    //este grupo de atributos(id, name, email, address, phoneNumber) se va de aquí desde ahora, pues pretendo manejar los datos redundantes entre las Entidades/Clases 'Instructor' y 'Disciple' como clases Hija comunicadas con una clase Padre/Superclase 'User' (más propio del Negocio y de la POO)
/*
    static int id = 0;        //autoincrement //en principio lo declaré static para practicar el uso y comprensión de 'static' como Autoincrement y con_y_sin usando el import además. Ahora ya lo elimino porque mi plan es manejar este id utilizando una Base de Datos posteriormente.
    private String name;
    private String email;
    private String address;     //parte del NEGOCIO:los datos 'address' y 'phoneNumber'  es útil que el Instructor los tenga pues tanto él como el Disciple serán Users de la app de reserva de clases de yoga, y estos 2 son datos requeridos para ellos comunicarse en esa app en construcción
    private String phoneNumber;*/

    /*
    Instructor(){
        System.out.println("Construyendo el Objeto Instructor con Constructor *VACÍO o por default*: ");
    }
*/

    // constructor por inicialización
    Instructor(String name, String email){
        super(name, email);                 //lo genero presionando teclas alt + enter justo delante de la llave abierta de este método Constructor. Por algún motivo que aún no comprendo, el IDE da error cuando lo escribo manualmente. No así cuando lo genero con la combinación de teclas alt + enter (lo acepta sin error así.)
        // id++;                            //a futuro cercano lo manejaré a través de una BD
        System.out.println("Construyendo el Objeto Instructor con Constructor *por inicialización*: " + name);
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

*//** DESCRIPCIÓN: Este método imprime el valor del id del Instructor.*//*
    public void showId(){
        System.out.println("ID Instructor: " + id);         //como id es 'static' puedo acceder a su valor sin escribir 'Instructor.id' dentro de la misma clase
    }*/

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
