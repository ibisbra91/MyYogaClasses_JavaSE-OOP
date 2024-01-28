package model;

import java.util.ArrayList;
import java.util.Date; //manualmente

public class Disciple extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    //Aquí dejo guardadas todas las clases de yoga que esté manejando este Disciple
    /** DESCRIPCIÓN: La variable "ArrayList<ClassInstructor> classInstructors"
     * contendrá todas las clases de yoga de ClassInstructor
     * que esté manejando cada Disciple.*/
    private ArrayList<ClassInstructor> classInstructors = new ArrayList<>();

    /** DESCRIPCIÓN: La variable "ArrayList<ClassNutricionist> classNutricionists"
     * contendrá todas las clases de yoga de ClassNutricionist
     * que esté manejando cada Disciple.*/
    private ArrayList<ClassNutricionist> classNutricionists = new ArrayList<>();

    public Disciple(String name, String email){
        super(name, email);
    }



    public ArrayList<ClassInstructor> getClassInstructors() {
        return classInstructors;
    }

    public void addClassInstructors(Instructor instructor, Date date, String time) {
        //this.classInstructors = classInstructors;
        ClassInstructor classInstructor = new ClassInstructor(this, instructor);
        //podría estar reservando el Instructor, sin tener la fecha ni la hora aún, solucionándolo:
        classInstructor.Schedulable(date, time);  //decido la fecha y la hora
        classInstructors.add(classInstructor); //queda lista la clase de yoga (la cita)
    }

    public ArrayList<ClassNutricionist> getClassNutricionists() {
        return classNutricionists;
    }

    public void setClassNutricionists(ArrayList<ClassNutricionist> classNutricionists) {
        this.classNutricionists = classNutricionists;
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

    @Override
    public String toString() {
        return super.toString() + "\n Age: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight() + "\n Blood: " + blood;
    }
    /** DESCRIPCIÓN: Este método brinda información acerca de los usuarios Disciple.*/
    @Override
    public void showDataUser() {
        System.out.println("Discípulo");
        System.out.println("Prácticas anteriores: holísticas, físicas.");
        System.out.println("\n");
    }
}
