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

    @Test
    public void shouldGetXI(){
        assertTrue("XI".equals(RomanNumberConverter.getRomanNumber(11)));
    }

    @Test
    public void shouldGetXII(){
        assertTrue("XII".equals(RomanNumberConverter.getRomanNumber(12)));
    }

    @Test
    public void shouldGetXIII(){
        assertTrue("XIII".equals(RomanNumberConverter.getRomanNumber(13)));
    }

    @Test
    public void shouldGetXIV(){
        assertTrue("XIV".equals(RomanNumberConverter.getRomanNumber(14)));
    }

    @Test
    public void shouldGetXV(){
        assertTrue("XV".equals(RomanNumberConverter.getRomanNumber(15)));
    }

    @Test
    public void shouldGetXVI(){
        assertTrue("XVI".equals(RomanNumberConverter.getRomanNumber(16)));
    }

    @Test
    public void shouldGetXVII(){
        assertTrue("XVII".equals(RomanNumberConverter.getRomanNumber(17)));
    }

    @Test
    public void shouldGetXVIII(){
        assertTrue("XVIII".equals(RomanNumberConverter.getRomanNumber(18)));
    }

    @Test
    public void shouldGetXIX(){
        assertTrue("XIX".equals(RomanNumberConverter.getRomanNumber(19)));
    }

    @Test
    public void shouldGetXX(){
        assertTrue("XX".equals(RomanNumberConverter.getRomanNumber(20)));
    }











}