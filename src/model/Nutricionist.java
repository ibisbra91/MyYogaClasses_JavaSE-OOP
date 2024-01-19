package model;

public class Nutricionist extends User{                      //alt + enter justo delante del paréntesis abierto de esta line genera constructor por defecto de la actual clase Nutricionist CON LA HERENCIA incorporada en dicho consctructor (super(atributos mínimos necesarios para construir una instacia de la clase padre de Nutricionist, que es User))
    private String speciality;

    public Nutricionist(String name, String email) {         //constructor generado de la HERENCIA (Nutricionist es subclase de la SuperClase User, por tanto, como mínimo, para constrir un objeto de tipo Nutricionist debe crearse con los 2 atributos mínimos necesarios para crear la Superclase User de la que extiende/hereda)
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
