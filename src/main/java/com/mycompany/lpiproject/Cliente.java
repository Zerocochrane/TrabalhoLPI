package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public abstract class Cliente {
    
    private String nome;
    private String eMail;
    private String telefone;
    private char sexo;
    private static int i = 1;
    private String codigoCliente;
    public int pontos = 0;
    
    public Cliente(String nome, String eMail, String telefone, char sexo){
        setNome(nome);
        seteMail(eMail);
        setTelefone(telefone);
        setSexo(sexo);
        setCodigoCliente("C" + i);
        i++;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontos(){
        return pontos;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the codigoCliente
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public void trnasferirPonto(Cliente clientea, Cliente clienteb, int pontosASeremTransferidos){
        if (clientea.pontos >= pontosASeremTransferidos){
            clientea.pontos = clientea.pontos - pontosASeremTransferidos;
            clienteb.pontos = clienteb.pontos + pontosASeremTransferidos;
        } else {
            System.out.println("Quantidades de pontos insuficientes.");
        }
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public abstract String getTratameto();
    
}
