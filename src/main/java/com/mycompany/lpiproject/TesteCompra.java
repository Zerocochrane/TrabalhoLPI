
package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class TesteCompra {

    public static void main(String[] args) {
        Compra compraUm = new Compra(3000, "2020", "Paulo");
        
        compraUm.detalhesCompra(compraUm);
        
        
    }
    
}
