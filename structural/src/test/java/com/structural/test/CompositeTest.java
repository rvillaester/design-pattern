package com.structural.test;

import com.structural.composite.Directory;
import com.structural.composite.RawFile;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void canTraverseFilesInDirectory(){
        Directory d1 = new Directory("D1");
        Directory d11 = new Directory("D11");
        d1.addChild(new RawFile("F1.txt"));
        d1.addChild(d11);
        d11.addChild(new RawFile("F11.sh"));
        d11.addChild(new RawFile("F11.pom"));
        d1.traverse();
    }
}
