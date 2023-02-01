package org.example.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExamples {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.addLast("Z");
        deque.addFirst("0");
        deque.pollFirst();
//Traversing elements
        for (String str : deque) {
            System.out.println(str);

        }

    }
}
