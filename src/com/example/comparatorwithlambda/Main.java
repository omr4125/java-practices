package com.example.comparatorwithlambda;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(140, Color.RED),
                new Apple(190, Color.RED),
                new Apple(150, Color.GREEN),
                new Apple(100, Color.GREEN),
                new Apple(170, Color.RED),
                new Apple(110, Color.GREEN)
        );
//        list.sort(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple a1, Apple a2) {
//                return a1.getWeight() - a2.getWeight();
//            }
//        });
//        System.out.println(list);

        //list.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());
        list.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(list);
    }
}
