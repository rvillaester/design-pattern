package com.behavioral.test;

import com.behavioral.mediator.SmsMediatorImpl;
import com.behavioral.mediator.User;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void canMediate(){
        SmsMediatorImpl mediator = new SmsMediatorImpl();

        new User(mediator, "Albert");
        User john = new User("John");
        User mary = new User("Mary");
        User jane = new User("Jane");

        mediator.registerUser(john);
        mediator.registerUser(mary);
        mediator.registerUser(jane);

        mary.sendMessage("Hello World");
    }
}
