package org.learning;


/**
 * Created by Zdenca on 5/9/2017.
 */
public class Man extends Person {
    private double income;

    public Man(String name, String address, int birthOfYear, double income) {
        super(name, address, birthOfYear);
        this.income = income;
    }

    @Override
    public String toString() {
        return super.toString() + ", income: " + income;
    }
}
