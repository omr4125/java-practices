package com.example.convertmaptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        convert(map);
    }

    private static void convert(Map<Integer, String> map) {
        //list of keys
        List<Integer> list = map.keySet()
                .stream().toList();
        System.out.println(list);

        ArrayList<Integer> listArr = map.keySet()
                .stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listArr);

        //list of value
        List<String> list1 = map.values()
                .stream().toList();
        System.out.println(list1);

        //list entries
        ArrayList<Map.Entry> listEntry = map.entrySet()
                .stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listEntry);

    }
}
