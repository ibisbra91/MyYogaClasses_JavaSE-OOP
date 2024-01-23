package model;

import java.util.Date;

//Creando una interfaz para definir si una clase de yoga (con el instructor y el nutricionista, en principio) es agendable
public interface Ischedulable {
    void Schedulable(Date date, String time);
}
