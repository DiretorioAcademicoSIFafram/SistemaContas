/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author GUSTAVO
 */
public class Produto {
    
    private int codigo;
    private String codigoproduto;
    private String nomeproduto;
    private int quantidadeproduto;
    private float valorunitario;
    private String observacaoproduto;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the codigoproduto
     */
    public String getCodigoproduto() {
        return codigoproduto;
    }

    /**
     * @param codigoproduto the codigoproduto to set
     */
    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    /**
     * @return the nomeproduto
     */
    public String getNomeproduto() {
        return nomeproduto;
    }

    /**
     * @param nomeproduto the nomeproduto to set
     */
    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    /**
     * @return the quantidadeproduto
     */
    public int getQuantidadeproduto() {
        return quantidadeproduto;
    }

    /**
     * @param quantidadeproduto the quantidadeproduto to set
     */
    public void setQuantidadeproduto(int quantidadeproduto) {
        this.quantidadeproduto = quantidadeproduto;
    }

    /**
     * @return the valorunitario
     */
    public float getValorunitario() {
        return valorunitario;
    }

    /**
     * @param valorunitario the valorunitario to set
     */
    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    /**
     * @return the observacaoproduto
     */
    public String getObservacaoproduto() {
        return observacaoproduto;
    }

    /**
     * @param observacaoproduto the observacaoproduto to set
     */
    public void setObservacaoproduto(String observacaoproduto) {
        this.observacaoproduto = observacaoproduto;
    }
    
  
}
