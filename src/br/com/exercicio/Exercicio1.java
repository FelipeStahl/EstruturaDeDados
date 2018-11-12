/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio;

import br.com.estrutura.ListaDuplamenteEncadeada;

/**
 *
 * @author Felipe-Sistema
 */
public class Exercicio1 {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Paula");
        lista.adicionar("Pedro");
        lista.remover(1);
        lista.adicionar("José");
        lista.remover(1);
        lista.adicionar("João");
        lista.adicionar("Marcelo");
        lista.adicionar("Maria", 1);
        
        System.out.println(lista);
        System.out.println(lista.inverso());
    }
}
