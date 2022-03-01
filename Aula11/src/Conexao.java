/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author thayrone
 */
public class Conexao {
    private final static String connUrl="jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=aulaDB";
    private static Connection conexao;
    public static Connection conectar(){
        try {
            conexao = DriverManager.getConnection(connUrl,"sa","4242524");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
    
    public static void desconectar(){
    
        try{
        
            conexao.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
}
 