package ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


    public static void showMenu(){
        System.out.println("Welcome to Our Yoga Classes");
        System.out.println("Select the desired option:");

        int response = 0;
        do {
            System.out.println("1. model.Instructor");
            System.out.println("2. model.Disciple");
            System.out.println("0. Namasté");
            System.out.println("\n\n");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Instructor");
                    break;
                case 2:
                    response = 0;
                    showDiscipleMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }


    static void showDiscipleMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Disciple");
            System.out.println("1. Book an class");
            System.out.println("2. My classes");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:                                                 //aquí, debería mostrar la lista de meses que tiene por ahí
                    System.out.println("::Book an class");
                    for (int i = 0; i < 3; i++) {                       //para mostrar la lista de los 3 1eros meses
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My classes");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}
