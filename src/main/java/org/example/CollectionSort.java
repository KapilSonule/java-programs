package org.example;


import java.util.*;

public class CollectionSort {
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
        System.out.println("......After Collection Sort.......");
        list.stream().forEach(System.out::println);

        //-----------------------------------------------//
        List<String> list2 = new LinkedList<>();
        list2.add("India");
        list2.add("Pakistan");
        list2.add("United States");

        System.out.println("......Linked List.......");
        list2.stream().forEach(System.out::println);
        System.out.println("......Linked List in reverse order.......");
        list2.sort(Comparator.reverseOrder());
        list2.stream().forEach(System.out::println);

        System.out.println("......Linked List in natural order.......");
        list2.sort(Comparator.naturalOrder());
    }
}