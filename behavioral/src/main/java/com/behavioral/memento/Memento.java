package com.behavioral.memento;

public class Memento {

    private LifeTimeLine state;

    public Memento(LifeTimeLine state){
        this.state = state;
    }

    public LifeTimeLine getSavedLifeTime() {
        return state;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Life timeline is ");
        builder.append(state.getDate());
        return builder.toString();
    }
}
