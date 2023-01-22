package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedChars {
    public static void main(String[] args) {
        String str="Hello there! I am not using WhatsApp";
        int count=0;
        int maxCount=0;


        Map<Character,Integer> map=new HashMap();
        char [] ch =str.toCharArray();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                  count ++;
                }
            }

        if(count>maxCount){
            maxCount=count;
            char letter = ch[i];
//            System.out.print(letter);
        }
        }
//2nd way : using Map
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        map.entrySet().stream().forEach(System.out::println);
        System.out.println(map.values().stream().max(Comparator.naturalOrder()).get());
        //Using java 8

        Map<Character,Long> map8= str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        map8.forEach((k,v)-> System.out.println(k+ " : "+v));

    }
}
