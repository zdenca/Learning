package org.learning;

/**
 * Created by Zdenca on 5/9/2017.
 */
public class Child extends Person {
    private String parent;

    public Child(String name, String address, int birthOfYear, String parent) {
        super(name, address, birthOfYear);
        this.parent = parent;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + parent;
    }
}
