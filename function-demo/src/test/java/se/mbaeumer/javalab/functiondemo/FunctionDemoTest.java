package se.mbaeumer.javalab.functiondemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionDemoTest {

    @Test
    public void demoFunctionInterface() {
        FunctionDemo functionDemo = new FunctionDemo();
        String actual = functionDemo.demoFunctionInterface("Martin");
        assertTrue("Marti".equals(actual));
    }

    @Test
    public void demoFunctionInterfaceExpressionLambda() {
        FunctionDemo functionDemo = new FunctionDemo();
        String actual = functionDemo.demoFunctionInterfaceExpressionLambda("Martin");
        assertTrue("Marti".equals(actual));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void demoFunctionInterfaceExpressionLambdaEmptyString() {
        FunctionDemo functionDemo = new FunctionDemo();
        functionDemo.demoFunctionInterfaceExpressionLambda("");
    }

    @Test(expected = NullPointerException.class)
    public void demoFunctionInterfaceExpressionLambdaNullString() {
        FunctionDemo functionDemo = new FunctionDemo();
        functionDemo.demoFunctionInterfaceExpressionLambda(null);
    }
}