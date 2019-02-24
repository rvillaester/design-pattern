package com.behavioral.chainofresponsibility;

public class NumberFilter extends Filter {

    @Override
    public String removeText(String text) {
        return text.replaceAll("[0-9]","");
    }
}
