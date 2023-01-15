package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionToSynchronizedCollection {
    public static void main(String[] args) {
        LocalTime startTime= LocalTime.now();
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("ten");
        list.add("five");


        Collections.synchronizedCollection(list);

        synchronized (list) {
            Iterator i = list.iterator(); // Must be in the synchronized block
            while (i.hasNext())
                System.out.println(i.next());
        }
        LocalTime endTime= LocalTime.now();


        Duration duration =Duration.between(startTime,endTime);
        long totalTime=duration.getSeconds();
        System.out.println("TotalTime: "+totalTime);

    }
}
