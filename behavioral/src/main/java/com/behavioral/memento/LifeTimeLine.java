package com.behavioral.memento;

import java.util.Date;

public class LifeTimeLine {

    private Date date;

    public LifeTimeLine(Date date){
        this.date = date;
    }

    public Memento save(){
        return new Memento(new LifeTimeLine(date));
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
