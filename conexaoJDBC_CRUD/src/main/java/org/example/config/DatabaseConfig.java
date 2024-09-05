package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    //informações para conectar
    //host, porta, schema (ambiente dentro do banco de dados), user, senha


    private final String url;
    private final String user;
    private final String password;


    public DatabaseConfig(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("url", "user", "password");
    }


}
