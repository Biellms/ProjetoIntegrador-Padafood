package entities;

// import java.net.*;
import javax.swing.*;

import interfaces.MenuComercio;

import java.util.*;

public class CadastroProduto {

    // Atributos
    static EstoqueClass estoque = new EstoqueClass();
    static ArrayList<ProdutoClass> produto = estoque.getLista();
    static String textoEstoque = "";

    // Métodos
    public static void Cadastrar() {

        String nome = JOptionPane.showInputDialog(" CADASTRAR PRODUTO\n\n Nome: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog(" CADASTRAR PRODUTO\n\n Preço:"));

        produto.add(new ProdutoClass(nome, preco)); // ADICIONA PRODUTO
        
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog("\n CADASTRAR COM SUCESSO!\n"
                + "\n 1) Cadastrar Novamente"
                + "\n 2) Voltar"
                + "\n\n Opção:"));
            if (op == 1) { CadastroProduto.Cadastrar(); } 
            else { MenuComercio.Menu(); } // RETORNA MENU COMERCIO

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                + "\n Você deve entrar com um número INTEIRO!"
                + "\n Por favor tente novamente!");

            MenuComercio.Menu(); // RETORNA MENU COMERCIO
        }
    }

    public static String Print() {
        if (produto.isEmpty()) {
            textoEstoque = " ESTOQUE VAZIO!\n\n";
        } else {
            textoEstoque = "";
            for (int i = 0; i < produto.size(); i++) {
                textoEstoque += " "+(i+1)+") "+produto.get(i).getNome()+" | "+produto.get(i).formatarMoeda()+"\n\n";
            }
        }

        return textoEstoque;
    }
}
