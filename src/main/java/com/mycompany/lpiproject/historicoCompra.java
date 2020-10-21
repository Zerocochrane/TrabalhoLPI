package com.mycompany.lpiproject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author prfneto
 */
public class historicoCompra {
    ArrayList<Compra> compras = new ArrayList<Compra>();
    private int j = 0;
    private double total = 0;
    private double media = 0;
    private double totalCliente = 0;
    private int ponto;
    private int i = 0;
    
    public void adicionarHistorico(Compra compra){
        compras.add(compra);
        j++;
    }
    
    public double valorTotal(){
        for (Compra e: compras){
            total = total + e.getValor();
        }
        return total;
    }
    
    public double valorMedio(){
        for (Compra e: compras){
            media = media + e.getValor();
        }
        return media/j;
    }
    
    public double compraCliente(Cliente cliente){
        for (Compra e: compras){
            if(e.getCliente().getNome() == cliente.getNome()){
                totalCliente = totalCliente + e.getValor();
            }
        }
     return totalCliente;       
    }
    
    public int pontoCliente(Cliente cliente){
        ponto = 0;
        for (Compra e: compras){
            if(e.getCliente().getNome() == cliente.getNome()){
                ponto++;
            }
        }
        ponto--;
        return ponto;       
    }
    
    public void removerCompra(int posicao){
        try {
            compras.remove(posicao);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Erro: posição inválida");     
        }
    }
    
    public void verificaCliente(Cliente cliente){
        i = 0;
        for (Compra e: compras){
            if(e.getCliente().getNome() == cliente.getNome() && i == 0){
                System.out.println("O cliente se encontra no histórico de compras.");
                i++;
            }
        }   
        if(i == 0){
            System.out.println("O cliente não se encontra no histórico de compras.");
        }
        
    }
}
