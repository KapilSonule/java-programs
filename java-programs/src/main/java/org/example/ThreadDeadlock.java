package org.example;

public class ThreadDeadlock {

    String s1="Hello";
    String s2="World";

    Thread t1= new Thread("FirstThread") {
        @Override
        public void run() {
      while(true){
          synchronized (s1){
              synchronized (s2){
                  System.out.println("Thread 1: "+s1+"..."+s2);
              }
          }
      }
        }
    };


    Thread t2= new Thread("SecondThread") {
        @Override
        public void run() {
            while(true){
                synchronized (s2){
                    synchronized (s1){
                        System.out.println("Thread 2: "+s1+"..."+s2);
                    }
                }
            }
        }
    };
    public static void main(String[] args) {
    ThreadDeadlock dead= new ThreadDeadlock();
    dead.t1.start();
    dead.t2.start();
    }
}
