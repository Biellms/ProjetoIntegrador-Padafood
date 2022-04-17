package entities;

import java.util.*;
import javax.swing.*;

import interfaces.MenuCliente;

public class CarrinhoClass {
    
    // Atributos
	static ArrayList<ProdutoClass> carrinho = new EstoqueClass().getLista();
	static String textoEstoque = "";

	// Métodos
	public static void Comprar() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n"
			+ " Produtos\n----------------------------------------\n"
			+ CadastroProduto.Print()
			+ "----------------------------------------\n"
			+ "5) Voltar\n\n"
			+ "Opção:"));

			if (op == 5) {
				MenuCliente.Menu();
			} else {
				MenuCliente.Menu();
			}
	}
}
