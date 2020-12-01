package com.mycompany.lpiproject;

import java.util.ArrayList;

public class Lista<T> {

    ArrayList<T> lista = new ArrayList<T>();

    public void adicionar(T item) {
        lista.add(item);
    }

    public void remover(int posicao) {
        try {
            this.lista.remove(posicao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida");
        }
    }

    public ArrayList<T> getLista(){
        return lista;
    }
}
