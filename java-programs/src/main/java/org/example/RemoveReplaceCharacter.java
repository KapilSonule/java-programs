package org.example;

public class RemoveReplaceCharacter {
    public static void main(String[] args) {
        String s1="Hello World 123Be15";
        System.out.println(s1.replace("World","Universe"));
        System.out.println(s1.replaceFirst("o","ew"));
        System.out.println(s1.replaceAll("([a-z])",""));
        System.out.println(s1.replaceAll("[^0-9]",""));
    }
}
