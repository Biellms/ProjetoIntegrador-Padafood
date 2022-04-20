package entities;

// import java.net.*;
import javax.swing.*;

import interfaces.MenuCliente;
import interfaces.MenuComercio;

import java.text.NumberFormat;
import java.util.*;

public class EstoqueCarrinho {

    // Atributos
    static EstoqueClass estoque = new EstoqueClass();
    static CarrinhoClass lista = new CarrinhoClass();
    static ArrayList<ProdutoClass> carrinho = lista.getLista();
    static ArrayList<ProdutoClass> produto = estoque.getLista();
    static String textoEstoque = "";
    static String textoCarrinho = "";
    static double valor;

    // Métodos
    // Estoque
    public static void Cadastrar() {

        String nome = JOptionPane.showInputDialog(" CADASTRAR PRODUTO\n\n Nome: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog(" CADASTRAR PRODUTO\n\n Preço:"));

        produto.add(new ProdutoClass(nome, preco)); // ADICIONA PRODUTO
        
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog("\n CADASTRADO COM SUCESSO!\n"
                + "\n 1) Cadastrar Novamente"
                + "\n 2) Voltar"
                + "\n\n Opção:"));
            if (op == 1) { Cadastrar(); }
            else { MenuCliente.Menu(); } // RETORNA MENU COMERCIO

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                + "\n Você deve entrar com um número INTEIRO!"
                + "\n Por favor tente novamente!");

            MenuComercio.Menu(); // RETORNA MENU COMERCIO
        }
    }

    public static String verEstoque() {
        if (produto.isEmpty()) {
            textoEstoque = " ESTOQUE VAZIO!\n\n";
        } else {
            textoEstoque = "";
            for (int i = 0; i < produto.size(); i++) {
                textoEstoque += " "+(i+1)+") "+produto.get(i).getNome()+" | "+produto.get(i).formatarMoeda()+"\n";
            }
        }

        return textoEstoque;
    }

    // Carrinho
    public static void Comprar() {
        int back = EstoqueCarrinho.produto.size() + 1;

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n"
			+ " Comércio: "+ComercioClass.getNome()
			+ "\n----------------------------------------\n"
			+ verEstoque()
			+ "----------------------------------------\n"
			+ " "+back+") Voltar\n\n"
			+ "Selecione a opção que deseje comprar:     "));

            if (op == back) {
                MenuCliente.Menu();
            } else {
                op -= 1;
                carrinho.add(produto.get(op));
                MenuCliente.Menu();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                + "\n Você deve entrar com um número INTEIRO!"
                + "\n Por favor tente novamente!");

            Comprar(); // RETORNA MENU COMPRAR
        }
    }

    public static void removerCarrinho() {
        int back = EstoqueCarrinho.produto.size() + 1;

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n"
			+ " Comércio: "+ComercioClass.getNome()
			+ "\n----------------------------------------\n"
			+ verCarrinho()
			+ "----------------------------------------\n"
			+ " "+back+") Voltar\n\n"
			+ "Selecione a opção que deseje comprar:     "));

            if (op == back) {
                MenuCliente.Carrinho();
            } else {
                op -= 1;
                carrinho.remove(op);
                MenuCliente.Carrinho();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                + "\n Você deve entrar com um número INTEIRO!"
                + "\n Por favor tente novamente!");

            Comprar(); // RETORNA MENU COMPRAR
        }
    }

    public static String verCarrinho() {
        if (carrinho.isEmpty()) {
            textoCarrinho = " CARRINHO VAZIO!\n\n";
        } else {
            textoCarrinho = "";
            for (int i = 0; i < carrinho.size(); i++) {
                textoCarrinho += " "+(i+1)+") "+carrinho.get(i).getNome()+" | "+carrinho.get(i).formatarMoeda()+"\n";
            }
        }

        return textoCarrinho;
    }

    // Valor
    public static String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(EstoqueCarrinho.getValor());
		return formatoMoeda;
	}

    public static double getValor() {
        setValor(0);
        return valor;
    }

    public static void setValor(double valor) {
        for (int i = 0; i < carrinho.size(); i++) {
            valor += carrinho.get(i).getPreco();
        }
        EstoqueCarrinho.valor = valor;
    }
}
