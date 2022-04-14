package interfaces;

import java.util.*;
import javax.swing.*;

import entities.ComercioClass;
import main.Main;

public class MenuComercio {

    Scanner ler = new Scanner(System.in);

    public static void Menu() {

        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                    + " Comércio "+ComercioClass.getNome()+"\n"
                    + " ----------------------------------------\n"
                    + " 1) Cadastrar Produtos\n"
                    + " 2) Ver Produtos\n"
                    + " 3) Informações do Usuário\n"
                    + " ----------------------------------------\n"
                    + " 4) Sair\n"
                    + "\n Opção:"));
            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                        + "\n Você deve entrar com um número INTEIRO!"
                        + "\n Por favor tente novamente!");
                        MenuComercio.Menu();
            }

            switch (op) {
                case 1: cadastrarProduto(); break;
                case 2: verProdutos(); break;
                case 3: ComercioClass.print(); break;
                case 4: Main.Menu(); break;
                default: break;
            }
    }

    public static void cadastrarProduto() {
        JOptionPane.showMessageDialog(null, " Menu Comprar");
        MenuCliente.Menu();
    }

    public static void verProdutos() {
        JOptionPane.showMessageDialog(null, " Menu Carrinho");
        MenuCliente.Menu();
    }
}
