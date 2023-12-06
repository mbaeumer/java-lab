package se.mbaeumer.javalab.functionalprogramming.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinElementsTest {

    private JoinElements joinElements = new JoinElements();

    @Test
    void joinOldSchool() {
        // final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");
        final String joined = joinElements.joinOldSchool();
        Assertions.assertEquals("Brian,Lisa,John,Mary,Bob,Sara", joined);
    }

    @Test
    void joinWithStreams() {
        final String joined = joinElements.joinWithStreams();
        Assertions.assertEquals("Brian,Lisa,John,Mary,Bob,Sara", joined);

    }
}