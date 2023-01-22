package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("Pakistan");
        list.add("United States");
        list.add("Malaysia");
        list.add("Australia");
        list.add("France");

        list.stream().forEach(System.out::println);
        Collections.sort(list);
        System.out.println("......After Array Sort.......");
        //Converting list into array

        String [] countries= list.toArray(new String[list.size()]);
        Arrays.sort(countries);

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
