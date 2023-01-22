package org.example;

//@FunctionalInterface. These interfaces are as follows –
//
//        Runnable –> This interface only contains the run() method.
//        Comparable –> This interface only contains the compareTo() method.
//        ActionListener –> This interface only contains the actionPerformed() method.
//        Callable –> This interface only contains the call() method.
@FunctionalInterface
interface FunctionalTest{
    int calculate(int a);
    default String details(String name, String role){
        return "Hi , "+name+" ("+role+").";
        }
        }
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        FunctionalTest testFIcalculate= (int x) -> x*x;
        System.out.println("Multiplication:"+ testFIcalculate);


    }
}
