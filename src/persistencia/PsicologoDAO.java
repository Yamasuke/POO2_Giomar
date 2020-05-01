/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import negocio.Psicologo;

/**
 *
 * @author Yan
 */
public class PsicologoDAO implements IPsicologoDAO{
    
     private Connection connection;
     
     public PsicologoDAO(){
         this.connection = new ConFactory().getConnection();
     }
     
    @Override
    public void adiciona(Psicologo psicologo) {
        
        String sql = "insert into psicologo " + 
                "(nome, cpf, crp, telefone, login, senha)" +
                " values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, psicologo.getNome());
            stmt.setString(2, psicologo.getCpf());
            stmt.setString(3, psicologo.getCrp());
            stmt.setString(4, psicologo.getTelefone());
            stmt.setString(5, psicologo.getLogin());
            stmt.setString(6, psicologo.getSenha());
            
            stmt.execute();
            System.out.println("Psicologo "+ psicologo.getNome() + " CADASTRADO!");
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Psicologo psicologo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Psicologo> listarTodos() {
        try {
            List<Psicologo> psicologos = new ArrayList<Psicologo>();
            
            String sql = "SELECT * FROM psicologo";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Psicologo psicologo = new Psicologo();
                
                psicologo.setIdPsicologo(rs.getInt("idpsicologo"));
                psicologo.setNome(rs.getString("nome"));
                psicologo.setCpf(rs.getString("cpf"));
                psicologo.setCrp(rs.getString("crp"));
                psicologo.setTelefone(rs.getString("telefone"));
                psicologo.setLogin(rs.getString("login"));
                psicologo.setSenha(rs.getString("senha"));
                
                System.out.print(psicologo.toString());
                
                psicologos.add(psicologo);
            }
            rs.close();
            stmt.close();
            return psicologos;
            
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public Psicologo getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
