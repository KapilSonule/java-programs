package org.example;

@FunctionalInterface
interface ParentInterface {
    //Abstract Method
    public void absMethod();

    // Default Method 1
    public default String printMessage(String s) {
        return "Hello " + s;
    }

    public default String printMessage(String s, Integer roll) {
        return "Hello " + s + ", Your Roll Number is: " + roll;
    }
}

interface ChildInterface extends ParentInterface {
    public static String message() {
        return "Hello World";
    }
}

public class TestInterface implements ParentInterface {
    public static void main(String[] args) {
        ParentInterface test = new TestInterface();
        test.printMessage("Kapil");
    }

    @Override
    public void absMethod() {

    }
}