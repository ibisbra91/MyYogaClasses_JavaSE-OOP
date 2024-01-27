package model;

public class Disciple extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Disciple(String name, String email){
        super(name, email);
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
