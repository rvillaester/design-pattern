package com.behavioral.chainofresponsibility;

public class SpaceFilter extends Filter{
    @Override
    public String removeText(String text) {
        return text.replaceAll("\\s+","");
    }
}
