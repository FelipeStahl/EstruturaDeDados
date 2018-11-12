/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio;

import br.com.estrutura.ListaCircular;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe-Sistema
 */
public class Exercicio5 {

    private static ListaCircular lista;

    public static void main(String[] args) {
        lista = new ListaCircular();
        menu();
    }

    private static void menu() {
        String mensagem = "### DOIS OU UM AMERICANO ###\n";
        mensagem += " (i) Adicionar Jogadores;\n";
        mensagem += " (ii) Sortear jogador;\n";
        mensagem += " (sair) Encerrar programa;\n\n";
        mensagem += " ### JOGADORES ###\n";
        mensagem += lista;
        String resposta = JOptionPane.showInputDialog(mensagem);
        switch (resposta) {
            case "i":
                adicionarJogador();
                menu();
                break;
            case "ii":
                sortearJogador();
                menu();
                break;
            case "sair":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Insira apenas a letra 'i'\nna quantidade exata para selecionar um dos itens.");
                menu();
                break;
        }
    }

    private static void adicionarJogador() {
        lista.adicionar(JOptionPane.showInputDialog("Insira o nome do jogador:"));
    }

    private static void sortearJogador() {
        Integer sorteado = sortearNumero();
        Integer num = sorteado % lista.tamanho();
        if(num.equals(0)){
            num = lista.tamanho();
        }
        JOptionPane.showMessageDialog(null, "Jogador sorteado: " + lista.buscar(num) + "\nNúmero: " + sorteado);
    }

    private static Integer sortearNumero() {
        Integer num = 0;
        Random r = new Random();
        for (int i = 0; i < lista.tamanho(); i++) {
            num += r.nextInt(10);
        }
        return num;
    }
}
