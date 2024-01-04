public class Disciple {

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

    Disciple(String name, String email){
        System.out.println("Construyendo el Objeto Disciple con Constructor *por inicialización*: " + name + " con email: " + email);
        this.name = name;
        this.email = email;
        this.weight = 54.2;
        this.height = 1.2;
        System.out.println(weight + "Kg.");
    }
}
