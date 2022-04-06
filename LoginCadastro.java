package logincadastro;

import java.util.*;
import javax.swing.*;

public class LoginCadastro {
    
    Scanner ler = new Scanner(System.in);

    static void Login() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1) Login Cliente\n 2) Login Comércio\n 3) Voltar\n\n Opção:"));

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			        Login(); }
                       
            switch (op) {
                case 1: LoginCliente(); break;
                case 2: LoginComercio(); break;
                case 3: Main.Menu(); break;
                default: Login(); break;
            }
                
    }

    static void LoginCliente() {
        JOptionPane.showMessageDialog(null, " Login Cliente");
        Login();
    }

    static void LoginComercio() {
        JOptionPane.showMessageDialog(null, " Login Comercio");
        Login();
    }

    static void Cadastro() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1) Cadastro Cliente\n 2) Cadastro Comércio\n 3) Voltar\n\n Opção:"));

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			        Cadastro(); }
                       
            switch (op) {
                case 1: CadastroCliente(); break;
                case 2: CadastroComercio(); break;
                case 3: Main.Menu(); break;
                default: Cadastro(); break;
            }
                
    }

    static void CadastroCliente() {
        JOptionPane.showMessageDialog(null, " Cadastro Cliente");
        Login();
    }

    static void CadastroComercio() {
        JOptionPane.showMessageDialog(null, " Cadastro Comercio");
        Login();
    }
}
