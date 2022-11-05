package org.example;

// A simple class to represent a point with an (x,y) location.
//
// Has this class got a Superclass?
// YES it has, as all classes inherit from the Object superclass.
// Therefore, this point class inherits the toString() and equals() and other methods from Object.
// However, the implementations that it inherits are not really very useful because
// the implementation of those methods in Object doesn't know about the fields of a Point class.
// So what is the solution?
// We must OVERRIDE those methods in the Point class.

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
