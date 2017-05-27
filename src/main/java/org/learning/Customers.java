package org.learning;

import java.util.Arrays;

/**
 * Created by Zdenca on 5/9/2017.
 */
public class Customers {
    public static void main(String[] args) {
        Person[] listOfCustomers = new Person[10];
        Man c1 = new Man("Jan", "nitra", 1990, 23000);

        listOfCustomers[0] = c1;
        listOfCustomers[1] = new Man("Ferda", "zilina", 1986, 70_000);
        listOfCustomers[2] = new Woman("Zuzana", "zilina" , 1985, 90, 50, 90);
        listOfCustomers[3] = new Child("Zuzana", "zilina", 2010, "maminka");

//        System.out.println(Arrays.toString(listOfCustomers));
        for(int i = 0; i < 4; i++) {
            System.out.println(listOfCustomers[i].toString());
        }
    }

}
