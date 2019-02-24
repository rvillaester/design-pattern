package com.behavioral.test;

import com.behavioral.iterator.CsvText;
import com.behavioral.iterator.Iterator;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void shouldIterate(){
        CsvText csvText = new CsvText("John,Male,23");
        Iterator<String> iter = csvText.getIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
