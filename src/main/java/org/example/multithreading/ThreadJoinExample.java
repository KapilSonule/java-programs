package org.example.multithreading;

public class ThreadJoinExample implements Runnable{
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println("Current Thread: "+ t.getName());
        System.out.println("Is Alive: "+ t.isAlive());

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new ThreadJoinExample());
        Thread t2=new Thread(new ThreadJoinExample());
        t1.start();
        System.out.println("Current Thread: "+ t1.getName());
        t1.join(1000);
        t2.start();
        t2.join(2000);
        System.out.println("Current Thread: "+ t1.getName());
        System.out.println("Is Alive: "+ t1.isAlive());
    }
}
