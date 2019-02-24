package com.behavioral.chainofresponsibility;

public class LowerCaseFilter extends Filter{
    @Override
    public String removeText(String text) {
        return text.replaceAll("[a-z]", "");
    }
}
