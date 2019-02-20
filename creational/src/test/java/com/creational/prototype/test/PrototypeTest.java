package com.creational.prototype.test;

import com.creational.prototype.Person;
import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void testPrototype(){
        int id = 1;
        String name = "John Smith";
        String gender = "Male";
        Person original = new Person(id, name, gender);
        Assert.assertEquals(1, original.getId());
        Assert.assertEquals(name, original.getName());
        Assert.assertEquals(gender, original.getGender());

        Person clone = (Person) original.createCopy();
        Assert.assertEquals(1, clone.getId());
        Assert.assertEquals(name, clone.getName());
        Assert.assertEquals(gender, clone.getGender());
    }
}
