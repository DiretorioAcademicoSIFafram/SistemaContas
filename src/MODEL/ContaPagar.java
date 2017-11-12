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
public class ContaPagar {
    
    private int codigo;
    private String NF;
    private String dataemissao;
    private String vencimentos;
    private String observacao;
    private String dataatual;

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
     * @return the NF
     */
    public String getNF() {
        return NF;
    }

    /**
     * @param NF the NF to set
     */
    public void setNF(String NF) {
        this.NF = NF;
    }

    /**
     * @return the dataemissao
     */
    public String getDataemissao() {
        return dataemissao;
    }

    /**
     * @param dataemissao the dataemissao to set
     */
    public void setDataemissao(String dataemissao) {
        this.dataemissao = dataemissao;
    }

    /**
     * @return the vencimentos
     */
    public String getVencimentos() {
        return vencimentos;
    }

    /**
     * @param vencimentos the vencimentos to set
     */
    public void setVencimentos(String vencimentos) {
        this.vencimentos = vencimentos;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the dataatual
     */
    public String getDataatual() {
        return dataatual;
    }

    /**
     * @param dataatual the dataatual to set
     */
    public void setDataatual(String dataatual) {
        this.dataatual = dataatual;
    }
            
}
