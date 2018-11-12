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
public interface Lista {
    public void adicionar(Object objeto);
    public void adicionar(Object objeto, Integer posicao);
    public Object buscar(Object objeto);
    public Object buscar(Integer posicao);
    public Boolean remover(Object objeto);
    public Boolean remover(Integer posicao);
    public Integer tamanho();
    public String toString();
    public Boolean existe(Object objeto);
    public void limpar();
}
