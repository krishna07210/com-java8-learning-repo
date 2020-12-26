package com.java8.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java Dev Project", "Java", "Spring Boot", "MVC");
        List<Integer> wordslength = words.stream().map(String::length).collect(Collectors.toList());
        wordslength.forEach(x->System.out.println(x));
    }
}
