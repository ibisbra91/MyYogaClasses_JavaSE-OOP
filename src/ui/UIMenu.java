package ui;

import java.util.Scanner;

public class UIMenu {


    public static void showMenu(){
        System.out.println("Welcome to Our Yoga Classes");
        System.out.println("Select the desired option:");

        int response = 0;
        do {
            System.out.println("1. Instructor");
            System.out.println("2. Disciple");
            System.out.println("0. Namasté");
            System.out.println("\n\n");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Instructor");
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
            System.out.println("Disciple");
            System.out.println("1. Book an class");
            System.out.println("2. My classes");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an class");
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
