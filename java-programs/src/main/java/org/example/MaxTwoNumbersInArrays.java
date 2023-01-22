package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxTwoNumbersInArrays {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,11,34};
        int maxOne=0;
        int maxTwo=0;

        for(int n:arr){
            if(maxOne<n){
                maxTwo=maxOne;
                maxOne=n;
            } else if (maxTwo<n) {
                maxTwo=n;
            }
        }
        System.out.println("Before Java 8 :max: "+maxOne +  "  : Second max: "+ maxTwo);
        //using java 8
        System.out.print(Arrays.toString(arr));
     int max=   Arrays.stream(arr).boxed().max(Integer::compare).get();
        System.out.println("max: "+max );
     List<Integer> numbs= Arrays.asList(23,12,13,1,3,4,51,43);
        Integer secondMax = numbs.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        Integer max1=numbs.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("max: "+max1 +  "  : Second max: "+ secondMax);
    }
}
