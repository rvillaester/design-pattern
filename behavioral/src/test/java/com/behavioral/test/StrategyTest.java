package com.behavioral.test;

import com.behavioral.strategy.*;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void canExecuteDifferentStrategy(){
        new Context(new Filipino()).executeStrategy();
        new Context(new Japanese()).executeStrategy();
        new Context(new English()).executeStrategy();
        new Context(new Spanish()).executeStrategy();
    }
}
