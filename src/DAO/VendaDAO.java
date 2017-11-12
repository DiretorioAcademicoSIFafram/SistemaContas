/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author GUSTAVO
 */
public class VendaDAO {
    private Connection conecta;
    
    public VendaDAO(){
        this.conecta = new Dao().conecta();
    }
    
    
    
    public void lancarvenda(Vendas vendas){
        
        
        
        
        String sql = "insert into vendas(vendas_codigoproduto_FK, vendas_quantidade, vendas_clientecpf_FK,vendas_valortotal) values (?,?,?,?)";
        
        try
        {
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1,vendas.getVendacodigoproduto());
            stmt.setInt(2,vendas.getQuantidade());
            stmt.setString(3,vendas.getClientecpf());
            stmt.setDouble(4,vendas.getValortotal());
            
            stmt.execute();
            stmt.close();
            
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
        
       
    }

    
    
    
    
    
    
    
    
}
