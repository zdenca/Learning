package org.learning;

import java.sql.*;

/**
 * Created by Zdenca on 5/12/2017.
 */
public class JDBCStatementSelectExample {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "HR";
    private static final String DB_PASSWORD = "hr";

    public static void main(String[] argv) {

        try {

            selectRecordsFromUserTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void selectRecordsFromUserTable() throws SQLException {

        Connection connection = null;
        Statement statement = null;


        String selectTableSQL = "SELECT * FROM BOOKS";


        try {
            connection = getDBConnection();
            statement = connection.createStatement();

            System.out.println(selectTableSQL);


            // execute select SQL statement
            ResultSet resultSet = statement.executeQuery(selectTableSQL);


            while (resultSet.next()) {

                int bookid = resultSet.getInt("ID");
                String author = resultSet.getString("AUTHOR");
                String title = resultSet.getString("TITLE");
                String status = resultSet.getString("STATUS");

                System.out.println("bookid : " + bookid);
                System.out.println("author : " + author);
                System.out.println("title : " + title);
                System.out.println("status : " + status);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }


            if (connection != null) {
                connection.close();
            }


        }

    }

    private static Connection getDBConnection() {

        Connection connection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                    DB_PASSWORD);
            return connection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return connection;

    }

}

