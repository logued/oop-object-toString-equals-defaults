package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object superclass - default methods");

        Position p1 = new Position(10,20);

        System.out.println("Position p1 = " + p1.toString());

        Position p2 = new Position(10,20);

        if( p1.equals(p2))
            System.out.println("p1 is equal to p2");
        else
            System.out.println("p1 and p2 are not equal");

        if( p1.equals(p1))
            System.out.println("p1 is equal to p1");
        else
            System.out.println("p1 and p1 are not equal");

    }
}