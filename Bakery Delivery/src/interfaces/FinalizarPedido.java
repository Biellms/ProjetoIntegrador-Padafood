package interfaces;

import javax.swing.*;

import entities.EstoqueCarrinho;
import entities.PagamentoClass;

public class FinalizarPedido {

    public static void Menu() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                " --------------------------------------------------------------\n"
                + PagamentoClass.print()
                + " --------------------------------------------------------------\n"
                + " Valor Total: "+EstoqueCarrinho.formatarMoeda()+"\n\n"
                + " 1) Finalizar Pedido\n"
                + " 2) Adicionar Forma de Pagamento\n"
                + " 3) Remover Forma de Pagamento\n"
                + " --------------------------------------------------------------\n"
                + " 4) Voltar\n"
                + "\n Opção:"));

                switch (op) {
                    case 1: Finalizar(); break;
                    case 2: Adicionar(); break;
                    case 3: Remover(); break;
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

    public static void Finalizar() {
        JOptionPane.showMessageDialog(null, " Pedido Finalizado!   ");
        Menu();
    }

    public static void Adicionar() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(" Selecione a Forma de Pagamento:\n\n"
                + " 1) Pagar na Entrega\n"
                + " 2) Pagar no Aplicativo\n\n"
                + " Opção"));

                switch (op) {
                    case 1: Finalizar(); break;
                    case 2: PagamentoClass.cadastro(); break;
                    default: Adicionar(); break;
                }
            
            } catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro
                JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
                    + "\n Você deve entrar com um número INTEIRO!"
                    + "\n Por favor tente novamente!");

                Adicionar(); // RETORNA MÉTODO ADICIONAR
            }
    }

    public static void Remover() {
        PagamentoClass.remover();
        Menu();
    }

    public static void main(String[] args) {
        Menu();
    }
}
