package com.java.array;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(i -> {
                    System.out.print("1");
                    return i % 2 == 0;
                })
                .filter(i -> {
                    System.out.print("0");
                    return i > 3;
                })
                .limit(1)
                .forEach(i -> {
                    System.out.print(i);
                });
        
        BiFunction<String, String, Boolean> compareString = (x, y) -> x.equals(y);
        System.out.println(compareString.apply("Java8", "Java8"));
        
    }
}
