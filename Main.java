package logincadastro;

import java.awt.*;
import java.net.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Main {
	
	static void Menu () {
		
		int op = 0;
		
		// Menu de opções
		// Exception para aceitar apenas Números
		try {
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n "
					+ "ESCOLHA A OPÇÃO\n ----------------------------------------\n "
					+ "1) Login\n 2) Cadastro\n 3) Informações do Sistema\n 4) Sair\n\n Opção: "));
			
		} catch (NumberFormatException e) { // Verifica se o dado de entrada � um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			Main.Menu(); }

			switch (op) {
			case 1: LoginECadastro.Login(); break;
			case 2: LoginECadastro.Cadastro(); break;
			case 3: Info(); break;
			case 4: System.exit(0); break;
			
			default: JOptionPane.showMessageDialog(null,"\n Opcao Inválida!!"); Main.Menu(); break;
			}
			
	}

	static void Info() {
		ClienteClass.print();
		ComercioClass.print();
		Main.Menu();
	}

	public static void main(String[] args) throws Exception {
		
		// // Alterando Fonte do JOptionPane
		// UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 14)));
		
		// // Gif no JOptionPane
		// final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/5tyVfiF.gif"));
		
		// JOptionPane.showMessageDialog(null,null,null, JOptionPane.INFORMATION_MESSAGE, icon);
		// JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n "
		// 		+ "BEM VINDO AO STEAM 36!!\n "
		// 		+ "----------------------------------------");
			
		Main.Menu();
	}
	
}
