package ru.tech_interv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(

                "One",
                "Two",
                "Three",
                "Four"

        ));


        list = list.stream()

                .map(e ->e.substring(1))
                .sorted()
                .collect(Collectors.toList());


        list.forEach(System.out::println);

    }

}