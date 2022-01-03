package se.mbaeumer.javalab.streamdemo.flatmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatMapStringDemoTest {

    @Test
    void getAllCharacters() {
        FlatMapStringDemo demo = new FlatMapStringDemo();
        demo.getAllCharactersFromNamesList();
    }

    @Test
    void getAllCharactersFromList() {
        FlatMapStringDemo demo = new FlatMapStringDemo();
        demo.getAllCharactersFromList();
    }
}