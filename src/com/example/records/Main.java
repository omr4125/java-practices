package com.example.records;

public class Main {
    public static void main(String[] args) {
        CourseHero hero = new CourseHero(1, "Record", "omr");
        System.out.println(hero.authorName());
        hero.toString();
    }
}
