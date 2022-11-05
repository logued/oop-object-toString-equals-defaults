package org.example;

// Demonstrates:
// That all classes inherit from the Object superclass
// That the methods defined in Object, and inherited by all classes,
// are of limited use, and thus should be overridden in all classes.
// That we can use a reference of type Object to refer to any object
// (as all objects are of type Object)

public class Main {
    public static void main(String[] args) {
        System.out.println("Object superclass - default methods");

        Point p1 = new Point(10,20);

        Object obj1 = p1;   // this is allowed as all objects are of type Object
        // obj1.getX();  // is an error, because there is no getX() method defined
                         // for the type of obj1 - which is type Object


        System.out.println("Position p1 = " + p1.toString());
        // if toString() is not implemented in Point, then it is the inherited
        // version of toString() that is used, and it simply gives the hashCode of the object.
        // We need to override th etoString() method in Point.

        Point p2 = new Point(10,20);

        // If equals() is not implemented in Point, then the inherited version
        // of equals() from Object superclass is used by Point.
        // It returns true if the objects p1 and p2 both refer to the same object.
        // Normally, however, we want to compare two objects based on their contents,
        // so we would normally implement equals() in Point with code to compare
        // two points based on the values in their fields.

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