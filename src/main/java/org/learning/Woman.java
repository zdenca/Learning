package org.learning;

/**
 * Created by Zdenca on 5/9/2017.
 */
public class Woman extends Person {
    private double m1;
    private double m2;
    private double m3;

    public Woman(String name, String address, int birthOfYear, double m1, double m2, double m3) {
        super(name, address, birthOfYear);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return super.toString() + ", vital statistics: " + m1 + ", " + m2 + ", " + m3;
    }
}
