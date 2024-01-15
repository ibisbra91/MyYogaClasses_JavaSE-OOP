//subclase(clase hija) que hereda(extiende de) la Superclase(clase Padre) 'User'.
// Precisa actualizar el COnstructor() en coherencia con el uso de Herencia POO.
public class Disciple extends User{
    private String birthday;   //desde ahora los atributos que hacen a cada Disciple único (elementos importantes para la Lógica de la entidad/clase Disciple) son: fecha de nacimiento, peso, altura y tipo de sangre.
    private double weight;
    private double height;
    private String blood;

    //este grupo de atributos se va de aquí, pues pretendo manejar los adtos redundantes entre las Entidades/Clases 'Instructor' y 'Disciple' como clases Hija comunicadas con una clase Padre/Superclase 'User' (más propio del Negocio y de la POO)
/*    int id;             //en principio lo declaré static para practicar el uso y comprensión de 'static' como Autoincrement. Ahora ya lo elimino porque mi plan es manejar este id utilizando una Base de Datos posteriormente.
    private String name;
    private String email;
    private String address;
    private String phoneNumber;*/


    //constructor vacío
  /*  Disciple(){
        System.out.println("Construyendo el Objeto Disciple con Constructor *VACÍO o por default*: ");
    }*/

    //el constructor por inicialización. Se encarga de crear el objeto con los parámetros OBLIGATORIOS MÍNIMOS requeridos para ese objeto según la Lógica de Negocio del programa
    Disciple(String name, String email){
        super(name, email);  //aquí 'super' hace referencia al método Constructor de la clase Padre/Superclase. Es decir, la clase Padre/Super clase tiene en su constructor 'name' e 'email', por loq ue dentro del 'super' en clase hija/subclase llamó esos 2 atributos que HEREDO de la Superclase/clase Padre.. NOTA: recordar que 'super' representa al OBJETO Padre.
                             //cada Disciple sigue teniendo su name y su email, sólo que ya no están declarados en esta clase; sino que están declarados en la Superclase/clase Padre, y de allí los HEREDA.
                             //esta práctica provee al código mejor VISIBILIDAD/LEGIBILIDAD y REUTILIZACIÓN DE CÓDIGO.
        System.out.println("Construyendo el Objeto Disciple con Constructor *por inicialización*: " + name + " con email: " + email);

    }


    //-> alt + insert  genera setters y los getters.
    //Los métodos setters y los getters, validan los parámetros/atributos de la clase  instanciar (a partir del objeto que se cree fuera de ella 😊)
    //se crean en la parte superior de la clase por default


    //las Reglas del Negocio se definen DENTRO de la clase a la que pertenecen, en los getter y los setter.
    //las validaciones hacen posible mantener la CONSISTENCIA de las las Reglas del Negocio del programa.

    //los setter y getter, son los métodos que se encargan de 'validar' los parámetros.

    //estos getters y setters se van de aqui, trasladé la lógica implementada en el stPhoneNumber(..) de esta clase al set con mismo nombre (correspondiente) en la Superclase/Clase Padre.
    //Aunque pareciera que esos setters y getter ya no están en esta clase hija 'Disciple', en realidad sí están, pero INVISIBLES, y eso es gracias a la magia de la HERENCIA POO. Que también aporta claridad y orden al code.
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }    //si el Negocio contemplara alguna validación, podría realizarla a través de una expresión regular que valide esa estructura determinada. Podría ser en el Setter o el Getter, depende del contexto que estoy desarrollando.

    public void setEmail(String email) {  //podría validar el email con una expresión regular acá
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //una Regla del negocio es: los números de teléfonos deben tener 8 dígitos.
    //esta validación la integro DENTRO de la clase Disciple, DENTRO del método set correspondiente al atributo phoneNumber.
    */
/**DESCRIPTION: This method validates that the phone number has a maximum of 8 digits. If the phone number is 8 digits, assign that new value which is the parameter to the phoneNumber variable.  *//*

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("The phone number must be a maximum of 8 digits.");    //ej de una validación (VALIDO EN EL SET), dependerá de las Reglas del Negocio.
        } else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }
*/

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {

        return height + " Mts.";
    }

    public String getWeight() {

        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

}
