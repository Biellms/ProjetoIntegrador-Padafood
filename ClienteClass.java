package logincadastro;

import java.util.*;
import javax.swing.*;

import interfaceusuario.MenuCliente;
// import main.Main;

public class ClienteClass {

	/* Atributos Static para não precisar criar um Objeto, e não 
	acabar perdendo o valor ao voltar em algum método*/
	private static String nome;
	private static String email;
	private static String senha;
	private static String telefone;
	private static Boolean status;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public ClienteClass() { // Vazio para podermos implementar no método cadastro
		status = false;
	}
	
	// Métodos
	public static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d;

		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " CADASTRO CLIENTE\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); setNome(a);
		b = JOptionPane.showInputDialog(" Email: "); setEmail(b);
		c = JOptionPane.showInputDialog(" Senha: "); setSenha(c);
		d = JOptionPane.showInputDialog(" Telefone: "); setTelefone(d);
		status = true;
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!"
										 + "\n\n SEJA BEM VINDO "+getNome()+"!!\n");

		MenuCliente.Menu(); // RETORNAR MENU CLIENTE
	}
	
	public static void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		int op;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " LOGIN CLIENTE\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Email: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getEmail()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!");

			MenuCliente.Menu(); // RETORNAR MENU CLIENTE

		} else { 
				try {
					op = Integer.parseInt(JOptionPane.showInputDialog("\n EMAIL E SENHA INCORRETOS!!\n"
				+ "\n 1) Tentar novamente"
				+ "\n 2) Voltar"
				+ "\n\n Opção:"));
					if (op == 1) { ClienteClass.login(); } else { LoginECadastro.Login(); }

				} catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
					JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
							+ "\n Você deve entrar com um número INTEIRO!"
							+ "\n Por favor tente novamente!");
					ClienteClass.login(); }
		}
	}
		
	public static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " INFORMAÇÕES CLIENTE\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
				+ "\n Email: "+getEmail()+""
				+ "\n Senha: "+getSenha()+""		
				+ "\n Telefone: "+getTelefone()+"\n\n");

				MenuCliente.Menu(); // RETORNAR MENU CLIENTE
	}
	
	// Getters and Setters
	public static String getNome() { return nome; }

	public static void setNome(String nome) { ClienteClass.nome = nome; }

	public static String getEmail() { return email; }

	public static void setEmail(String email) { ClienteClass.email = email; }

	public static String getSenha() { return senha; }

	public static void setSenha(String senha) { ClienteClass.senha = senha; }

	public static String getTelefone() { return telefone; }

	public static void setTelefone(String telefone) { ClienteClass.telefone = telefone; }

	public static Boolean getStatus() { return status; }

	public static void setStatus(Boolean status) { ClienteClass.status = status; }

}
