package org.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Zdenca on 5/24/2017.
 */
public class JDBCSelectInsert {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "HR";
    private static final String DB_PASSWORD = "hr";

    public static void main(String[] args) {

        try {
            insertRecordIntoTable();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void insertRecordIntoTable() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String insertTableSQL = "INSERT INTO BOOKS" +
                "(ID, AUTHOR, TITLE, STATUS)VALUES" + "(?,?,?,?)";

        try {
            connection = getDBConnection();
            preparedStatement = connection.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "Douwe Draaisma");
            preparedStatement.setString(3, "Metafory pameti");
            preparedStatement.setString(4, "Available");


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
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

            connection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return connection;

    }


}
