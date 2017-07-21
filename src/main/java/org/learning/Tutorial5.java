package org.learning;

import java.util.*;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class Tutorial5 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("Mongoose");
        animals.add("elephant");

//        Collections.sort(animals, new StringLengthComparator());
//        Collections.sort(animals, new AlphabeticalComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        for (String animal : animals) {
            System.out.println(animal);
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(45);
        numbers.add(0);
        numbers.add(5);
        numbers.add(78);
        numbers.add(1);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        for (int number : numbers) {
            System.out.println(number);
        }
        List<PersonT> people = new ArrayList<>();
        people.add(new PersonT(1, "Joe"));
        people.add(new PersonT(3, "Bob"));
        people.add(new PersonT(4, "Clare"));
        people.add(new PersonT(2, "Sue"));

//        Collections.sort(people, new Comparator<PersonT>() {
//            @Override
//            public int compare(PersonT p1, PersonT p2) {
//                if (p1.getId() > p2.getId()) {
//                    return 1;
//                } else if (p1.getId() < p2.getId()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
        Collections.sort(people, new Comparator<PersonT>() {
            @Override
            public int compare(PersonT p1, PersonT p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (PersonT person : people) {
            System.out.println(person);

        }
    }
}
