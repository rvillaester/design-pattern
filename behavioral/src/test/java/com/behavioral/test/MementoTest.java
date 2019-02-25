package com.behavioral.test;

import com.behavioral.memento.LifeTimeLine;
import com.behavioral.memento.LifeTimeLineCareTaker;
import com.behavioral.memento.Memento;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class MementoTest {

    @Test
    public void canRetriveMemento(){
        LifeTimeLineCareTaker careTaker = new LifeTimeLineCareTaker();

        LifeTimeLine timeline = new LifeTimeLine(getDate(1500, 3, 4));
        careTaker.saveTimeLine(timeline);
        timeline.setDate(getDate(1610, 7, 23));
        careTaker.saveTimeLine(timeline);
        timeline.setDate(getDate(2014, 1, 16));
        careTaker.saveTimeLine(timeline);
        timeline.setDate(getDate(2018, 8, 19));
        careTaker.saveTimeLine(timeline);
        timeline.setDate(getDate(2019, 11, 29));
        careTaker.saveTimeLine(timeline);

        System.out.println(careTaker.restoreTimeLine(0));
        System.out.println(careTaker.restoreTimeLine(2));

    }

    private Date getDate(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, day);
        return calendar.getTime();
    }
}
