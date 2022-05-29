package com.example.checkemptystring;

public class Main {
    public static void main(String[] args) {
        String str1 = "";
        if (str1 != null && str1.length() == 0)
            System.out.println("empty");

        //2
        System.out.println("".equals("asdf"));

        ///3
        System.out.println(str1.isEmpty());

        //4 --> StringUtils.isEmpty("") : Apache commons-lang
        //5 --> Spring: StringUtils.hasLength("" )
    }
}
