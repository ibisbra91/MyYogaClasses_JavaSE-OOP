import model.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


      Disciple d1 = new Disciple("Roronoa Zoro", "espadachin@gmail.com");
      String address = "Ctra. de les Aigües, Parque: Paseo de las Aguas, Horta-Guinardó, 08035 Barcelona, España";
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

      System.out.println(d1);  //llama implícitamente al método toString() de ese objeto que quiero imprimir. Sería redundante escribirlo (en Java).

     /* model.Disciple d2 = new model.Disciple("Nami", "navegante@gmail.com");

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
        System.out.println(d2.getName());


        System.out.println("\n");

        showMenu();  */

        Instructor myInstructor = new Instructor("Amaya Sol Luna", "amayasl@hotmail.com");
/*        myInstructor.addClass(new Date(),"6am");
        myInstructor.addClass(new Date(),"7am");
        myInstructor.addClass(new Date(),"8am");*/

        String addressMyInstructor = "C/ Alonso Cano, 64, 03015 Alacant, Gym: Basic-Fit, Alicante, España";
        myInstructor.setAddress(addressMyInstructor);
        String phoneMyInstructor = "+52 94 856 378";
        myInstructor.setPhoneNumber(phoneMyInstructor);
        String styleMyInstructor = "Hatha Yoga";
        myInstructor.setStyle(styleMyInstructor);

      System.out.println("\n");


      //utilizando un 'modelo de polimorfismo' que consiste en: uso el objeto User instanciado como Instructor y Nutricionist PARA DARLE COMPORTAMIENTO a cada objeto de estos, pues NO ES POSIBLE crear un objeto User por sí sólo, pues la clase User es una clase ABSTACTA, y una de las reglas de las clases ABSTRACTAS es justo esa: no se puede crear instancias de ellas, pero sí las puedo usar así como 'modelo de polimorfismo'
      //esto va perfecto con la lógica del Negocio, pues la clase User la agregué yo al código para favorecer las bondades de la POO en Java a través de usarla como clase ABSTRACTA,
      //ya que la lógica del negocio sólo menciona a otras entidades como Instructor, Discípulo y Nutricionista y las relaciones entr ellas.
      User userInstructor = new Instructor("Jinbe el Caballero del Mar", "jinbe@arsys.com");
      userInstructor.showDataUser();

      User userNutricionist = new Nutricionist("Vinsmoke Sanji", "sanji@indra.com");
      userNutricionist.showDataUser();

      User userDisciple = new Disciple("Marco el Ave Inmortal", "marco@bbva.com");
      userDisciple.showDataUser();

      //uso de clase anónima, hack para usar la clase abtracta User para crear una instancia de ella.
      //implica que sólo es utilizable dicha instancia 'user1' en este bloque,
      //es decir, una vez la ejecución del programa pase este bloque, esa instancia de clase anónina user1 deja de existir para el programa.
      //puedo invocar/llamar el método sobreescrito para usar temporalmente acá, sólo desde acá usando la instancia de la clase anónima
      User user1 = new User("Eiichiro Oda","oda@creativo.com") {
        @Override
        public void showDataUser() {
          String name = "Eiichiro Oda";
          System.out.println("Instructor: " + name);
          System.out.println("Fundación donde se formó como Instructor de Instructores de Yoga:\n GRUPO DE ENTRENAMIENTO del INSTITUTO NITEN KENDO-KENJUTSU y IAIJUTSU");
          System.out.println("Sede: URUGUAY");
          System.out.println("\n");
        }
      };

      user1.showDataUser();

/*
      Ischedulable ischedu = new Ischedulable() {
        @Override
        public void Schedulable(Date date, String time) {

        }
      };

      //lo uso con lambdas en sgte curso: Programación Funcional con Java, ahora mantengo el foco en lo que estoy para avanzar 😊 :
      Ischedulable ischedu = new ClassInstructor();
      System.out.println(ischedu.Schedulable());
*/


      //  System.out.println(myInstructor.getaA());

/*
        for (model.Instructor.AvailableYogaClass aAA: myInstructor.getaA()) {
            System.out.println(aAA.getDate() + " " + aAA.getTime());
        }
*/

      //System.out.println(myInstructor);

        }


    }

