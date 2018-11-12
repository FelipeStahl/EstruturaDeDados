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
class NoDuplo {
    private Object elemento;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
    
}
