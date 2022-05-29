package com.example.findmissingnumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,5,5,7,9,9,9);
        List<Integer> listNumbers = IntStream.rangeClosed(1, 9).boxed().toList();
        for (Integer i : listNumbers) {
            if (!list.contains(i))
                System.out.println(i);
        }
    }
}
