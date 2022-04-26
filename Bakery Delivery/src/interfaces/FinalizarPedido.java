package interfaces;

import javax.swing.*;

import entities.PagamentoClass;

public class FinalizarPedido {

    public static void Menu() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                " --------------------------------------------------------------\n"
                + PagamentoClass.print()
                + " --------------------------------------------------------------\n"
                + " 1) Adicionar Forma de Pagamento\n"
                + " 2) Remover\n"
                + " 3) Finalizar Pedido\n"
                + " --------------------------------------------------------------\n"
                + " 4) Voltar\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: JOptionPane.showMessageDialog(null, " Forma de Pagamento Adicionada/Atualizada!   "); Menu(); break;
                    case 2: JOptionPane.showMessageDialog(null, " Forma de Pagamento Removida!   "); Menu(); break;
                    case 3: JOptionPane.showMessageDialog(null, " Pedido Finalizado!   "); Menu(); break;
                    case 4: MenuCliente.Carrinho(); break;
                    default: MenuCliente.Carrinho(); break;
                }

            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");

                MenuCliente.Carrinho(); // RETORNA MENU CARRINHO
            }
    }

    public static void main(String[] args) {
        Menu();
    }
}
