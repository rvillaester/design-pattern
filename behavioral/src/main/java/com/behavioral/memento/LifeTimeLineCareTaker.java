package com.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class LifeTimeLineCareTaker {

    private List<Memento> savedTimeLines;

    public LifeTimeLineCareTaker(){
        this.savedTimeLines = new ArrayList<>();
    }

    public void saveTimeLine(LifeTimeLine timeLine){
        savedTimeLines.add(timeLine.save());
    }

    public Memento restoreTimeLine(int index){
        if(index > savedTimeLines.size() || index < 0){
            System.out.println("No timeline saved on this index");
        }
        return savedTimeLines.get(index);
    }
}
