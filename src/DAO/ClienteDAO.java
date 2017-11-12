/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Cliente;
import MODEL.Fornecedor;
import MODEL.Vendas;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GUSTAVO
 */
public class ClienteDAO {
    
    private Connection conecta;
    
    public ClienteDAO(){
        this.conecta = new Dao().conecta();
    }
    
    public void salvarcliente(Cliente cliente){
        
        String sql = "insert into cliente(cliente_nome, cliente_cpf, cliente_cnpj, cliente_Datanasc, cliente_endereco, cliente_telefone, cliente_celular, cliente_enderecoentrega, cliente_email, cliente_Observacao)values (?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getCnpj());
            stmt.setString(4, cliente.getDatanasc());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getTelefone());
            stmt.setString(7, cliente.getCelular());
            stmt.setString(8, cliente.getEnderecoentrega());   
            stmt.setString(9, cliente.getEmail());
            stmt.setString(10, cliente.getObservacao());
            stmt.execute();
            stmt.close();
   
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
    }

    
    public List<Cliente> listarClientes()
                {
                    String sql = "SELECT * FROM cliente";
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
    public List<Cliente> listarClientespesquisacod(int cod)
                {
                    String sql = "SELECT * FROM cliente WHERE cliente_codigo = ?";
                    
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setInt(1, cod);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
                 public List<Cliente> listarClientespesquisanome(String nome)
                {
                    String sql = "SELECT * FROM cliente WHERE cliente_nome LIKE ?";
                    
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, "%"+nome+"%");
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
                 
                    public List<Cliente> listarClientespesquisacpf(String cpf)
                {
                    String sql = "SELECT * FROM cliente WHERE cliente_cpf = ?";
                    
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, cpf);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
                    
                       
                    
                    
                    public List<Cliente> listarClientespesquisacnpj(String cnpj)
                {
                    String sql = "SELECT * FROM cliente WHERE cliente_cnpj = ?";
                    
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, cnpj);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
                    
                    public List<Cliente> listarClientespesquisadatanasc(String datanasc)
                {
                    String sql = "SELECT * FROM cliente WHERE cliente_Datanasc = ?";
                    
                    ResultSet rs;
                    List<Cliente> cliente = new ArrayList<Cliente>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, datanasc);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Cliente cli = new Cliente();
                        
                        cli.setCodigo(rs.getInt("cliente_codigo"));
                        cli.setNome(rs.getString("cliente_nome"));
                        cli.setCpf(rs.getString("cliente_cpf"));
                        cli.setCnpj(rs.getString("cliente_cnpj"));
                        cli.setDatanasc(rs.getString("cliente_Datanasc"));
                        cli.setEndereco(rs.getString("cliente_endereco"));
                        cli.setTelefone(rs.getString("cliente_telefone"));
                        cli.setCelular(rs.getString("cliente_celular"));
                        cli.setEnderecoentrega(rs.getString("cliente_enderecoentrega"));
                        cli.setEmail(rs.getString("cliente_email"));
                        cli.setObservacao(rs.getString("cliente_Observacao"));
                        cliente.add(cli);
                        }
                        rs.close();
                        stmt.close();
                        return cliente;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
                   
                     
}
