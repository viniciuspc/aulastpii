package br.com.fiap.dao;
import java.sql.*;
public class Dao {
    private String url="jdbc:mysql://localhost:3306/dbjstl?user=root&password=fiap";

    protected Connection cn;
    protected PreparedStatement stmt;
    protected ResultSet rs;

    protected boolean abrirConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url);
            return true;
        }
        catch(Exception ex) {
            return false;
        }
    }

    protected void fechaConexao() {
        try {
            cn.close();
        } catch (Exception ex) {

        }
    }
}
