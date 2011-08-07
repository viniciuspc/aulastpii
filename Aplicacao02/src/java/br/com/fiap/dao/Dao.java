package br.com.fiap.dao;
import java.sql.*;

public class Dao {
    protected Connection cn;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    protected String info;

    private String url="jdbc:mysql://localhost:3306/aplicacao2?user=root&password=fiap";

    protected boolean abrirConexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url);
            return true;
        }
        catch(Exception ex){
            info = ex.getMessage();
            return false;
        }
    }

    protected void fecharConexao(){
        try{
            cn.close();
        }
        catch(Exception ex){}
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }
}
