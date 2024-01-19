package model;

import java.util.Date;

public class ClassInstructor implements Ischedulable{
    private int id;
    private Disciple disciple;
    private Instructor instructor;
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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
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
