package org.learning;

import java.sql.*;

/**
 * Created by Zdenca on 5/12/2017.
 */
public class OracleJDBCExample {
    public static void main(String[] argv) {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");
        Statement statement = null;
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "HR", "hr");

            statement = connection.createStatement();
            String sql = "SELECT author FROM books";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String first_name = rs.getString("author");

                System.out.println(first_name);

            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}


//        } catch (SQLException e) {
//
//            System.out.println("Connection Failed! Check output console");
//            e.printStackTrace();
//            return;
//
//        }
//
//        if (connection != null) {
//            System.out.println("You made it, take control your database now!");
//        } else {
//            System.out.println("Failed to make connection!");
//        }




