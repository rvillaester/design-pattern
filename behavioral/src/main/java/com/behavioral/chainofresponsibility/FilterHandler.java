package com.behavioral.chainofresponsibility;

public class FilterHandler{

    private Filter nextFilter;
    private Filter rootFilter;

    public String doFilter(String text) {
        String str = text;
        Filter filter = rootFilter;
        while(filter != null){
            str = filter.removeText(str);
            filter = filter.getNextFilter();
        }
        return str;
    }

    public void addFilter(Filter filter){
        if (rootFilter == null) {
            rootFilter = filter;
        } else {
            nextFilter.setNextFilter(filter);
        }
        nextFilter = filter;
    }


}
