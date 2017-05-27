package org.learning;

/**
 * Created by Zdenca on 5/9/2017.
 */
public class Person {
    private String name;
    private String address;
    private int yearOfBirth;


    public Person(String name, String address, int yearOfBirth) {
        this.name = name;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return name + ", " + address + ", birth: " + yearOfBirth;
    }

}
