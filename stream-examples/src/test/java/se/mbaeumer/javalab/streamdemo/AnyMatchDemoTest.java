package se.mbaeumer.javalab.streamdemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnyMatchDemoTest {
    @Test
    void anyMatchDemoWithLambdaTrue() {
        final List<String> names = List.of("John", "Martin", "Eve", "Donald");
        assertTrue(AnyMatchDemo.anyMatchDemoWithLambda(names, "Martin"));
    }

    @Test
    void anyMatchDemoWithLambdaFalse(){
        final List<String> names = List.of("John", "Martin", "Eve", "Donald");
        assertFalse(AnyMatchDemo.anyMatchDemoWithLambda(names, "Pelle"));
    }

    @Test
    void anyMatchDemoWithMethodTrue() {
        final List<String> names = List.of("John", "Martin", "Eve", "Donald");
        assertTrue(AnyMatchDemo.anyMatchDemoWithMethodReference(names, "Martin"));
    }

    @Test
    void anyMatchDemoWithMethodFalse() {
        final List<String> names = List.of("John", "Martin", "Eve", "Donald");
        assertFalse(AnyMatchDemo.anyMatchDemoWithMethodReference(names, "Pelle"));
    }
}
