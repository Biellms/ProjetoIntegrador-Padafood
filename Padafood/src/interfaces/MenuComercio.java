package interfaces;

import javax.swing.*;

import entities.EstoqueCarrinho;
import entities.ComercioClass;

public class MenuComercio {

    public static void Menu() {

        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" -------------------------------------------------------------- \n"
                + " Comércio "+ComercioClass.getNome()+"\n"
                + " -------------------------------------------------------------- \n"
                + " 1) Cadastrar Produto\n"
                + " 2) Estoque\n"
                + " 3) Informações do Usuário\n"
                + " -------------------------------------------------------------- \n"
                + " 4) Sair\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: cadastrarProduto(); break;
                    case 2: Estoque(); break;
                    case 3: ComercioClass.print(); break;
                    case 4: Main.Menu(); break;
                    default: JOptionPane.showMessageDialog(null," Opção Inválida!"); Menu(); break;
                }

            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");

                MenuComercio.Menu(); // RETORNA MENU COMERCIO
            }
    }

    public static void cadastrarProduto() {
        EstoqueCarrinho.Cadastrar();
    }

    public static void Estoque() {
        JOptionPane.showMessageDialog(null,
            " -------------------------------------------------------------- \n"
            + " ESTOQUE \n"
            + " -------------------------------------------------------------- \n"
            + EstoqueCarrinho.verEstoque()
            + " -------------------------------------------------------------- \n");
            
        MenuComercio.Menu(); // RETORNA MENU COMERCIO
    }
}
