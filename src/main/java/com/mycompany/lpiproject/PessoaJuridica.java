package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class PessoaJuridica extends Cliente {

    private String descricao;
    private String CNPJ;

    public PessoaJuridica(String nome, String eMail, String telefone, char sexo, String descricao, String CNPJ) {
        super(nome, eMail, telefone, sexo);
        setDescricao(descricao);
        setCNPJ(CNPJ);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String getTratameto() {
        if (getSexo() == 'M') {
            return "Colaborador";
        } else {
            return "Colaboradora";
        }

    }
}
