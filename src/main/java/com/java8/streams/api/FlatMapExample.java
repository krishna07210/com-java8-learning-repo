package com.java8.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example : Get Unique letters from the Array of Strings.
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JavaDevProject", "Java", "SpringBoot", "MVC");
        List<String[]> uniqueWordsArray = words.stream()
                .map(x -> x.split(""))
                .distinct()
                .collect(Collectors.toList());
        //Stream<String[]>
        for (String[] word : uniqueWordsArray
        ) {
            for (String w : word) {
                //   uniqueWords.forEach(x -> System.out.println(x[0]));
                System.out.println(w);
            }
        }
        // Flat map will concatenate all the input Stream into Single Stream.
        List<String> uniqueWords = words.stream().map(x -> x.toLowerCase().split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Flat Map Output :: ");
        uniqueWords.forEach(x -> System.out.println(x));
    }
}
