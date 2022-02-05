package se.mbaeumer.javalab.bifunctiondemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiFunctionDemoTest {

    @Test
    public void biFunctionDemoString() {
        String actual = BiFunctionDemo.biFunctionDemoString("John", "Doe");
        assertTrue("John Doe".equals(actual));
    }

    @Test
    public void biFunctionDemoStringExpressionLambda() {
        String actual = BiFunctionDemo.biFunctionDemoStringExpressionLambda("John", "Doe");
        assertTrue("John Doe".equals(actual));
    }

    @Test
    public void biFunctionDemoInt() {
        int actual = BiFunctionDemo.biFunctionDemoInt(7, 5);
        assertEquals(actual, 12);
    }
}