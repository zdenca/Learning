package org.learning;

/**
 * Created by Zdenca on 5/25/2017.
 */
public class JDBCDaoDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
//        Student s1 = dao.getStudent(5);
//        System.out.println(s1.name);
        Student s2 = new Student();
        s2.id = 6;
        s2.name = "Ariadne";
        dao.addStudent(s2);

    }

}
