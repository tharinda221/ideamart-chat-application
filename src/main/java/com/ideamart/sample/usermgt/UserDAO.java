package com.ideamart.sample.usermgt;

import com.ideamart.sample.database.DatabaseConnection;

import java.sql.*;

/**
 * Created by tharinda on 10/20/16.
 */
public class UserDAO {

    private Connection connection;
    private Statement stmt;

    public void AddUser(User user) throws ClassNotFoundException, SQLException {
        connection = DatabaseConnection.getDBInstance().getConnection();
        stmt = connection.createStatement();
        String sql = "INSERT INTO echat VALUES (" + "\"" + user.getAddress() + "\"" + "," + "\"" + user.getMessage() + "\"" +
                "," + "\"" + user.getFlow() + "\"" + "," + "\"" + user.getSubcription() + "\"" + ");";
        System.out.println(sql);
        stmt.executeUpdate(sql);

    }

    public boolean userAvailability(String address) throws ClassNotFoundException, SQLException {
        connection = DatabaseConnection.getDBInstance().getConnection();
        stmt = connection.createStatement();
        String query = "Select * from echat where address =" + "\"" + address + "\"" + ";";
        System.out.println(query);
        ResultSet resultSet = stmt.executeQuery(query);
        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean RegisterUserName(String address, String name) throws ClassNotFoundException {

        try {
            connection = DatabaseConnection.getDBInstance().getConnection();
            stmt = connection.createStatement();
            String sql = "INSERT INTO echat_usernames VALUES (" + "\"" + address + "\"" + "," + "\"" + name + "\"" + ");";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getUserAddressByName(String name) throws ClassNotFoundException {
        try {
            connection = DatabaseConnection.getDBInstance().getConnection();
            stmt = connection.createStatement();
            String query = "Select * from echat_usernames where name= " + "\"" + name + "\"" + ";";
            System.out.println(query);
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                return resultSet.getString("address");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String getUserNameByAddress(String address) throws ClassNotFoundException {
        try {
            connection = DatabaseConnection.getDBInstance().getConnection();
            stmt = connection.createStatement();
            String query = "Select * from echat_usernames where address= "+ "\"" + address + "\""  +";";
            System.out.println(query);
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                return resultSet.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "null";
        }
        return "null";
    }
}
