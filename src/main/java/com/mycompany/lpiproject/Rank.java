package com.mycompany.lpiproject;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author prfneto
 */
public class Rank {
    static Map<Cliente, String> ranks = new HashMap<Cliente, String>();

    public static void determinarRank(Cliente c, HistoricoCompra h){
        double totalCliente = 0;
        for (Compra e : h.getLista()) {
            if (e.getCliente().getCodigoCliente() == c.getCodigoCliente()) {
                totalCliente = totalCliente + e.getValor();
            }
        }
        if (totalCliente > 3000){
            ranks.put(c, "A");
        }
        if (totalCliente <= 3000 && totalCliente >= 1000){
            ranks.put(c, "B");
        }
        if (totalCliente < 1000){
            ranks.put(c, "C");
        }
    }
    
    public static void mostrarRank(Cliente c, HistoricoCompra h){
        for (Compra e : h.getLista()) {
            if (e.getCliente().getCodigoCliente() == c.getCodigoCliente()) {
                System.out.println("O cliente " + c.getNome() + " possui o rank: " + ranks.get(c));
            }
        }
    }
    
    public void imprimirLista(){
        for (Cliente e : ranks.keySet()){
            System.out.println("O cliente " + e.getNome() + " possui o rank: " + ranks.get(e));
        }
    }
    
    public static void atualizarRank(HistoricoCompra h){
        for (Compra e : h.getLista()) {
            determinarRank(e.getCliente(), h);
        }
    }
    
}
