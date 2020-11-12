package com.mycompany.lpiproject;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author prfneto
 */
public class historicoCompra {

    ArrayList<Compra> compras = new ArrayList<Compra>();
    ArrayList<Compra> semRepeticoes = new ArrayList<Compra>();
    private int j = 0;

    public void adicionarHistorico(Compra compra) {
        compras.add(compra);
        j++;
    }

    public double valorTotal() {
        double total = 0;
        for (Compra e : compras) {
            total = total + e.getValor();
        }
        return total;
    }

    public double valorMedio() {
        double media = 0;
        for (Compra e : compras) {
            media = media + e.getValor();
        }
        return media / j;
    }

    public double compraCliente(Cliente cliente) {
        double totalCliente = 0;
        for (Compra e : compras) {
            if (e.getCliente().getCodigoCliente() == cliente.getCodigoCliente()) {
                totalCliente = totalCliente + e.getValor();
            }
        }
        return totalCliente;
    }

    public int pontoCliente(Cliente cliente) {
        int ponto = 0;
        for (Compra e : compras) {
            if (e.getCliente().getCodigoCliente() == cliente.getCodigoCliente()) {
                ponto++;
            }
        }
        ponto--;
        return ponto;
    }

    public void removerCompra(int posicao) {
        try {
            compras.remove(posicao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida");
        }
    }

    public void verificaCliente(Cliente cliente) {
        for (Compra e : compras) {
            if (e.getCliente().getCodigoCliente() == cliente.getCodigoCliente()) {
                System.out.println("O cliente " + cliente.getNome() + " se encontra no histórico de compras.");
                return;
            }
        }
        System.out.println("O cliente " + cliente.getNome() + "  não se encontra no histórico de compras.");

    }
    
    public void valorCompraCrescente(){
        Collections.sort(compras, new SortByAscendingCompra());
        System.out.println("Lista organizada de maneira crescete do valor da compra: ");
        for (Compra e : compras) {
            System.out.println("R$" + e.getValor());
        }
    }
    
    public void valorCompraDecrescente(){
        Collections.sort(compras, new SortByAscendingCompra());
        Collections.reverse(compras);
        System.out.println("Lista organizada de maneira decrescente do valor da compra: ");
        for (Compra e : compras) {
            System.out.println("R$" + e.getValor());
        }
    }
    
    public void nomeCrescente(){
        Collections.sort(compras, new SortByAscendingName());
        System.out.println("Lista organizada de maneira alfabética pelo  nome do Cliente: ");
        for (Compra e : compras) {
            System.out.println(e.getCliente().getNome() + ": R$"+ e.getValor());
        }
    }
    
    class SortByAscendingCompra implements Comparator<Compra>{
        @Override
        public int compare(Compra a, Compra b){
            return (int)a.getValor() - (int)b.getValor();
        }
        
    }
    
    class SortByAscendingName implements Comparator<Compra>{
        @Override
        public int compare(Compra a, Compra b){
            int f = a.getCliente().getNome().compareTo(b.getCliente().getNome());
            return f;
        }
        
    }
    
}
