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
public class ListaDuplamenteEncadeada implements Lista {

    private Integer tamanho;
    private NoDuplo inicio;

    public ListaDuplamenteEncadeada() {
        this.tamanho = 0;
    }

    @Override
    public void adicionar(Object objeto) {
        NoDuplo novoElemento = new NoDuplo();
        novoElemento.setElemento(objeto);
        if (null == inicio) {
            inicio = novoElemento;
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoElemento);
            novoElemento.setAnterior(auxiliar);
            tamanho++;
        }
    }

    @Override
    public void adicionar(Object objeto, Integer posicao) {
        NoDuplo novoElemento = new NoDuplo();
        novoElemento.setElemento(objeto);

        if (posicao > tamanho) {
            throw new UnsupportedOperationException("Posição inexistente.");
        }

        if (posicao.equals(1)) {
            NoDuplo auxiliar = inicio;
            inicio = novoElemento;
            inicio.setProximo(auxiliar);
            auxiliar.setAnterior(inicio);
            tamanho++;
        } else {
            NoDuplo auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice + 1)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            NoDuplo temporario = auxiliar.getProximo();
            novoElemento.setProximo(temporario);
            if (temporario != null) {
                temporario.setAnterior(novoElemento);
            }
            auxiliar.setProximo(novoElemento);
            novoElemento.setAnterior(auxiliar);
            tamanho++;
        }
    }

    @Override
    public Object buscar(Object objeto) {
        if (inicio == null) {
            return null;
        }
        NoDuplo auxiliar = inicio;
        if (objeto.equals(auxiliar.getElemento())) {
            return auxiliar.getElemento();
        } else {
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
                if (objeto.equals(auxiliar.getElemento())) {
                    return auxiliar.getElemento();
                }
            }
        }
        return null;
    }

    @Override
    public Object buscar(Integer posicao) {
        if (posicao > tamanho || posicao <= 0 || tamanho <= 0) {
            return null;
        }
        NoDuplo auxiliar = inicio;
        Integer indice = 1;
        while (!indice.equals(posicao)) {
            auxiliar = auxiliar.getProximo();
            indice++;
        }
        return auxiliar.getElemento();
    }

    @Override
    public Boolean remover(Object objeto) {
        if (inicio == null) {
            return false;
        }
        Integer posicao = 1;
        NoDuplo auxiliar = inicio;
        while (posicao <= tamanho) {
            if (auxiliar.getElemento().equals(objeto)) {
                remover(posicao);
                posicao = tamanho;
            } else {
                auxiliar = auxiliar.getProximo();
            }
            posicao++;
        }
        return true;
    }

    @Override
    public Boolean remover(Integer posicao) {
        if (posicao > tamanho || posicao <= 0 || tamanho <= 0) {
            return false;
        }

        if (posicao.equals(1)) {
            inicio = inicio.getProximo();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
            tamanho--;
        } else {
            NoDuplo auxiliar = inicio;
            Integer indice = 1;
            while (!posicao.equals(indice)) {
                auxiliar = auxiliar.getProximo();
                indice++;
            }
            auxiliar.getAnterior().setProximo(auxiliar.getProximo());
            if (auxiliar.getProximo() != null) {
                auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            }
            tamanho--;
        }
        return true;
    }

    @Override
    public Integer tamanho() {
        return tamanho;
    }

    @Override
    public Boolean existe(Object objeto) {
        if (inicio == null) {
            return false;
        }
        NoDuplo auxiliar = inicio;
        if (objeto.equals(auxiliar.getElemento())) {
            return true;
        } else {
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
                if (objeto.equals(auxiliar.getElemento())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void limpar() {
        inicio = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        String texto = "";
        if (this.tamanho > 0) {
            NoDuplo auxiliar = inicio;
            while (auxiliar != null) {
                texto += auxiliar.getElemento().toString() + ", ";
                auxiliar = auxiliar.getProximo();
            }
            if (texto.length() > 0) {
                texto = texto.substring(0, texto.length() - 2);
            }
        }
        return texto;
    }

    public String inverso() {
        String texto = "";
        NoDuplo auxiliar = inicio;
        while (auxiliar.getProximo() != null) {
            auxiliar = auxiliar.getProximo();
        }
        while (auxiliar != null) {
            texto += auxiliar.getElemento().toString() + ", ";
            auxiliar = auxiliar.getAnterior();
        }
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
        }
        return texto;
    }

    private String toStringCompleto() {
        String texto = "";
        if (this.tamanho > 0) {
            NoDuplo auxiliar = inicio;
            while (auxiliar != null) {
                texto += "Elemento: " + auxiliar.getElemento().toString() + "\r\n";
                if (auxiliar.getAnterior() != null) {
                    texto += "Anterior: " + auxiliar.getAnterior().getElemento() + "\r\n";
                } else {
                    texto += "Anterior: " + auxiliar.getAnterior() + "\r\n";
                }
                if (auxiliar.getProximo() != null) {
                    texto += "Próximo: " + auxiliar.getProximo().getElemento() + "\r\n\r\n";
                } else {
                    texto += "Próximo: " + auxiliar.getProximo() + "\r\n\r\n";
                }
                auxiliar = auxiliar.getProximo();
            }
            if (texto.length() > 0) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        return texto;
    }
}
