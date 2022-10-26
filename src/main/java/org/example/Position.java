package org.example;

// Has this class got a Superclass?
// YES, th eObject class is the superclass of all classes,
// so this class inherits from the Object class.

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
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
