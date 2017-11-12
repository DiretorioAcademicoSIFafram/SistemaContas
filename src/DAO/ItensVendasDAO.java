/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ItensVendas;
import MODEL.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GUSTAVO
 */
public class ItensVendasDAO {
    private Connection conecta;
    
    public ItensVendasDAO(){
        this.conecta = new Dao().conecta();
    }
    
    
    public void itensvenda(ItensVendas itensvendas){
        
        
        
        
        String sql = "insert into itensvendas(itensvendas_codigoproduto_FK, itensvendas_quantidade) values (?,?)";
        
        try
        {
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1,itensvendas.getItensvendacodigoproduto());
            stmt.setInt(2,itensvendas.getItensquantidade());
            
            
            
            stmt.execute();
            stmt.close();
            
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
        
       
    }
    
    public void deletar()
        {
            
                String sql = "DELETE FROM itensvendas";
                     
                try
                {
                    PreparedStatement stmt = conecta.prepareStatement (sql);
                    
                    stmt.execute();
                    stmt.close();
                }
                catch(SQLException e){
                    throw new RuntimeException(e);
                }
                
        }
    

    public List<ItensVendas> listarItensVendas(String ItensVendas)
                {
                    String sql = "select produto_codigoproduto,itensvendas_quantidade,produto_nome,produto_valorunitario from itensvendas,produto where itensvendas_codigoproduto_FK=produto_codigoproduto and produto_codigoproduto = ?";
                    
                    ResultSet rs;
                    List<ItensVendas> itensvendas = new ArrayList<ItensVendas>();
                    List<Produto> produto = new ArrayList<Produto>();
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, ItensVendas);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        ItensVendas Itens = new ItensVendas();
                        
                        
                        Itens.setItensvendacodigoproduto(rs.getString("produto_codigoproduto"));
                        Itens.setItensquantidade(rs.getInt("itensvendas_quantidade"));
                        Itens.setNomeproduto(rs.getString("produto_nome"));
                        Itens.setValorunitario(rs.getFloat("produto_valorunitario"));
                        
                        
                        itensvendas.add(Itens);
                        
                        }
                        rs.close();
                        stmt.close();
                        return itensvendas;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    

        
        
 public void ATUALIZARQUANTIDADE(ItensVendas itensVendas){
             String sql = "UPDATE itensvendas SET itensvendas_quantidade=? WHERE itensvendas_codigoproduto_FK=?";
           
             
             
         try
         {
             PreparedStatement stmt = conecta.prepareStatement(sql);
             stmt.setInt(1, itensVendas.getItensquantidade());
             stmt.setString(2, itensVendas.getItensvendacodigoproduto());
             
             stmt.execute();
             stmt.close();
         }
         catch(SQLException e){
             throw new RuntimeException(e);      
         }
    
    } 
    
    
    
    
    
}
