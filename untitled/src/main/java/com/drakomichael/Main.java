package com.drakomichael;

import com.drakomichael.resources.applicationProperties;
import java.sql.*;
import com.drakomichael.repository.JdbcInstance;

public class Main {
    public static void main(String[] args) {
        applicationProperties jbdc = new applicationProperties();

            try {
                Connection connection = DriverManager.getConnection(jbdc.url(), jbdc.username(), jbdc.password());
                Statement statement = connection.createStatement();

                JdbcInstance.getInstance();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS");

                while (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String nome = resultSet.getString("NAME");

                    System.out.println("ID: " + id + ", Nome: " + nome);
                }

                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            };
        };
    }