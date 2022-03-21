package se.mbaeumer.javalab.streamdemo.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public void doStuff(){
        // joining +
        // averaging +
        // counting +
        // groupingBy +
        // maxBy +
        // minBy +
        // reducing +
        // partitioningBy +
        // summarizing
        // summing
        // teeing

        List<String> strings = List.of("alpha", "beta", "gamma");
        //strings.stream().collect(Collectors.)
    }

    public static String joiningDemo(){
        List<String> strings = List.of("alpha", "beta", "gamma");
        return strings.stream().collect(Collectors.joining());
    }

    public static String joiningDemoWithCharacter(){
        List<String> strings = List.of("alpha", "beta", "gamma");
        return strings.stream().collect(Collectors.joining(","));
    }

    public static Double averagingIntDemo(){
        List<String> nums = List.of("5", "7", "6");
        //Collectors.averagingInt(ToIntFunction)
        return nums.stream().collect(Collectors.averagingInt(e -> Integer.parseInt(e)));
    }

    public static Long countingDemo(){
        List<String> nums = List.of("5", "7", "6");
        return nums.stream().collect(Collectors.counting());
    }

    public static Map<Severity, List<Bug>> groupingByWithNonPrimitiveDemo(){
        List<Bug> nums = createBugs();
        //Collectors.groupingBy(Function<? super T, ? extends K> classifier)
        return nums.stream().collect(Collectors.groupingBy(Bug::getSeverity));
    }

    public static Map<Integer, List<Integer>> groupingByWithIntegerDemo(){
        List<Integer> numbers = List.of(5,9,9,7,5);
        return numbers.stream().collect(Collectors.groupingBy(Integer::intValue));

    }

    public static Integer maxByDemo(){
        List<Integer> numbers = List.of(5,9,7,4,2);
        //Collectors.maxBy(Comparator<? super T> comparator)
        return numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).orElseThrow(NoSuchElementException::new);
    }

    public static Integer minByDemo(){
        List<Integer> numbers = List.of(5,9,7,4,2);
        //Collectors.minBy(Comparator<? super T> comparator)
        return numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder())).orElseThrow(NoSuchElementException::new);
    }

    public static Integer reducingDemo(){
        List<Integer> ints = List.of(5,7,3,8,8,7,3,3,3);
        //Collectors.reducing(T identity, BinaryOperator<T> op)
        return ints.stream().collect(Collectors.reducing(0, (a,b) -> a+b));
    }

    public static Map<Boolean, List<Integer>> partitioningByDemo(){
        List<Integer> ints = List.of(5,7,3,8,8,7,3,3,3);
        //Collectors.partitioningBy(Predicate<? super T> predicate)
        return ints.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
    }

    public static IntSummaryStatistics summarizingDemo(){
        List<Integer> ints = List.of(5,7,3,8,8,7,3,3,3);
        //Collectors.summarizingInt(ToIntFunction<? super T> mapper)
        return ints.stream().collect(Collectors.summarizingInt(Integer::intValue));
    }

    public static Integer summingDemo(){
        List<Integer> ints = List.of(5,7,3,8,8,7,3,3,3);
        //Collectors.summingInt(ToIntFunction<? super T> mapper)
        return ints.stream().collect(Collectors
                .summingInt(Integer::intValue));
    }

    public static Map<String, Optional<Integer>> teeingDemo(){
        List<Integer> ints = List.of(5,7,3,8,8,7,3,3,3);
        /*
        Collectors.teeing(Collector<? super T, ?, R1> downstream1,
                Collector<? super T, ?, R2> downstream2,
                BiFunction<? super R1, ? super R2, R> merger)
         */
        return ints.stream().collect(Collectors
                .teeing(Collectors.minBy(Comparator.comparing(Integer::intValue)),
                        Collectors.maxBy(Comparator.comparing(Integer::intValue)),
                        (e1, e2) -> {
                            Map<String, Optional<Integer>> map = new HashMap<>();
                            map.put("MIN", e1);
                            map.put("MAX", e2);
                            return map;
                        }));
    }

    public static List<Bug> createBugs(){
        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug(1, "text", Severity.LOW));
        bugs.add(new Bug(2, "text", Severity.HIGH));
        bugs.add(new Bug(3, "text", Severity.HIGH));
        bugs.add(new Bug(4, "text", Severity.MEDIUM));
        bugs.add(new Bug(5, "text", Severity.HIGH));
        bugs.add(new Bug(6, "text", Severity.HIGH));
        bugs.add(new Bug(7, "text", Severity.LOW));
        bugs.add(new Bug(8, "text", Severity.LOW));
        bugs.add(new Bug(9, "text", Severity.HIGH));
        bugs.add(new Bug(10, "text", Severity.MEDIUM));

        return bugs;
    }
}
