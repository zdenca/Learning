package org.learning;

import java.util.Objects;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class PersonT {
    private int id;
    private String name;

    public PersonT(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + ": " + name;
    }
}
