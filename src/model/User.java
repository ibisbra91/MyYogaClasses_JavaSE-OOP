package model;

//la Superclase es la que contiene los datos redundantes
public abstract class User {       //integra las subclases 'model.Instructor' y 'model.Disciple' que psan a ser clases Hijas(subclases) de esta clase Padre(Superclase) 'model.User'
                          //contiene en principio, los atributos comunes/repetidosEnlasClasesHijas en ambas subclases: id, name, email, address, phoneNumber
    private int id;
    private String name;
    private String email;   //agregado, pues el programa va a permitir elegir si soy un model.Instructor o si soy un Discípulo, y esa identificación será a partir de usar el email de cada uno.
    private String address;
    private String phoneNumber;

    public User(String name, String email) {  //como mínimo, para que un user exista, se precisa su name y su email. Los usaré en su registro.
        this.name = name;
        this.email = email;
    }

    //getter y setters de todos los atributos --> alt + insert
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
    }

    public void setEmail(String email) {
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

    public void setPhoneNumber(String phoneNumber) {
        //this.phoneNumber = phoneNumber;
        if(phoneNumber.length() > 14){
            System.out.println("The phone number must be a maximum of 14 characters.");    //ej de una validación (VALIDO EN EL SET), dependerá de las Reglas del Negocio.
        } else if(phoneNumber.length() == 14){
            this.phoneNumber = phoneNumber;
        }
    }

                                @Override
                                public String toString() {             //sólo escribí toString y el IDE me ayuda a sobreescribir el método, completándolo como está en la clase Padre OBJECT, para que haga mi sobreescritura aquí en la clase hija model.User
                                    return "model.User: " + name + "\n Email: " + email + "\n Address: " + address + "\n Phone: " + phoneNumber;
                                }
/** DESCRIPCIÓN: Este método brinda información acerca de los usuarios. */
//este método debe ser ABSTRACT 'cause
//este método al hacerlo abstract, debe tener un comportamiento RADICAL en cada una de las clases que HEREDAN/extienden de clase User (Padre y Abstracta)
public abstract void showDataUser();

}

