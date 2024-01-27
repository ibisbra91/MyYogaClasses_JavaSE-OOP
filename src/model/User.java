package model;

//la Superclase es la que contiene los datos redundantes
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {  //como mínimo, para que un user exista, se precisa su name y su email. Los usaré en su registro.
        this.name = name;
        this.email = email;
    }

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
            System.out.println("The phone number must be a maximum of 14 characters.");
        } else if(phoneNumber.length() == 14){
            this.phoneNumber = phoneNumber;
        }
    }

                                @Override
                                public String toString() {
                                    return "model.User: " + name + "\n Email: " + email + "\n Address: " + address + "\n Phone: " + phoneNumber;
                                }
/** DESCRIPCIÓN: Este método brinda información acerca de los usuarios. */
public abstract void showDataUser();

}

