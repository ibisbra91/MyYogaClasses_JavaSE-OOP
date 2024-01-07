public class Disciple {

    //click encima del nombre del atributo en la clase y    -> alt + insert  genera setters y los getters.
    //Los métodos setters y los getters, validan los parámetros/atributos de la clase  instanciar (a partir del objeto que se cree fuera de ella 😊)
    //se crean en la parte superior de la clase por default


    //las Reglas del Negocio se definen DENTRO de la clase a la que pertenecen, en los getter y los setter.
    //las validaciones hacen posible mantener la CONSISTENCIA de las las Reglas del Negocio del programa.

    //los setter y getter, son los métodos que se encargan de 'validar' los parámetros.

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
    /**DESCRIPTION: This method validates that the phone number has a maximum of 8 digits. If the phone number is 8 digits, assign that new value which is the parameter to the phoneNumber variable.  */
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("The phone number must be a maximum of 8 digits.");    //ej de una validación (VALIDO EN EL SET), dependerá de las Reglas del Negocio.
        } else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

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

    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Disciple(){
        System.out.println("Construyendo el Objeto Disciple con Constructor *VACÍO o por default*: ");
    }

    //el constructor por inicialización, se encarga de crear el objeto con los parámetros OBLIGATORIOS MÍNIMOS requeridos para ese objeto según la Lógica de Negocio del programa
    Disciple(String name, String email){
        System.out.println("Construyendo el Objeto Disciple con Constructor *por inicialización*: " + name + " con email: " + email);
        this.name = name;
        this.email = email;
    }


    //reglas del negocio, deben establecerse dentro de la clase que se instancia (a través del objeto para acceder a sus valores).
    //ej: siempre que se muestre el peso del discípulo, aparezca en Kg.
/*    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }*/



}
