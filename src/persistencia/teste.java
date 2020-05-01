/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yan
 */
public class teste {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconsultorio?useTimezone=true&serverTimezone=UTC", "root","");
        System.out.println("Conectado!");
        
        String query = "SELECT * FROM paciente";
        
        System.out.println(query);
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
        int id = rs.getInt("idPaciente");
        String name = rs.getString("nome");
        String cpf = rs.getString("cpf");
        
        
        // print the results
        System.out.format("%d, %s, %s", id, name, cpf);
            }
        }catch (Exception e){
            System.out.println("Got an exception! ");
        }
        
        conexao.close();
        
                
                }
    }
