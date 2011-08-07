package br.com.fiap.dao;
import java.sql.*;
public class Dao {
    private String url="jdbc:mysql://localhost/javabeans?user=root&password=fiap";

    protected Connection conn;
    protected PreparedStatement stmt;
    protected ResultSet rs;

    protected boolean abreConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url);
            return true;
        }
        catch(Exception ex) {
            return false;
        }
    }

    protected void fechaConexao() {
        try {
            conn.close();
        } catch (Exception ex) {

        }
    }
}

