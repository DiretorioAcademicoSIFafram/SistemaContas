/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;


/**
 *
 * @author GUSTAVO
 */
public class Dao {
    
    public Connection conecta() {
        
        try
        {
            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "123";
                            
            return DriverManager.getConnection(url, usuario, senha);                
                            
        }catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
        
    }
    
}
