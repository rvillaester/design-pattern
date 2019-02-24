package com.behavioral.chainofresponsibility;

public class UpperCaseFilter extends Filter{
    @Override
    public String removeText(String text) {
        return text.replaceAll("[A-Z]", ".");
    }
}
