package ui;

import model.Instructor;
import model.Disciple;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Instructor instructorLoggead;
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

    //acá manejo la authentication, simulando con uso de ArrayList<> que traigo datos de una Fuente de Datos
    private static void authUser(int userType){  //userType indica el resultado final que deberia traer
        //userType = 1 Instructor
        //userType = 2 Disciple
        //aquí quiero simular como si tuviera una lista de Instructores y otra de Discipuls
        //simulación => como si fuera a mi capa de persistencia de datos y me trajera todos los usuarios
        //que tengo registrados allí con queries, según el tipo de usuarios que sea:
        // Instructor o Disciple O Nutricionist (Nutricionist lo hago luego)
        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Edward Newgate","barbablanca@endava.com"));
        instructors.add(new Instructor("Shanks","pelirrojo@arsys.com"));
        instructors.add(new Instructor("Monkey D. Luffy","mugiwara@globant.com"));

        ArrayList<Disciple> disciples = new ArrayList<>();
        disciples.add(new Disciple("Kozuki Momonosuke","shogunWano@sonda.uy"));
        disciples.add(new Disciple("Carrot","mink@SignUp.es"));
        disciples.add(new Disciple("Tony Tony Chopper","renoMedicoWano@universalSolutionstech.uy"));

        boolean emailCorrect = false;  //por default va a estar en falso, hasta que haga la verificación
        do{                             //y cambie a true
            System.out.println("Insert your email. Format: qws@sdf.com");
            Scanner sc = new Scanner(System.in);  //para leer lo que el user teclee
            String email = sc.nextLine();
            if(userType == 1){                     //si es 1, irá y verificará en el ArrayList<Instructor>. Si tuviera una BD, estos datos los tendría allí y me los traería con queries
                for (Instructor i: instructors) {  //tengo que recorrer todos los Instructors hasta encontrar el email que recibí, de modo que el email entrdao por el user haga match con alguno de los emails que ya tengo registrados/existen/persistencia de datos
                    if(i.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener los datos del user loggeado
                        instructorLoggead = i;
                        //showDoctorMenu
                        UIInstructorMenu.showInstructorMenu();


                    }
                }                                     //
            }
            if (userType == 2){                    //si es 2, irá y verificará en el ArrayList<Disciple>
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
