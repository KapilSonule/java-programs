package org.example.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//CopyOnWriteArrayList creates a Cloned copy of underlying ArrayList, for every update operation at a certain point both will be synchronized automatically, which is taken care of by JVM.
// Therefore, there is no effect for threads that are performing read operation.
public class CopyOnWriteArrayListExample extends Thread {
    static CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<>();

    @Override
    public void run(){
    l.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");


        CopyOnWriteArrayListExample copy= new CopyOnWriteArrayListExample();
        copy.start();

            Thread.sleep(1000);

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
