package com.example.findhighestrepeatingword;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> wordMap = new HashMap<>();

        FileInputStream fis = new FileInputStream("src/find_highest_repeating_word/file.txt");
        DataInputStream dis = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));

        Pattern pattern = Pattern.compile("\\s+");
        String line = null;
        while ((line = br.readLine()) != null){
            line = line.toLowerCase();
            String[] words = pattern.split(line);
            for (String word : words) {
                if (wordMap.containsKey(word))
                    wordMap.put(word, (wordMap.get(word) + 1));
                else
                    wordMap.put(word, 1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = wordMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
