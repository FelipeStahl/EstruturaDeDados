/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estrutura;

/**
 *
 * @author Felipe-Sistema
 */
public class Pilha {

    private No topo;
    private Integer tamanho;

    public Pilha() {
        tamanho = 0;
    }

    public void empilhar(Object objeto) {
        No novoElemento = new No();
        novoElemento.setElemento(objeto);
        if (isVazia()) {
            topo = novoElemento;
        } else {
            No auxiliar = topo;
            novoElemento.setProximo(auxiliar);
            topo = novoElemento;
            tamanho++;
        }

    }

    public Object desempilhar() {
        Object elemento = topo.getElemento();
        topo = topo.getProximo();
        tamanho--;
        return elemento;
    }

    public Integer tamanho() {
        return this.tamanho;
    }

    public Boolean isVazia() {
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String mensagem = "";
        No auxiliar = topo;
        while (auxiliar != null) {
            mensagem += auxiliar.getElemento() + "\n";
            auxiliar = auxiliar.getProximo();
        }
        return mensagem;
    }
}
