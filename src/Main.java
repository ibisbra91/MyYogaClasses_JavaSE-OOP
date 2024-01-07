
public class Main {
    public static void main(String[] args) {


        Instructor myInstructor = new Instructor("Amaya Sol Luna", "Hatha Yoga");
        System.out.println(myInstructor.name);
        System.out.println(myInstructor.style);

        Disciple myDisciple = new Disciple("Monkey D. Luffy", "luffy@sombrero.de.paja.mugiwara.com");
        myDisciple.setWeight(54.6);                   //setea el valor del atributo private 'weight'
        System.out.println(myDisciple.getWeight());   //muestra ese nuevo valor de ese atributo (con la modificación definida en su get: "Kg.")

 //       myDisciple.setPhoneNumber("123456789");
/*      String a = myDisciple.getPhoneNumber();
        System.out.println(a);                         //retona null porque no se le ha asignado ningún valor aún a ese atributo "phoneNumber"*/

        myDisciple.setPhoneNumber("55123698");
        System.out.println(myDisciple.getPhoneNumber());

        /** @see
         * @see https://profile.es/blog/clases-wrapper-envoltorio-en-java/
         * @see */
        int i = 0;                                     //i --> variable de tipo de datos Primitivo o simple (int)
        String word = "wonder";                        //word -> OBJETO de tipo String. String es un caso de OBJETO de Java "atípico".
                                                       //STRING No es tipo de dato primitivo/simple de Java ni es clase wrapper, SÍ es un tipo de OBJETO de Java.

                                                       // En Java, tenemos Wrapper Class o clase 'envoltorio' NO PRIMITIVA de Java.

                                                       // ("envoltorio" porque estas clases 'envuelven' los tipos de datos PRIMITIVOS/simples para manipular esos OBJETOS.
                                                       // OBJETOS que 'equivalen' a los tipos de datos primitivos/simples de Java)
                                                       // y les proveen métodos para manipular estos valores)
                                                       //son clases diseñadas para ser un complemento de los tipos primitivos.

                                                       // clases wrapper/envoltorio en Java son: Integer, Float, Boolean, Character, Double, Long, Short,Byte
                                                       // tipos de datos primitivos/simples en Java son: int, float, boolean, char, double, long, short, byte
                                                       //String es un caso atípico en este sentido.+
                                                       // String NO ES una clase Wrapper pues NO TIENE UN TIPO DE DATOS PRIMITIVO asociado a STRING.

/*                                                        sources: https://www.programiz.com/java-programming/wrapper
                                                                   https://profile.es/blog/clases-wrapper-envoltorio-en-java/
                                                                   https://www.javatpoint.com/wrapper-class-in-java
                                                                   https://www.w3schools.com/java/java_wrapper_classes.asp*/







        }


    }

