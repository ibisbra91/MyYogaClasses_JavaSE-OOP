package ui;

import model.Instructor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
            //mostrar las fechas que dejaron libres los Istructores
            //Map<c,f> donde "c" y "f" son OBJETOS (por esto no puedo poner int, sino que pongo Integer, por ej.)
            //almacena la numeración de la lista de fechas
            //índice de la feha que seleccione en disciple
            //[instructor1, instructor2] donde cada uno de esos OBJETOS tiene su propio Array de ClasesYoda disponibles
            //recorro el Instructor que sí tiene clases de yoga disponibles,
            //cuando encontré un Instructor de estos,
            //le pido sus clases disponibles y las asigno en este objeto "availableClasses" (en esta colección de fechas disponibles)
            //TreeMap class de Java, facilita una estructura de árbol
            Map<Integer, Map<Integer, Instructor>> instructors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIInstructorMenu.instructorsAvailableClasses.size(); i++) {
                ArrayList<Instructor.AvailableYogaClass> availableClasses = UIInstructorMenu.instructorsAvailableClasses.get(i).getaA();

                Map<Integer, Instructor> instructorClasses = new TreeMap<>();

                for (int j = 0; j < availableClasses.size(); j++) {
                    k++;
                    //devuelve la fecha con formato
                    System.out.println(k + ". " + availableClasses.get(j).getDate());  //dame las fechas
                    //por un lado capturo el índice del Instructor y por otro, capturo la fecha seleccionada
                    instructorClasses.put(Integer.valueOf(j), UIInstructorMenu.instructorsAvailableClasses.get(i));
                    //esta nueva estructura de datos que estoy creando me va a ayudar a manipular  mejor la salida que le quiero dar a los users
                    instructors.put(Integer.valueOf(k), instructorClasses);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            //para que cuando tenga la fecha, saber qué instructor le muestro al user
            //(A qué Instructor le corresponde, esa fecha que ese user detectó?)






        }while (response != 0);
    }
}
