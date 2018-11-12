/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio;

import java.util.Random;
import javax.swing.JOptionPane;
import br.com.estrutura.ListaEncadeada;

/**
 *
 * @author Felipe-Sistema
 */
public class Exercicio2 {

    private static ListaEncadeada senhaNormal;
    private static ListaEncadeada senhaPrioritaria;

    public static void main(String[] args) {
        senhaNormal = new ListaEncadeada();
        senhaPrioritaria = new ListaEncadeada();
        menu();
    }

    private static void menu() {
        String mensagem = "### MENU ###\n";
        mensagem += " (i) Gerar uma nova senha;\n";
        mensagem += " (ii) Gerar senha prioritária;\n";
        mensagem += " (iii) Chamar o próximo e visualizar a fila de espera;\n";
        mensagem += " (sair) Encerrar programa;\n";
        String resposta = JOptionPane.showInputDialog(mensagem);
        switch (resposta) {
            case "i":
                JOptionPane.showMessageDialog(null, "Senha: " + novaSenha());
                menu();
                break;
            case "ii":
                JOptionPane.showMessageDialog(null, "Senha prioritária: " + novaSenhaPrioritaria());
                menu();
                break;
            case "iii":
                JOptionPane.showMessageDialog(null,"Próximo: " + chamarProximo()+ "\n\nSenha normal: " + senhaNormal + "\nSenha Prioritaria: " + senhaPrioritaria);
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

    private static Integer novaSenha() {
        Random r = new Random();
        Integer senha = null;
        while (senha == null || senhaNormal.existe(senha) && senhaPrioritaria.existe(senha)) {
            senha = r.nextInt(999);
        }
        senhaNormal.adicionar(senha);
        return senha;
    }

    private static Integer novaSenhaPrioritaria() {
        Random r = new Random();
        Integer senha = null;
        while (senha == null || senhaNormal.existe(senha) && senhaPrioritaria.existe(senha)) {
            senha = r.nextInt(999);
        }
        senhaPrioritaria.adicionar(senha);
        return senha;
    }
    
    private static Integer chamarProximo(){
        Integer proximo;
        proximo = (Integer)senhaPrioritaria.getProximo();
        if(proximo == null){
            proximo = (Integer)senhaNormal.getProximo();
        }
        return proximo;
    }
}
