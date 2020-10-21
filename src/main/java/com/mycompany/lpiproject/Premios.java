package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class Premios {
    private String nome;
    private String descricao;
    private int preco;
    
    public Premios(String nome, String descricao, int preco){
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
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
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public void resgatarPremio(Cliente cliente, Premios premio){
        if(cliente.pontos >= premio.preco){
            System.out.println("Premio resgatado");
            cliente.setPontos(cliente.getPontos()-premio.preco);
        } else{
            System.out.println("Cliente " + cliente.getNome() + " possui quantidade insuficiente de pontos");
        }
    }
    
}
