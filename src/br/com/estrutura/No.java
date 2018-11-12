/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estrutura;

/**
 *
 * @author Alunos
 */
public class No {
    private Object elemento;
    private No proximo;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object nome) {
        this.elemento = nome;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
