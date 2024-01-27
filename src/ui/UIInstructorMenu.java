package ui;

import model.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIInstructorMenu {

    /** Este ArrayList<..> contendrá sólo los instructores que tienen clases de yoga disponibles (agenda libre). */
    public static ArrayList<Instructor> instructorsAvailableClasses = new ArrayList<>();

    /**DESCRPCIÓN: Este método se encarga de mostrar la Lógica de opciones para cada Instructor. A partir de que el Instructor ya hizo login. */
    public static void showInstructorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Instructor");
            System.out.println("Welcome😊 " + UIMenu.instructorLogged.getName());   //le tomo y le muestro su nombre
            System.out.println("1. Add Available Yoga Class");
            System.out.println("2. My scheduled Yoga Classes");
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

        }while (response!= 0);

    }

    //Manejo toda la Lógica para Instructor
    //1. Add Available Yoga Class
    /**DESCRIPCIÓN: Este método maneja la Lógica correspondiente a: adicionar clase de yoga disponible por parte del Instructor.*/
    private static void showAddAvailableYogaClassMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::: Add Available Yoga Class");
            System.out.println("::: Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if( (response > 0) && (response < 4) ){
                    //1, 2, 3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected -1 ]);
                System.out.println("Insert the date available. Format: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("You date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;


                //ahora manejo la hora (antes manejé la fecha)
                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for date: " + date + ". Format: [16:00]");
                    time = sc.nextLine();
                    System.out.println("You time is: " + time + "\n1. Correct \n2. Change Date");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);
                UIMenu.instructorLogged.addClass(date, time);
                checkInstructorYogaCLasses(UIMenu.instructorLogged);
            } else if (response == 0) {
                showInstructorMenu();

            }

        }while (response!= 0);
    }

    /**DESCRIPCIÓN: Este método permite agregar un Instructor al array -> ArrayList<Instruction>
     * instructorAvailableClass (que contiene) sólo los instructores que tienen clases de yoga disponibles. */
    private static void checkInstructorYogaCLasses(Instructor inst){
        if ( (inst.getaA().size() > 0) && (!instructorsAvailableClasses.contains(inst))){
           instructorsAvailableClasses.add(inst);
        }
    }
}
