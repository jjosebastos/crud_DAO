package org.example;

import org.example.config.DatabaseConfig;
import org.example.entities.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        DatabaseConfig dbConfig = new DatabaseConfig(
                "jdbc:oracle:thin@oracle.fiap.com.br:1521:ORCL",
                "rm559221",
                "jn100800");

        Pessoa pessoa = new Pessoa(4L, "Mari", 22);

        create(dbConfig, pessoa);


    }

    private static void create(DatabaseConfig dbConfig, Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO pessoa_1tdspz(id, nome, idade) VALUES(?,?,?)";

        Connection con = dbConfig.getConnection();
        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setLong(1, pessoa.getId());
        stmt.setString(2, pessoa.getName());
        stmt.setInt(3, pessoa.getIdade());

        stmt.executeUpdate();
    }


}