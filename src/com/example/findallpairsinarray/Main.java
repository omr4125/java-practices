package com.example.findallpairsinarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        findAllPairs(new int[]{1, 2, 3, 4, 5, 6}, 5);
    }

    private static void findAllPairs(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum){
                    int[] subArr = {arr[i], arr[j]};
                    System.out.println(Arrays.toString(subArr));
                }
            }
        }
    }
}
