package interfaces;

import java.util.*;
import javax.swing.*;

import entities.CarrinhoClass;
import entities.ClienteClass;

public class MenuCliente {
    
    Scanner ler = new Scanner(System.in);

    public static void Menu() {

        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                    + " Cliente "+ClienteClass.getNome()+"\n"
                    + " ----------------------------------------\n"
                    + " 1) Comprar\n"
                    + " 2) Carrinho\n"
                    + " 3) Informações do Usuário\n"
                    + " ----------------------------------------\n"
                    + " 4) Sair\n"
                    + "\n Opção:"));
            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                        + "\n Você deve entrar com um número INTEIRO!"
                        + "\n Por favor tente novamente!");
                MenuCliente.Menu();
            }

            switch (op) {
                case 1: Comprar(); break;
                case 2: Carrinho(); break;
                case 3: ClienteClass.print(); break;
                case 4: Main.Menu(); break;
                default: break;
            }
    }

    public static void Comprar() {
        JOptionPane.showMessageDialog(null, " Menu Comprar");
        CarrinhoClass.Comprar();
    }

    public static void Carrinho() {
        JOptionPane.showMessageDialog(null, " Menu Carrinho");
        MenuCliente.Menu();
    }

    public static void main(String[] args) {
        MenuCliente.Menu();
    }
}
