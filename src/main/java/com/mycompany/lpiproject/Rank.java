package com.mycompany.lpiproject;

import java.util.ArrayList;

/**
 *
 * @author prfneto
 */
public class Rank {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }
    
    public static void determinarRank(Cliente c, historicoCompra h){
        double totalCliente = 0;
        for (Compra e : h.compras) {
            if (e.getCliente().getCodigoCliente() == c.getCodigoCliente()) {
                totalCliente = totalCliente + e.getValor();
            }
        }
        if (totalCliente > 3000){
            c.setRank("A");
        }
        if (totalCliente <= 3000 && totalCliente >= 1000){
            c.setRank("B");
        }
        if (totalCliente < 1000){
            c.setRank("C");
        }
    }
    
    public static void mostrarRank(Cliente c, historicoCompra h){
        for (Compra e : h.compras) {
            if (e.getCliente().getCodigoCliente() == c.getCodigoCliente()) {
                System.out.println("O cliente " + c.getNome() + " possui o rank: " + c.getRank());
            }
        }
    }
    
    public void imprimirLista(){
        for (Cliente e : clientes){
            System.out.println("O cliente " + e.getNome() + " possui o rank: " + e.getRank());
        }
    }
    
    public static void atualizarRank(historicoCompra h){
        for (Compra e : h.compras) {
            determinarRank(e.getCliente(), h);
        }
    }
    
}
