package interfaces;

import java.util.*;
import javax.swing.*;

import entities.EstoqueCarrinho;
import entities.ClienteClass;

public class MenuCliente {
    
    Scanner ler = new Scanner(System.in);

    public static void Menu() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                + " Cliente "+ClienteClass.getNome()+"\n"
                + " ----------------------------------------\n"
                + " 1) Comprar\n"
                + " 2) Carrinho\n"
                + " 3) Informações do Usuário\n"
                + " ----------------------------------------\n"
                + " 4) Sair\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: comprarProduto(); break;
                    case 2: Carrinho(); break;
                    case 3: ClienteClass.print(); break;
                    case 4: Main.Menu(); break;
                    default: JOptionPane.showMessageDialog(null," Opção Inválida!"); Menu(); break;
                }

            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
                Menu();
            }
    }

    public static void comprarProduto() {
        EstoqueCarrinho.Comprar();
    }

    public static void Carrinho() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null," ----------------------------------------\n"
                + " CARRINHO \n"
                + " ----------------------------------------\n"
                + EstoqueCarrinho.verCarrinho()
                + " ----------------------------------------\n"
                + " Valor Total: "+EstoqueCarrinho.formatarMoeda()+"\n\n"
                + " 1) Finalizar Pedido\n"
                + " 2) Remover Produto\n"
                + " 3) Voltar\n"
                + "\n Opção"));

                switch (op) {
                    case 1: JOptionPane.showMessageDialog(null," Pedido Finalizado!"); Carrinho(); break;
                    case 2: EstoqueCarrinho.removerCarrinho(); break;
                    case 3: Menu(); break;
                    default: JOptionPane.showMessageDialog(null," Opção Inválida!"); Carrinho(); break;
                }
        
            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");
                Menu();
            }
    }
}
