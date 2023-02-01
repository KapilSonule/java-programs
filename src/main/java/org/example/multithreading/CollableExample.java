package org.example.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CollableExample implements Callable {
    @Override
    public Object call() throws Exception {
        Random generator= new Random();
        Integer randomNumner= generator.nextInt(5);
        Thread.sleep(randomNumner*100);
        return randomNumner;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] tasks=new FutureTask[5];

        for (int i=0;i<5;i++){
            Callable callable= new CollableExample();
            tasks[i]=new FutureTask(callable);
            Thread t= new Thread(tasks[i]);
            t.start();
        }
        for (int i=0;i<5;i++){
            System.out.println("FutureTask: "+tasks[i].get());
        }
    }
}
