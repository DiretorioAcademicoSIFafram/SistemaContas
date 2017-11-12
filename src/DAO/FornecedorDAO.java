/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    
    private Connection conecta;
    
    public FornecedorDAO(){
        this.conecta = new Dao().conecta();
    }
    
    
    
        public void salvarfornecedor(Fornecedor fornecedor){
        
        String sql = "insert into fornecedor(fornecedor_nomefantasia,fornecedor_razaosocial,fornecedor_cnpj,fornecedor_inscricaoestadual,"
                + "fornecedor_inscricaomunicipal,fornecedor_endereco,fornecedor_telefonecomercial,"
                + "fornecedor_celular,fornecedor_dataaberturaempresa,fornecedor_email,fornecedor_Observação)values (?,?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, fornecedor.getNomefantasia());
            stmt.setString(2, fornecedor.getRazaosocial());
            stmt.setString(3, fornecedor.getCnpj());
            stmt.setString(4, fornecedor.getInscricaoestadual());
            stmt.setString(5, fornecedor.getInscricaomunicipal());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getTelefonecomercial());
            stmt.setString(8, fornecedor.getCelular());
            stmt.setString(9, fornecedor.getDataaberturaempresa());
            stmt.setString(10, fornecedor.getEmail());
            stmt.setString(11, fornecedor.getObservacao());
            stmt.execute();
            stmt.close();
   
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
   
    }
        public List<Fornecedor> listarFornecedorcod(int cod)
                {
                    String sql = "SELECT * FROM fornecedor WHERE fornecedor_codigo = ?";
                    
                    ResultSet rs;
                    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setInt(1, cod);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Fornecedor fo = new Fornecedor();
                        
                        fo.setCodigo(rs.getInt("fornecedor_codigo"));
                        fo.setNomefantasia(rs.getString("fornecedor_nomefantasia"));
                        fo.setRazaosocial(rs.getString("fornecedor_razaosocial"));
                        fo.setCnpj(rs.getString("fornecedor_cnpj"));
                        fo.setInscricaoestadual(rs.getString("fornecedor_inscricaoestadual"));
                        fo.setInscricaomunicipal(rs.getString("fornecedor_inscricaomunicipal"));
                        fo.setEndereco(rs.getString("fornecedor_endereco"));
                        fo.setTelefonecomercial(rs.getString("fornecedor_telefonecomercial"));
                        fo.setCelular(rs.getString("fornecedor_celular"));
                        fo.setDataaberturaempresa(rs.getString("fornecedor_dataaberturaempresa"));
                        fo.setEmail(rs.getString("fornecedor_email"));
                        fo.setObservacao(rs.getString("fornecedor_Observação"));
                        
                       
                        fornecedor.add(fo);
                        }
                        rs.close();
                        stmt.close();
                        return fornecedor;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
        
        
        
        
        public List<Fornecedor> listarFornecedorNomefantasia(String nomefantasia)
                {
                    String sql = "SELECT * FROM fornecedor WHERE fornecedor_nomefantasia LIKE ?";
                    
                    ResultSet rs;
                    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, "%"+nomefantasia+"%");
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Fornecedor fo = new Fornecedor();
                        
                        fo.setCodigo(rs.getInt("fornecedor_codigo"));
                        fo.setNomefantasia(rs.getString("fornecedor_nomefantasia"));
                        fo.setRazaosocial(rs.getString("fornecedor_razaosocial"));
                        fo.setCnpj(rs.getString("fornecedor_cnpj"));
                        fo.setInscricaoestadual(rs.getString("fornecedor_inscricaoestadual"));
                        fo.setInscricaomunicipal(rs.getString("fornecedor_inscricaomunicipal"));
                        fo.setEndereco(rs.getString("fornecedor_endereco"));
                        fo.setTelefonecomercial(rs.getString("fornecedor_telefonecomercial"));
                        fo.setCelular(rs.getString("fornecedor_celular"));
                        fo.setDataaberturaempresa(rs.getString("fornecedor_dataaberturaempresa"));
                        fo.setEmail(rs.getString("fornecedor_email"));
                        fo.setObservacao(rs.getString("fornecedor_Observação"));
                        
                       
                        fornecedor.add(fo);
                        }
                        rs.close();
                        stmt.close();
                        return fornecedor;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    public List<Fornecedor> listarFornecedorCNPJ(String CNPJ)
                {
                    String sql = "SELECT * FROM fornecedor WHERE fornecedor_cnpj = ?";
                    
                    ResultSet rs;
                    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, CNPJ);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Fornecedor fo = new Fornecedor();
                        
                        fo.setCodigo(rs.getInt("fornecedor_codigo"));
                        fo.setNomefantasia(rs.getString("fornecedor_nomefantasia"));
                        fo.setRazaosocial(rs.getString("fornecedor_razaosocial"));
                        fo.setCnpj(rs.getString("fornecedor_cnpj"));
                        fo.setInscricaoestadual(rs.getString("fornecedor_inscricaoestadual"));
                        fo.setInscricaomunicipal(rs.getString("fornecedor_inscricaomunicipal"));
                        fo.setEndereco(rs.getString("fornecedor_endereco"));
                        fo.setTelefonecomercial(rs.getString("fornecedor_telefonecomercial"));
                        fo.setCelular(rs.getString("fornecedor_celular"));
                        fo.setDataaberturaempresa(rs.getString("fornecedor_dataaberturaempresa"));
                        fo.setEmail(rs.getString("fornecedor_email"));
                        fo.setObservacao(rs.getString("fornecedor_Observação"));
                        
                       
                        fornecedor.add(fo);
                        }
                        rs.close();
                        stmt.close();
                        return fornecedor;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    public List<Fornecedor> listarFornecedorInscricaoestadual(String inscricaoestadual)
                {
                    String sql = "SELECT * FROM fornecedor WHERE fornecedor_inscricaoestadual = ?";
                    
                    ResultSet rs;
                    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, inscricaoestadual);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Fornecedor fo = new Fornecedor();
                        
                        fo.setCodigo(rs.getInt("fornecedor_codigo"));
                        fo.setNomefantasia(rs.getString("fornecedor_nomefantasia"));
                        fo.setRazaosocial(rs.getString("fornecedor_razaosocial"));
                        fo.setCnpj(rs.getString("fornecedor_cnpj"));
                        fo.setInscricaoestadual(rs.getString("fornecedor_inscricaoestadual"));
                        fo.setInscricaomunicipal(rs.getString("fornecedor_inscricaomunicipal"));
                        fo.setEndereco(rs.getString("fornecedor_endereco"));
                        fo.setTelefonecomercial(rs.getString("fornecedor_telefonecomercial"));
                        fo.setCelular(rs.getString("fornecedor_celular"));
                        fo.setDataaberturaempresa(rs.getString("fornecedor_dataaberturaempresa"));
                        fo.setEmail(rs.getString("fornecedor_email"));
                        fo.setObservacao(rs.getString("fornecedor_Observação"));
                        
                       
                        fornecedor.add(fo);
                        }
                        rs.close();
                        stmt.close();
                        return fornecedor;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    public List<Fornecedor> listarFornecedorInscricaomunicipal(String inscricaomunicipal)
                {
                    String sql = "SELECT * FROM fornecedor WHERE fornecedor_inscricaomunicipal = ?";
                    
                    ResultSet rs;
                    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
               
                    
                    try
                    {
                        PreparedStatement stmt = conecta.prepareStatement (sql);
                        
                        stmt.setString(1, inscricaomunicipal);
                        
                        
                        rs = stmt.executeQuery();
                        while(rs.next())
                        {
                        Fornecedor fo = new Fornecedor();
                        
                        fo.setCodigo(rs.getInt("fornecedor_codigo"));
                        fo.setNomefantasia(rs.getString("fornecedor_nomefantasia"));
                        fo.setRazaosocial(rs.getString("fornecedor_razaosocial"));
                        fo.setCnpj(rs.getString("fornecedor_cnpj"));
                        fo.setInscricaoestadual(rs.getString("fornecedor_inscricaoestadual"));
                        fo.setInscricaomunicipal(rs.getString("fornecedor_inscricaomunicipal"));
                        fo.setEndereco(rs.getString("fornecedor_endereco"));
                        fo.setTelefonecomercial(rs.getString("fornecedor_telefonecomercial"));
                        fo.setCelular(rs.getString("fornecedor_celular"));
                        fo.setDataaberturaempresa(rs.getString("fornecedor_dataaberturaempresa"));
                        fo.setEmail(rs.getString("fornecedor_email"));
                        fo.setObservacao(rs.getString("fornecedor_Observação"));
                        
                       
                        fornecedor.add(fo);
                        }
                        rs.close();
                        stmt.close();
                        return fornecedor;   
                    }
                    catch(SQLException e)
                         {
                        throw new RuntimeException(e);
                         }
     
                }
    
    
}
