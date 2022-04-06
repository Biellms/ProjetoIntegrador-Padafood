package logincadastro;

import java.util.*;
import javax.swing.*;

public class ClienteClass {

	/* Atributos Static para não precisar criar um Objeto, e não 
	acabar perdendo o valor ao voltar em algum método*/
	private static String nome;	
	public static String email;
	public static String senha;
	public static String nascimento;
	public static Boolean status = false;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public ClienteClass() { // Vazio para podermos implementar no método cadastro
		
	}
	
	// Métodos
	static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d;

		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n           "
				+ "CADASTRO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); ClienteClass.setNome(a);
		b = JOptionPane.showInputDialog(" Email: "); ClienteClass.setEmail(b);
		c = JOptionPane.showInputDialog(" Senha: "); ClienteClass.setSenha(c);
		d = JOptionPane.showInputDialog(" Data de Nascimento: "); ClienteClass.setNascimento(d);
		status = true;
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!"
										 + "\n\n SEJA BEM VINDO "+getNome()+"!!\n");

		JOptionPane.showMessageDialog(null," MENU CLIENTE");
	}
	
	static void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		int op;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n              "
				+ "LOGIN\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Email: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getEmail()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!"); 
		
		}
		
		// Retornar ou continuar tentando
		else { op = Integer.parseInt(JOptionPane.showInputDialog("\n EMAIL E SENHA INCORRETOS!!\n"
				+ "\n 1) Tentar novamente"
				+ "\n 2) Voltar"
				+ "\n\n Opção:")); 
		if (op == 1) { ClienteClass.login(); } else { Main.Menu(); }
		}
	}
		
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n          "
				+ "INFORMAÇÕES\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
				+ "\n Email: "+getEmail()+""
				+ "\n Senha: "+getSenha()+""		
				+ "\n Data de Nascimento: "+getNascimento()+"\n\n");
	}
	
	// Get e Set
	public static String getNome() { return nome; }

	public static void setNome(String nome) { ClienteClass.nome = nome; }

	public static String getEmail() { return email; }

	public static void setEmail(String email) { ClienteClass.email = email; }

	public static String getSenha() { return senha; }

	public static void setSenha(String senha) { ClienteClass.senha = senha; }

	public static String getNascimento() { return nascimento; }

	public static void setNascimento(String nascimento) { ClienteClass.nascimento = nascimento; }

	public static Boolean getStatus() { return status; }

	public static void setStatus(Boolean status) { ClienteClass.status = status; }

}
