package org.example.inheritance;
class Base02 {

    static String s = "";
    protected Base02() {
        s += " Base Class Message!\n";
    }
    private final void message() {
        System.out.println("Base Class Message");
    }
}

class Child02 extends Base02{
    private Child02(){
        s+=" Child class msg!";
    }
}
public class Inheritance01 extends Base02 {
    private Inheritance01(){
        s+=" main class msg!";
    }
    public final void message() {
        System.out.println("Child Class Message");
    }
    public static void main(String[] args) {
        new Inheritance01();
        System.out.println(s);
    }
}
