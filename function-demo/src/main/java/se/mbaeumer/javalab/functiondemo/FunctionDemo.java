package se.mbaeumer.javalab.functiondemo;

import java.util.Collection;
import java.util.function.Function;

public class FunctionDemo {
    public String demoFunctionInterface(String aString){
        Function<String, String> removeLastCharacter = (s1) -> {
            return s1.substring(0, s1.length() - 1);
        };

        return removeLastCharacter.apply(aString);
    }

    public String demoFunctionInterfaceExpressionLambda(String aString){
        Function<String, String> removeLastCharacter = (s) -> s.substring(0, s.length() - 1);
        return removeLastCharacter.apply(aString);
    }
}
