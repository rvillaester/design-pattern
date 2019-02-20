package com.creational.abstractfactory.test;

import com.creational.abstractfactory.*;
import junit.framework.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testShape(){
        AbstractFactory factory = FactoryCreator.getFactory(FactoryType.SHAPE);
        Shape shape = factory.getShape(ShapeType.CIRLE);
        Assert.assertEquals("Cirle", shape.getName());

        shape = factory.getShape(ShapeType.SQUARE);
        Assert.assertEquals("Square", shape.getName());
    }

    @Test
    public void testArithmeticOperation(){
        AbstractFactory factory = FactoryCreator.getFactory(FactoryType.ARITHMETIC_OPERATION);
        ArithmeticOperation operation = factory.getOperation(OperationType.MULTIPLY);
        Assert.assertEquals(10.0, operation.calculate(2,5));

        operation = factory.getOperation(OperationType.ADD);
        Assert.assertEquals(7.0, operation.calculate(2,5));

        operation = factory.getOperation(OperationType.MINUS);
        Assert.assertEquals(-3.0, operation.calculate(2,5));
    }

}
