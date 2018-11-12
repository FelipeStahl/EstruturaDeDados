/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.principal;

import br.com.estrutura.Fila;
import br.com.exercicio.Exercicio3;
import br.com.estrutura.ListaCircular;
import br.com.estrutura.ListaDuplamenteEncadeada;
import br.com.estrutura.ListaEncadeada;
import br.com.estrutura.No;
import br.com.estrutura.Pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {
    
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercícios do Felipe Stahlhofer\nEstrutura de Dados - Senac - 2ª fase\nCada exercício está separado em classes no pacote 'br.com.exercicio'");
    }
    
    private static void filaTeste(){
        Fila pilha = new Fila();
        pilha.adicionar("Felipe");
        pilha.adicionar("Teste");
        pilha.adicionar("Ola");
        pilha.adicionar("Loreipsum");
        System.out.println(pilha);
    }
    
    private static void pilhaTeste(){
        Pilha pilha = new Pilha();
        pilha.empilhar("Felipe");
        pilha.empilhar("Teste");
        pilha.empilhar("Ola");
        pilha.empilhar("Loreipsum");
        System.out.println(pilha);
    }
    private static void listaCircular(){
        ListaCircular lista = new ListaCircular();
        lista.adicionar("Felipe");
        lista.adicionar("Teste");
        lista.adicionar("Ola");
        lista.adicionar("Polegar");
        lista.adicionar("Maria");
        System.out.println(lista);
        lista.remover(5);
        System.out.println("####################\n");
        System.out.println(lista);
        
        System.out.println(lista.existe("Felipe"));
       //System.out.println("####################");
        //System.out.println(lista.buscar(8));
    }
    
    private static void listaDuplamenteEncadeadaTeste(){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionar("Felipe");
        lista.adicionar("Teste");
        lista.adicionar("Ola");
        lista.adicionar("Polegar");
        System.out.println(lista);
        lista.remover(4);
        System.out.println("####################");
        System.out.println(lista);
       //System.out.println("####################");
        //System.out.println(lista.buscar(8));
    }
    
    private static void listaEncadeadaTeste(){
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar("Felipe");
        lista.adicionar("Teste");
        lista.adicionar("Ola");
        lista.adicionar("Polegar");
        System.out.println(lista.remover(4));
        System.out.println(lista.buscar(4));
        //lista.limpar();        
        //System.out.println(lista.existe("Teste"));
        System.out.println(lista);
    }
}






//##################################################################################################################
//###################################################  GAME OVER ###################################################
//##################################################################################################################