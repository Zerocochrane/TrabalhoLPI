package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class Cliente {
    
    public String nome;
    public String eMail;
    public String telefone;
    private int i = 1;
    public String codigoCliente;
    public int pontos = 0;
    
    public Cliente(String nome, String eMail, String telefone){
        this.nome = nome;
        this.eMail = eMail;
        this.telefone = telefone;
        this.codigoCliente = "C" + i;
        i++;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontos(){
        return pontos;
    }
}
