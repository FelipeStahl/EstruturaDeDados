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
public class Fila {
    private No inicio;
    private Integer tamanho;
    
    public Fila() {
        tamanho = 0;
    }

    public void adicionar(Object objeto) {
        No novoElemento = new No();
        novoElemento.setElemento(objeto);
        if (null == inicio) {
            inicio = novoElemento;
            tamanho++;
        } else {
            No auxiliar = inicio;
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoElemento);
            tamanho++;
        }
    }

    public Object remover() {
        Object elemento = inicio.getElemento();
        inicio = inicio.getProximo();
        tamanho--;
        return elemento;
    }

    public Integer tamanho() {
        return this.tamanho;
    }

    public Boolean isVazia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String mensagem = "";
        No auxiliar = inicio;
        while (auxiliar != null) {
            mensagem += auxiliar.getElemento() + "\n";
            auxiliar = auxiliar.getProximo();
        }
        return mensagem;
    }
}
