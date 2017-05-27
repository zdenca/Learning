package org.learning;

/**
 * Created by Zdenca on 4/27/2017.
 */
public class DemoUser {

    public static void main(String[] args) {
        User u1 = new User("Jan Novak", 28);
        User u2 = new User("Josef Novy", 32);
        System.out.println(u1);
        System.out.println(u2);
        int a = 56;
        int b = 29;
        u1.setAge(a);
        u2.setAge(b);
        System.out.println(u1 + " and  " + u2);


    }
}
