package logincadastro;

import java.util.*;
import javax.swing.*;

import main.Main;

public class LoginECadastro {
    
    Scanner ler = new Scanner(System.in);

    public static void Login() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                + " Escolha o tipo de Login\n"
                + " ----------------------------------------\n"
                + " 1) Cliente\n"
                + " 2) Comércio\n"
                + " ----------------------------------------\n"
                + " 3) Voltar\n"
                + "\n Opção:"));

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

    public static void Cadastro() {
        
        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                + " Escolha o tipo de Cadastro\n"
                + " ----------------------------------------\n"
                + " 1) Cliente\n"
                + " 2) Comércio\n"
                + " ----------------------------------------\n"
                + " 3) Voltar\n"
                + "\n Opção:"));

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
