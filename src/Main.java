import java.util.Date;

public class Main {
    public static void main(String[] args) {

      Disciple d1 = new Disciple("Roronoa Zoro", "espadachin@gmail.com");
      String address = "Barcelona, Avenida Flores del Campo, edificio Mar y Costa, apto 198";
      d1.setAddress(address);
      String phone = "+52 95 659 236";
      d1.setPhoneNumber(phone);
      String age = "Por implementar método que la calcule a partir de la fecha de nacimiento. 😋";
      d1.setBirthday(age);
      double weight = 76.5;
      d1.setWeight(weight);
      double height = 1.80;
      d1.setHeight(height);
      String blood = "AB+";
      d1.setBlood(blood);

      System.out.println(d1);

     /* Disciple d2 = new Disciple("Nami", "navegante@gmail.com");

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1.getName());
        System.out.println(d2.getName());
        d2 = d1;

        System.out.println("\n");

        System.out.println(d1.getName());      //el declarado inicialmente
        System.out.println(d2.getName());      //el asignado posteriormente ( ambos el mismo valor post-asignación)

        d2.setName("Nami-san");
        System.out.println(d1.getName());
        System.out.println(d2.getName());*/


        System.out.println("\n");


        Instructor myInstructor = new Instructor("Amaya Sol Luna", "Hatha Yoga");
        myInstructor.addClass(new Date(),"6am");
        myInstructor.addClass(new Date(),"7am");
        myInstructor.addClass(new Date(),"8am");

      //  System.out.println(myInstructor.getaA());

        for (Instructor.AvailableYogaClass aAA: myInstructor.getaA()) {
            System.out.println(aAA.getDate() + " " + aAA.getTime());
        }


        }


    }

