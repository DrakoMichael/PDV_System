package com.drakomichael.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.drakomichael.resources.applicationProperties;

public class JdbcInstance {
    private static DatabaseConnection instance;
    private Connection connection = DriverManager.getConnection(jbdc.url(), jbdc.username(), jbdc.password());;


    private void DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(jbdc.url(), jbdc.username(), jbdc.password());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco de dados!", e);
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
