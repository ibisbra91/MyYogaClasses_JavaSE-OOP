
public class Main {
    public static void main(String[] args) {


/*        Instructor myInstructor = new Instructor("Amaya Sol Luna", "Hatha Yoga");
        System.out.println(myInstructor.name);
        System.out.println(myInstructor.style);*/

        Disciple myDisciple = new Disciple("Monkey D. Luffy", "luffy@sombrero.de.paja.mugiwara.com");
        myDisciple.setWeight(54.6);                   //setea el valor del atributo private 'weight'
        System.out.println(myDisciple.getWeight());   //muestra ese nuevo valor de ese atributo (con la modificación definida en su get: "Kg.")

 //       myDisciple.setPhoneNumber("123456789");
/*      String a = myDisciple.getPhoneNumber();
        System.out.println(a);                         //retona null porque no se le ha asignado ningún valor aún a ese atributo "phoneNumber"*/

        myDisciple.setPhoneNumber("55123698");
        System.out.println(myDisciple.getPhoneNumber());




        //setter: setea(asigna o modifica) el valor de la variable, pero no devuelve nada, porque el set cambia y/o cambia-y-valida
         //getter: obtiene/valida el valor del atributo.
         // Con los Getters obtenemos los datos de las variables. Acción que devuelve un valor (tipo de retorno es el tipo de dato del retorno)

                                          //uso el set (que modifica el valor del atributo con el valor pasado como parámetro al invocar el propio método set)

        //para que lo muestre, uso el getter dentro de un mostrar/sout o lo asigno a una variable y la muestro luego
        //si al Getter no le asigné valor de retorno distinto del tipo de dato de ese atributo en esa clase,
        // mostrará el valor por default para el tipo de dato con el que se declaró el atributo al que se le generó el getter,
        // ya que el getter tiene como base un atributo declarado (con su tipo de datos).

        //En este caso, la variable height fue declarada como double.
        //Le generé automáticamente sus métodos get y set, teniendo en cuenta que la única modificación a su get fue agregarle la cadena "Mts."
        // Y le cambié el tipo de retorno, a String (para manejar ese retorno como cadena),
        //sin modificar directamente el número del retorno, o sea, utilizando como número, el valor del atributo en su forma básica, que fue declarado como atributo double,
        //de este modo:
          //uso el get del atributo. Se muestra ese valor por default en double que es 0.0
                                                         //uso el get (que obtiene el valor del atributo) y lo muestra con el sout
                                                        //con los Setters asignamos o cambiamos su valor.  Acción que no devuelve nada (tipo de retorno void), sólo realiza la modificación del valor de un atributo.

        //para mostrar un valor específico de height usaría el método set correspondiente a ese atributo







        }


    }

