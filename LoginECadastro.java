package logincadastro;

import java.util.*;
import javax.swing.*;

public class LoginECadastro {
    
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
                case 1: ClienteClass.login(); break;
                case 2: ComercioClass.login(); break;
                case 3: Main.Menu(); break;
                default: Login(); break;
            } 
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
                case 1: ClienteClass.cadastro(); break;
                case 2: ComercioClass.cadastro(); break;
                case 3: Main.Menu(); break;
                default: Cadastro(); break;
            } 
    }

}
