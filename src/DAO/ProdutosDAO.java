/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import MODEL.Cliente;
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
public class ProdutosDAO {
    private Connection conecta;
    
    public ProdutosDAO(){
        this.conecta = new Dao().conecta();
    }
    
    
        public void salvarproduto(Produto produto){
        
        String sql = "insert into produto(produto_codigoproduto, produto_nome, produto_quantidadeproduto, produto_valorunitario, produto_Observacao)values (?,?,?,?,?)";
        
        try
        {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, produto.getCodigoproduto());
            stmt.setString(2, produto.getNomeproduto());
            stmt.setInt(3, produto.getQuantidadeproduto());
            stmt.setFloat(4, produto.getValorunitario());
            stmt.setString(5, produto.getObservacaoproduto());
            stmt.execute();
            stmt.close();
   
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
    }
    
    
    public List<Produto> listarProdutospesquisacod(String cod)
                {
                    String sql = "SELECT * FROM produto WHERE produto_codigoproduto = ?";
                    
                    ResultSet rs;
                    List<Produto> produto = new ArrayList<Produto>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, cod);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Produto pro = new Produto();
                        
                        pro.setCodigoproduto(rs.getString("produto_codigoproduto"));
                        pro.setNomeproduto(rs.getString("produto_nome"));
                        pro.setQuantidadeproduto(rs.getInt("produto_quantidadeproduto"));
                        pro.setValorunitario(rs.getFloat("produto_valorunitario"));
                        pro.setObservacaoproduto(rs.getString("produto_Observacao"));
                       
                        produto.add(pro);
                        }
                        rs.close();
                        stmt.close();
                        return produto;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
    public List<Produto> listarProdutospesquisaNome(String nomepro)
                {
                    String sql = "SELECT * FROM produto WHERE produto_nome LIKE ?";
                    
                    ResultSet rs;
                    List<Produto> produto = new ArrayList<Produto>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        
                        stmt.setString(1, "%"+nomepro+"%");
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Produto pro = new Produto();
                        
                        pro.setCodigoproduto(rs.getString("produto_codigoproduto"));
                        pro.setNomeproduto(rs.getString("produto_nome"));
                        pro.setQuantidadeproduto(rs.getInt("produto_quantidadeproduto"));
                        pro.setValorunitario(rs.getFloat("produto_valorunitario"));
                        pro.setObservacaoproduto(rs.getString("produto_Observacao"));
                       
                        produto.add(pro);
                        }
                        rs.close();
                        stmt.close();
                        return produto;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    public void ATUALIZARESTOQUE(Produto produto){
             String sql = "UPDATE produto SET produto_quantidadeproduto=produto_quantidadeproduto-? WHERE produto_codigoproduto=?";
           
             
             
         try
         {
             PreparedStatement stmt = conecta.prepareStatement(sql);
             
             stmt.setInt(1, produto.getQuantidadeproduto());
             stmt.setString(2, produto.getCodigoproduto());
             stmt.execute();
             stmt.close();
         }
         catch(SQLException e){
             throw new RuntimeException(e);      
         }
    
    } 
    

}
