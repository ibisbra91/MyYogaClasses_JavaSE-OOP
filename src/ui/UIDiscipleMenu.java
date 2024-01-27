package ui;

import java.util.Scanner;

public class UIDiscipleMenu {
    public static void showDiscipleMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Disciple");
            System.out.println("Welcome: " + UIMenu.discipleLoggead);
            System.out.println("1. Book an Yoga Class");
            System.out.println("2. My Yoga Classes");
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

        }while (response != 0);
    }
    /**DESCRIPCIÓN: Este método maneja la Lógica correspondiente a:
     * adicionar clase de yoga disponible por parte del Disciple.*/
    private static void showBookYogaClassMenu(){
        int response = 0;
        do{
            System.out.println("::: Book Available Yoga Class");
            System.out.println("::: Select date:");


        }while (response != 0);
    }
}
