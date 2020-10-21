package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class Compra{
    
    public double valor;
    public String data;
    public String cliente;
    
    public Compra(double valor, String data, String cliente){
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
    /**
     * @return the data
     */
    public String getData() {
        return data;
    }
    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }
    
    public void detalhesCompra(Compra compra){
        System.out.println("Compra realizada pelo(a) Sr(a) " + cliente + " no valor de R$" + valor);
    }
}
