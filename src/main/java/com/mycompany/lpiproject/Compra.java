package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class Compra{
    
    public double valor;
    public String data;
    public Cliente cliente;
    private int i = 1;
    public String codigoCompra;
    
    public Compra(double valor, String data, Cliente cliente){
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
        this.codigoCompra = data + "-" + i;
        i++;
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
    
    public String getCodigoCompra(){
        return codigoCompra;
    }
    
    public void detalhesCompra(){
        System.out.println("Compra realizada pelo(a) Sr(a) " + cliente.nome + " no valor de R$" + valor);
    }
}
