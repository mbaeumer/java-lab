package se.mbaeumer.javalab.romannumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    public void shouldGetI(){
        assertTrue("I".equals(RomanNumberConverter.getRomanNumber(1)));
    }

    @Test
    public void shouldGetII(){
        assertTrue("II".equals(RomanNumberConverter.getRomanNumber(2)));
    }

    @Test
    public void shouldGetIII(){
        assertTrue("III".equals(RomanNumberConverter.getRomanNumber(3)));
    }

    @Test
    public void shouldGetIV(){
        assertTrue("IV".equals(RomanNumberConverter.getRomanNumber(4)));
    }

    @Test
    public void shouldGetV(){
        assertTrue("V".equals(RomanNumberConverter.getRomanNumber(5)));
    }

    @Test
    public void shouldGetVI(){
        assertTrue("VI".equals(RomanNumberConverter.getRomanNumber(6)));
    }

    @Test
    public void shouldGetVII(){
        assertTrue("VII".equals(RomanNumberConverter.getRomanNumber(7)));
    }

    @Test
    public void shouldGetVIII(){
        assertTrue("VIII".equals(RomanNumberConverter.getRomanNumber(8)));
    }

    @Test
    public void shouldGetIX(){
        assertTrue("IX".equals(RomanNumberConverter.getRomanNumber(9)));
    }

    @Test
    public void shouldGetX(){
        assertTrue("X".equals(RomanNumberConverter.getRomanNumber(10)));
    }







}