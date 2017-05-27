package org.learning;

/**
 * Created by Zdenca on 4/27/2017.
 */
public class User {
    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getName() + " " + getAge();
    }
}
