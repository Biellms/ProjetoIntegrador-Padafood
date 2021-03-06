package interfaces;

import java.awt.*;
import java.net.*;

import javax.swing.*;
import javax.swing.plaf.*;

public class Main {
	
	public static void Menu () {
		
		int op = 0;
		
		// Menu de opções
		// Exception para aceitar apenas Números
		try {
			op = Integer.parseInt(JOptionPane.showInputDialog(
				" -------------------------------------------------------------- \n"
				+ " ESCOLHA A OPÇÃO\n"
				+ " -------------------------------------------------------------- \n"
				+ " 1) Login\n 2) Cadastro\n 3) Informações do Sistema\n"
				+ " -------------------------------------------------------------- \n"
				+ " 4) Sair\n\n Opção: "));
			
				switch (op) {
					case 1: LoginECadastro.Login(); break;
					case 2: LoginECadastro.Cadastro(); break;
					case 3: Info(); break;
					case 4: System.exit(0); break;
					default: JOptionPane.showMessageDialog(null,"\n Opcao Inválida!!"); Menu(); break;
				}
				
		} catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
				+ "\n Você deve entrar com um número INTEIRO!"
				+ "\n Por favor tente novamente!");
			Main.Menu(); }

	}

	public static void Info() {
		JOptionPane.showMessageDialog(null, 

		" --------------------------------------------------"
		+ " PADAFOOD"
		+ " ---------------------------------------------------       \n\n"
		+ " 	Padafood é um aplicativo no qual a problemática são as dificuldades financeiras\n" 
		+ " das padarias, em relação aos seus prejuízos sociais por não terem um meio de\n"
		+ " compartilhamento e distribuição de seus produtos.\n\n"
		+ " 	Para a solução, o desenvolvimento de um aplicativo da qual a padaria irá\n"
		+ " cadastrar seu comércio e catalogar os seus produtos no sistema, para que o cliente\n"
		+ " consiga ver os seus produtos de forma clara e fácil. Resultando em um melhor\n"
		+ " relacionamento entre o comércio e o cliente, de forma prática, segura e com\n"
		+ " distanciamento social.\n\n"
		+ " Projeto: https://github.com/Biellms/ProjetoIntegrador-Padafood\n\n\n\n"
		+ "                            © 2022 Gabriel Mendes | Todos os Direitos Reservados",

		"Informações", JOptionPane.INFORMATION_MESSAGE);
		Main.Menu();
	}

	public static void main(String[] args) throws Exception {
		
		// Alterando Fonte do JOptionPane
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD , 14)));
		
		// // Gif no JOptionPane
		// final ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/5tyVfiF.gif"));
		
		// JOptionPane.showMessageDialog(null,null,"START", JOptionPane.INFORMATION_MESSAGE, icon);
		JOptionPane.showMessageDialog(null,
			"\n --------------------------------------\n"
			+ " BEM-VINDO AO PADAFOOD"
			+ "\n --------------------------------------","BEM-VINDO", JOptionPane.INFORMATION_MESSAGE);
			
		Main.Menu();
	}
}
