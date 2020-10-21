package com.mycompany.lpiproject;



/**
 *
 * @author prfneto
 */
public class TesteCompra {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Paulo", "prfneto@gmail.com", "(31)3232-3232");
        Cliente cliente2 = new Cliente("Joao", "joao@gmail.com", "(33)3232-3232");
        Cliente cliente3 = new Cliente("Maria", "maria@gmail.com", "(34)3232-3232");
        Cliente cliente4 = new Cliente("Ana", "ana@gmail.com", "(35)3232-3232");
        
        Compra compra1 = new Compra(3000, "2020", cliente1);
        Compra compra2 = new Compra(7000, "2020", cliente1);
        Compra compra3 = new Compra(5000, "2020", cliente2);
        Compra compra4 = new Compra(6000, "2020", cliente3);
        Compra compra5 = new Compra(4000, "2020", cliente4);
        
        historicoCompra historico = new historicoCompra();
        
        compra1.detalhesCompra();
        compra2.detalhesCompra();
        compra3.detalhesCompra();
        compra4.detalhesCompra();
        compra5.detalhesCompra();
        
        historico.adicionarHistorico(compra1);
        historico.adicionarHistorico(compra2);
        historico.adicionarHistorico(compra3);
        historico.adicionarHistorico(compra4);
        historico.adicionarHistorico(compra5);
        
        System.out.println(historico.valorTotal());
        System.out.println(historico.valorMedio());
        
        System.out.println(historico.compraCliente(cliente1));

        cliente1.setPontos(historico.pontoCliente(cliente1));
        System.out.println(cliente1.pontos);
        
        historico.removerCompra(2);
        
        historico.verificaCliente(cliente1);
        
        Premios premio1 = new Premios("Bola", "Bola de futebol", 1);
        Premios premio2 = new Premios("Carrinho", "carrinho de controle remoto", 2);
        Premios premio3 = new Premios("GameBoy", "Video game portátil da Nintendo", 3);
        Premios premio4 = new Premios("Arma de Chumbinho", "Arma de chumbiho, sem munição", 4);
        
        premio1.resgatarPremio(cliente1, premio1);
        premio1.resgatarPremio(cliente1, premio2);
        
    }
    
}
