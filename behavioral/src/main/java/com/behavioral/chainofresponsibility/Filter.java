package com.behavioral.chainofresponsibility;

public abstract class Filter {

    private Filter nextFilter;

    public abstract String removeText(String text);

    public void setNextFilter(Filter filter){
        this.nextFilter = filter;
    }

    public Filter getNextFilter() {
        return nextFilter;
    }
}
