package org.learning;

import java.sql.*;

/**
 * Created by Zdenca on 5/25/2017.
 */
public class StudentDAO {
    Connection connection = null;

    public void connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "HR", "hr");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Student getStudent(int id) {

        try {
            String query = "select name from student where id=" + id;
            Student s = new Student();
            s.id = id;

            try {

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                resultSet.next();
                String name = resultSet.getString(1);
                s.name = name;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addStudent(Student student) {
        String query = "insert into Student values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, student.id);
            preparedStatement.setString(2, student.name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
