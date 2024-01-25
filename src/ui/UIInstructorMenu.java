package ui;

import javax.swing.*;
import java.util.Scanner;

public class UIInstructorMenu {
    /**DESCRPCIÓN: Este método se encarga de mostrar la Lógica de opciones para cada Instructor. A partir de que el Instructor ya hihzo login. */
    public static void showInstructorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Instructor");
            System.out.println("Welcome😊" + UIMenu.instructorLoggead.getName());   //le tomo su nombre
            System.out.println("1. Add Available Yoga Class");
            System.out.println("2. My schedule Yoga Class");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
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
    private static void showAddAvailableYogaClass(){
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
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available. Format: [dd/mm/yyyy]");
                String date = sc.nextLine();                                                 //obtuve la fecha

                System.out.println("You date is: " + date + "\n1. Correct \n2. Change Date");

            } else if (response == 0) {
                showInstructorMenu();

            }

        }while (response!=0);
    }
}
