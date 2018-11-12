/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio;

import br.com.entidade.Processo;
import br.com.estrutura.ListaCircular;

/**
 *
 * @author Felipe-Sistema
 */
public class Exercicio3 {

    private static ListaCircular LISTA;

    public static void main(String[] args) {
        criarProcessos();
        processar();
        
    }

    private static void criarProcessos() {
        Processo processoA = new Processo("Processo A", 72);
        Processo processoB = new Processo("Processo B", 90);
        Processo processoC = new Processo("Processo C", 68);
        Processo processoD = new Processo("Processo D", 55);
        Processo processoE = new Processo("Processo E", 47);

        LISTA = new ListaCircular();
        LISTA.adicionar(processoA);
        LISTA.adicionar(processoB);
        LISTA.adicionar(processoC);
        LISTA.adicionar(processoD);
        LISTA.adicionar(processoE);
    }
    
    private static void processar(){
        Object elemento = LISTA.getProximo();
        while(elemento != null){
            Processo processo = (Processo)elemento;
            if(processo.getTempo() < 10){
                 processo.setTempo(processo.getTempo() - (processo.getTempo() % 10));
            }else{
                processo.setTempo(processo.getTempo() - 10);
                LISTA.adicionar(processo);
            }            
            System.out.println(processo.getNome() + " | Tempo: " + processo.getTempo());
            elemento = LISTA.getProximo();
        }
    }
}
