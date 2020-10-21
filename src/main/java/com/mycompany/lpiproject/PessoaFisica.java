package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class PessoaFisica extends Cliente {

    private String CPF;

    public PessoaFisica(String nome, String eMail, String telefone, char sexo, String CPF) {
        super(nome, eMail, telefone, sexo);
        setCPF(CPF);
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getTratameto() {
        if (getSexo() == 'M') {
            return "Senhor";
        } else {
            return "Senhora";
        }

    }
}
