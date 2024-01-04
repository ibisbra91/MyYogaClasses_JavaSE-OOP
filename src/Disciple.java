public class Disciple {

    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    Disciple(){
        System.out.println("Construyendo el Objeto Disciple con Constructor *VACÍO o por default*: ");
    }

    Disciple(String name, String email){
        System.out.println("Construyendo el Objeto Disciple con Constructor *por inicialización*: " + name + " con email: " + email);
        this.name = name;
        this.email = email;
    }
}
