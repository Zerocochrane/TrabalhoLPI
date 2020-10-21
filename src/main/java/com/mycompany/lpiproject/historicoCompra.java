package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class historicoCompra {
    Compra[] vetor = new Compra[5];
    private int i = 0;
    private double total = 0;
    private double media = 0;
    private double totalCliente = 0;
    private int ponto;
    
    public void adicionarHistorico(Compra compra){
        vetor[i] = compra;
        i++;
    }
    
    public double valorTotal(){
        for(int j = 0; j < vetor.length; j++){
            total = total + vetor[j].valor;
        }
        return total;
    }
    
    public double valorMedio(){
        for(int j = 0; j < vetor.length; j++){
           media = media + vetor[j].valor;
        }
        return media/i;
    }
    
    public double compraCliente(Cliente cliente){
        for(int j = 0; j < vetor.length; j++){
            if(vetor[j].cliente.nome == cliente.nome){
                totalCliente = totalCliente + vetor[j].valor;
            }
        }
     return totalCliente;       
    }
    
    public int pontoCliente(Cliente cliente){
        ponto = 0;
        for(int j = 0; j < vetor.length; j++){
            if(vetor[j].cliente.nome == cliente.nome){
                 ponto++;
            }
        }
        ponto--;
        return ponto;       
    }
}
