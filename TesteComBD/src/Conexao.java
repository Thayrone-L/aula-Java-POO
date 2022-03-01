/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thayrone
 */
public class Conexao {

    private final static String connUrl = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=aulaDB";
    private static Connection conexao;

    public static Connection conectar() {
        try {
            conexao = DriverManager.getConnection(connUrl, "sa", "4242524");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Conctou no banco");
        return conexao;
    }

    public static void desconectar() {

        try {

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("desConctou no banco");

    }

    public static void salvarVisitante(String nome, int idade, String sexo) {
        String strSalvar = "INSERT INTO visitantes(nome, idade, sexo) VALUES(?,?,?)";
        try {
            conectar();
            PreparedStatement stm = conexao.prepareStatement(strSalvar);
            stm.setString(1, nome);
            stm.setInt(2, idade);
            stm.setString(3, sexo);
            stm.execute();
            stm.close();
            desconectar();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void deletarVisitante(String nome) {
        String strDeletar = "DELETE FROM visitantes WHERE nome=?";
        try {
            conectar();
            PreparedStatement stm = conexao.prepareStatement(strDeletar);
            stm.setString(1, nome);
            stm.execute();
            stm.close();
            desconectar();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList listaVisitante() {
        
           ArrayList listaV = new ArrayList();
 
        String strConsultar = "SELECT * FROM visitantes";
        try {
            conectar();
            PreparedStatement stm = conexao.prepareStatement(strConsultar);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                Integer id = result.getInt("id");
                String nome = result.getString("nome");
                Integer idade = result.getInt("idade");
                String sexo = result.getString("sexo");
                String resultado = "ID: " + id + " Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo;
                listaV.add(resultado);
            }
            stm.close();
            desconectar();
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaV;
    }
}
