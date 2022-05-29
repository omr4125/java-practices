package com.example.limitstream;

import java.util.stream.IntStream;

public class LimitStream {
    public static void main(String[] args) {
        /*IntStream.iterate(2, i -> i + 5)
                .limit(10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);*/

        IntStream.iterate(0, i -> i + 1)
                .peek(System.out::print)
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::print);
    }
}
