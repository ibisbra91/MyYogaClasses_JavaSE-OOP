package ui;

import com.sun.org.apache.bcel.internal.generic.Instruction;
import model.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIInstructorMenu {

    //este ArrayList<..> contendrá sólo los instructores que tienen clases de yoga disponibles (agenda libre)
    public static ArrayList<Instructor> instructorAvailableClasses = new ArrayList<>();

    /**DESCRPCIÓN: Este método se encarga de mostrar la Lógica de opciones para cada Instructor. A partir de que el Instructor ya hizo login. */
    public static void showInstructorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Instructor");
            System.out.println("Welcome😊" + UIMenu.instructorLoggead.getName());   //le tomo y le muestro su nombre
            System.out.println("1. Add Available Yoga Class");
            System.out.println("2. My schedule Yoga Class");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableYogaClassMenu();    //muestro las clases de yoga disponibles de ese Instructor
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);

    }

    //Manejo toda la Lógica para Instructor
    //1. Add Available Yoga Class
    /**DESCRIPCIÓN: Este método maneja la Lógica correspondiente a: adicionar clase de yoga disponible por parte del Instructor.*/
    private static void showAddAvailableYogaClassMenu(){
        int response = 0;
        do{
            System.out.println("::: Add Available Yoga Class");
            System.out.println("::: Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;             //  usé j (variable auxiliar) (y no "i") para que no altere la i del ciclo
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if( (response > 0) && (response < 4) ){  //la numeraciónd e los meses va en 1, 2 y 3 (desde 0 a 3, y 3 < 4)
                    //1, 2, 3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected -1 ]);  //"-1" porque acá me interesan los índices, que comienzan de 0 hasta MONTH.lengh -1
                System.out.println("Insert the date available. Format: [dd/mm/yyyy]");
                String date = sc.nextLine();                                                 //obtuve la fecha

                System.out.println("You date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;   //continue lo uso para evitar las siguientes líneas del ciclo
                                                  //y vuelve a iniciar donde se quedó (pero no se sale del ciclo, como sí haría "break")

                //ahora manejo la hora (antes manejé la fecha)
                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for date: " + date + "Format: [16:00]");
                    time = sc.nextLine();
                    System.out.println("You time is: " + time + "\n1. Correct \n2. Change Date");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);        //cuando es 2 debe mostrar sólo el bloque "Insert the time available for date"
                                                   //en cambio cuando sea distinto de 2, se sale del ciclo
                //cuando el Instructor confirmó  que el time elegido en "You time is" es "1. Correct",
                //entonces debo asignarle al Instructor loggeado, la clase de yoga disponible
                UIMenu.instructorLoggead.addClass(date, time);
                checkInstructorYogaCLasses(UIMenu.instructorLoggead);
            } else if (response == 0) {
                showInstructorMenu();

            }

        }while (response!=0);
    }

    /**DESCRIPCIÓN: Este método permite agregar un Instructor al array -> ArrayList<Instruction>
     * instructorAvailableClass (que contiene) sólo los instructores que tienen clases de yoga disponibles. */
    private static void checkInstructorYogaCLasses(Instructor inst){
        if ( (inst.getaA().size() > 0) && (!instructorAvailableClasses.contains(inst))){    //si sí tiene citas y si el Instructor parámetro no existe dentro de esa lista, adiciono el Instructor pasado por parámetro
           instructorAvailableClasses.add(inst);
        }
    }
}
