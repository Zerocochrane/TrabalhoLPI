package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class Compra {

    private double valor;
    private String data;
    private Cliente cliente;
    private int i = 1;
    private String codigoCompra;

    public Compra(double valor, String data, Cliente cliente) {
        setValor(valor);
        setData(data);
        setCliente(cliente);
        setCodigoCompra(data + "-" + i);
        i++;
    }

    public void detalhesCompra() {
        System.out.println(getCliente().getTratameto() + " " + getCliente().getNome() + " realizou uma compra no valor de R$" + getValor());
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the codigoCompra
     */
    public String getCodigoCompra() {
        return codigoCompra;
    }

    /**
     * @param codigoCompra the codigoCompra to set
     */
    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
}
