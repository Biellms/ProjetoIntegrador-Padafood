package interfaces;

import java.util.*;
import javax.swing.*;

public class FinalizarPedido {

    public static void Cadastrar() {

        int op = 0;

        try {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
                + " Forma de Pagamento: 'null'\n"
                + " ----------------------------------------\n"
                + " Exemplo\n Exemplo\n Exemplo\n Exemplo\n"
                + " ----------------------------------------\n"
                + " 1) Adicionar/Atualizar\n"
                + " 2) Remover\n"
                + " ----------------------------------------\n"
                + " 3) Sair\n"
                + "\n Opção:"));

            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");

                MenuCliente.Carrinho(); // RETORNA MENU CARRINHO
            }
    }
}
