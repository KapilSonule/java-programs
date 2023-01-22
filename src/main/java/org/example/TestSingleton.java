package org.example;

import java.io.*;

class SingletonPattern implements Serializable {

    public static SingletonPattern single= new SingletonPattern();

    private SingletonPattern(){

    }
    public String message(String text){
        return text;
    }

    //Implementing read resolve To protect Singleton from breaking
    protected Object readResolve(){ return single;}
}

public class TestSingleton {
    public static void main(String[] args) {
        SingletonPattern single1 = SingletonPattern.single;
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(single1);
            out.close();

            //deserialization
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));

            SingletonPattern single2 = (SingletonPattern) in.readObject();
            in.close();
            System.out.println(single1.hashCode());
            System.out.println(single2.hashCode());
        } catch (Exception e) {

        }

    }
}
