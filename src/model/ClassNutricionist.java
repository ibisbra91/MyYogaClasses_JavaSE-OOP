package model;

import java.util.Date;

public class ClassNutricionist implements Ischedulable{

    private int id;
    private Disciple disciple;
    private Nutricionist nutricionist;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disciple getDisciple() {
        return disciple;
    }

    public void setDisciple(Disciple disciple) {
        this.disciple = disciple;
    }

    public Nutricionist getNutricionist() {
        return nutricionist;
    }

    public void setNutricionist(Nutricionist nutricionist) {
        this.nutricionist = nutricionist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void Schedulable(Date date, String time) {

    }
}
