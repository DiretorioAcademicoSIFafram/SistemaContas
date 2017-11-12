/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.ClienteDAO;
import MODEL.Cliente;
import MODEL.ContaReceber;
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
public class ContaReceberDAO {
    private Connection conecta;
    
    
    public ContaReceberDAO(){
        this.conecta = new Dao().conecta();
    }
    
    
    public void SalvarContaReceber(ContaReceber contareceber){
        
        String sql = "insert into contareceber (contareceber_NF, contareceber_dataemissao,contareceber_vencimentos, contareceber_observação) values (?,?,?,?)";
        
        try
        {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, contareceber.getNF());
            stmt.setString(2, contareceber.getDataemissao());
            stmt.setString(3, contareceber.getVencimentos());
            stmt.setString(4, contareceber.getObservacao());
            stmt.execute();
            stmt.close();
   
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
    }
    public List<ContaReceber> listarContaReceber(){
    
                
                    String sql = "select contareceber_codigo,cliente_nome,contareceber_NF,contareceber_dataemissao,contareceber_vencimentos,produto_nome,vendas_valortotal,contareceber_observação from contareceber,cliente,produto,vendas where vendas_codigoproduto_FK=produto_codigoproduto and vendas_clientecpf_FK=cliente_cpf and contareceber_FK=vendas_codigo";
                    ResultSet rs;
                    List<ContaReceber> contareceber = new ArrayList<ContaReceber>();
                    List<Cliente> cliente = new ArrayList<Cliente>();
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        ContaReceber ConRe = new ContaReceber();
                        ConRe.setCodigo(rs.getInt("contareceber_codigo"));
                        ConRe.setCliente_nome(rs.getString("cliente_nome"));
                        ConRe.setNF(rs.getString("contareceber_NF"));
                        ConRe.setDataemissao(rs.getString("contareceber_dataemissao"));
                        ConRe.setVencimentos(rs.getString("contareceber_vencimentos"));
                        ConRe.setProduto_nome(rs.getString("produto_nome"));
                        ConRe.setVendas_valortotal(rs.getInt("vendas_valortotal"));
                        ConRe.setObservacao(rs.getString("contareceber_observação"));
                        
                      
                        
                      
                        Cliente cli = new Cliente();
                        cli.setNome(rs.getString("cliente_nome"));
                        //ConRe.setCliente(cli);
                        cliente.add(cli);
                        
                        
                        contareceber.add(ConRe);
                        }
                        rs.close();
                        stmt.close();
                        return contareceber; 
                        
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
    
    public List<ContaReceber> listarContaReceberCodigo(int Codigo){
    
                
                    String sql = "select contareceber_codigo,cliente_nome,contareceber_NF,contareceber_dataemissao,contareceber_vencimentos,produto_nome,vendas_valortotal,contareceber_observação from contareceber,cliente,produto,vendas where vendas_codigoproduto_FK=produto_codigoproduto and vendas_clientecpf_FK=cliente_cpf and contareceber_FK=vendas_codigo  AND  contareceber_codigo=?";
                    ResultSet rs;
                    List<ContaReceber> contareceber = new ArrayList<ContaReceber>();
                    List<Cliente> cliente = new ArrayList<Cliente>();
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        stmt.setInt(1, Codigo);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        ContaReceber ConRe = new ContaReceber();
                        ConRe.setCodigo(rs.getInt("contareceber_codigo"));
                        ConRe.setCliente_nome(rs.getString("cliente_nome"));
                        ConRe.setNF(rs.getString("contareceber_NF"));
                        ConRe.setDataemissao(rs.getString("contareceber_dataemissao"));
                        ConRe.setVencimentos(rs.getString("contareceber_vencimentos"));
                        ConRe.setProduto_nome(rs.getString("produto_nome"));
                        ConRe.setVendas_valortotal(rs.getInt("vendas_valortotal"));
                        ConRe.setObservacao(rs.getString("contareceber_observação"));
                        
                      
                        
                      
                        Cliente cli = new Cliente();
                        cli.setNome(rs.getString("cliente_nome"));
                        //ConRe.setCliente(cli);
                        cliente.add(cli);
                        
                        
                        contareceber.add(ConRe);
                        }
                        rs.close();
                        stmt.close();
                        return contareceber; 
                        
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
    
    
    
    
    
    
    
    
    
}
