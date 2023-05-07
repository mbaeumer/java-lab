package se.mbaeumer.javalab.streamdemo.lambdavsmethodref.string;

import java.util.List;

public class LambdaVsMethodRefDemo {
    public static void demoLambda(){
        List<String> names = List.of("Adam", "Bertil", "Christer");
        names.stream().forEach(n -> System.out.println(n));
    }

    public static void demoMethodRef(){
        List<String> names = List.of("Adam", "Bertil", "Christer");
        names.stream().forEach(System.out::println);
    }
}
