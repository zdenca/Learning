package org.learning;

import java.sql.*;

/**
 * Created by Zdenca on 5/24/2017.
 */
public class JDBCUpdate {
   public static String title;



    public static void main(String[] argv) {
    try {

        Class.forName("oracle.jdbc.driver.OracleDriver");

    } catch (ClassNotFoundException e) {

        System.out.println("Where is your Oracle JDBC Driver?");
        e.printStackTrace();
        return;

    }
    Statement statement = null;
    Connection connection = null;

    try {
        connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl", "HR", "hr");
        statement = connection.createStatement();
        String sql = "SELECT title FROM books";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            title = rs.getString("title");

            System.out.println(title);

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
}//end main
    public String toString() {
        return title + " ";
    }
}
