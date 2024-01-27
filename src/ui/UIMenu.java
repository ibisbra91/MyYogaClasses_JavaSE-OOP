package ui;

import model.Instructor;
import model.Disciple;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Instructor instructorLogged;
    public static Disciple discipleLoggead;

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
                    response = 0;
                    authUser(1);;
                    break;
                case 2:
                    response = 0;
                    System.out.println("Disciple");
                    authUser(2);
                    //showDiscipleMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    /**DESCRIPCIÓN: Este método maneja la autenticación. Lo hago simulando que traigo datos de
     * una Fuente de Datos, con uso de ArrayList<> .*/
    private static void authUser(int userType){
        //userType = 1 Instructor
        //userType = 2 Disciple

        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Edward Newgate","barbablanca@endava.com"));
        instructors.add(new Instructor("Shanks","pelirrojo@arsys.com"));
        instructors.add(new Instructor("Monkey D. Luffy","mugiwara@globant.com"));

        ArrayList<Disciple> disciples = new ArrayList<>();
        disciples.add(new Disciple("Kozuki Momonosuke","shogunWano@sonda.uy"));
        disciples.add(new Disciple("Carrot","mink@SignUp.es"));
        disciples.add(new Disciple("Tony Tony Chopper","renoMedicoWano@universalSolutionstech.uy"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for (Instructor i: instructors) {
                    if(i.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del user loggeado
                        instructorLogged = i;
                        UIInstructorMenu.showInstructorMenu();


                    }
                }
            }
            if (userType == 2){
                for (Disciple d: disciples){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del user loggeado
                        discipleLoggead = d;
                        //showDiscipleMenu
                    }
                }

            }
        }while (!emailCorrect);

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
                case 1:                                                 

                    System.out.println("::Book an class");
                    for (int i = 0; i < 3; i++) {
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
