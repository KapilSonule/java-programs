package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringManupulation {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);
        //reverse String
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("Using StringBuilder: " + reverseStr);

        //using for-if way
        char[] ch = str.toCharArray();
        for (int i = str.length() - 1; i > 0; i--) {
            System.out.print(ch[i]);
        }

    }
}
