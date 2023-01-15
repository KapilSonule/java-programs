package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedWord {
    public static void main(String[] args) {
        String s= "Twinkle Twinkle little star";
        String[] sarr = s.split(" ");
        Map<String,Integer> map=new HashMap<>();

        for (String word:sarr){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }
        map.entrySet().stream().forEach(m-> System.out.println("Key: "+m.getKey()+",Value: "+m.getValue()));
    }
}
