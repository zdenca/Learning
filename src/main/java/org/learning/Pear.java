package org.learning;

/**
 * Created by Zdenca on 5/18/2017.
 */
public class Pear {
    private int price;

    public Pear(int price) {
        this.price = price;
    }

    public void print() {
        System.out.print(price + ", ");
    }

    @Override
    public String toString() {
        return " " + price;
    }
}
