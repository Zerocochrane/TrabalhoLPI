package com.mycompany.lpiproject;

/**
 *
 * @author prfneto
 */
public class IndentificadorDeCliente {
    public static void verifica(Cliente c){
        if(c instanceof PessoaFisica){
            System.out.println(c.getNome() + " cliente é pessoa física");
        }else if(c instanceof PessoaJuridica){
            System.out.println(c.getNome() + " cliente é pessoa juridica");
        }
    }
    
}
