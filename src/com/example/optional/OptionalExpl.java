package com.example.optional;

import java.util.Optional;

public class OptionalExpl {
    public static void main(String[] args) {

        //creating empty Optional
        Optional<String> empty = Optional.empty();

        //returns an Optional with the specified present non-null value.
        String name = "java";
        Optional<String> opt = Optional.of(name);

        //returns an Optional describing the specified value,
        //if non-null, otherwise returns an empty Optional.
        Optional<String> optional = Optional.ofNullable(name());
        System.out.println(optional);

        //Return true if there is a value present; otherwise, it's false
        Optional<String> optional1 = Optional.of("java is the best");
        if (optional1.isPresent()){
            System.out.println("Optional isPresent()--true");
        }

        //Return false if there is a value present; otherwise, it's true.
        Optional<String> optional2 = Optional.of("javaone");
        if (optional2.isEmpty()){
            System.out.println("Optional isEmpty()--true");
        }else{
            System.out.println("Optional isEmpty()--false");
        }

        //If a value is present, invoke the specified consumer with the value; otherwise, do nothing
        Optional<String> optional3 = Optional.of("java-one");
        optional3.ifPresent(s -> System.out.println(s.length()));

        //If a value is present in this Optional, returns the value,
        // otherwise throws NoSuchElementException.
        //However, this method throws an exception when the value is null;
        // that's when the orElse() method comes to the rescue.
        Optional<String> optional4 = Optional.of("java is not the best");
        if (optional4.isPresent()){
            System.out.println(optional4.get());
        }

        //Return the value if present; otherwise, return other.
        String nullStr = null;
        String str = Optional.ofNullable(nullStr).orElse("default str");
        System.out.println(str);

    }

    private static String name() {
        String name = "java";
        return (name.length() > 5 ? name : null);
    }
}
