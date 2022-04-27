package interfaces;

import java.util.*;
import javax.swing.*;

import entities.ClienteClass;
import entities.ComercioClass;

public class LoginECadastro {
    
    Scanner ler = new Scanner(System.in);

    public static void Login() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n "
                + " Escolha o tipo de Login\n"
                + " ----------------------------------------\n"
                + " 1) Cliente\n"
                + " 2) Comércio\n"
                + " ----------------------------------------\n"
                + " 3) Voltar\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: ClienteClass.login(); break;
                    case 2: ComercioClass.login(); break;
                    case 3: Main.Menu(); break;
                    default: JOptionPane.showMessageDialog(null," Opção Inválida!"); Login(); break;
                } 

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			        Login(); }
 
    }

    public static void Cadastro() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n "
                + " Escolha o tipo de Cadastro\n"
                + " ----------------------------------------\n"
                + " 1) Cliente\n"
                + " 2) Comércio\n"
                + " ----------------------------------------\n"
                + " 3) Voltar\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: ClienteClass.cadastro(); break;
                    case 2: ComercioClass.cadastro(); break;
                    case 3: Main.Menu(); break;
                    default: JOptionPane.showMessageDialog(null," Opção Inválida!"); Cadastro(); break;
                } 

        } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			    Cadastro(); }
    }

}
