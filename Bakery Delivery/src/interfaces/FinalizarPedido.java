package interfaces;

import javax.swing.*;

import entities.EstoqueCarrinho;
import entities.CartaoClass;
import entities.EnderecoClass;

public class FinalizarPedido {

    public static void Menu() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                " --------------------------------------------------------------\n"
                + CartaoClass.print()
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

    public static void Finalizar() { // Por condicional de pagamento
        if (EnderecoClass.getStatus() == null || EnderecoClass.getStatus() == false) {
            if (CartaoClass.getStatus() == null || CartaoClass.getStatus() == false) {
                JOptionPane.showMessageDialog(null, " Adicione um método de pagamento primeiro!   ");
                Adicionar();
            } else {
                EnderecoClass.cadastro();
            }
        } else {
            Confirmar();
        }
        
    }

    public static void Adicionar() {

        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(" Selecione a Forma de Pagamento:\n\n"
                + " 1) Pagar na Entrega\n"
                + " 2) Pagar no Aplicativo\n\n"
                + " Opção"));

                switch (op) {
                    case 1: CartaoClass.setStatus(true); 
                            CartaoClass.setTipo("Pagar na Entrega"); 
                            Finalizar(); break;
                    case 2: CartaoClass.cadastro(); break;
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
        CartaoClass.setStatus(false);
        EnderecoClass.setStatus(false);
        JOptionPane.showMessageDialog(null, "Removido com sucesso!    \n");
        Menu();
    }

    public static void Confirmar() { // Implementar carrinho e endereço
        int op = Integer.parseInt(JOptionPane.showInputDialog(" Valor Total: "+EstoqueCarrinho.formatarMoeda()+"\n\n"
        + " Confirmar pedido?\n"
        + " 1) Sim\n"
        + " 2) Não\n\n"
        + " Opção:"));

        if (op == 1) {
            JOptionPane.showMessageDialog(null, " Pedido processado com sucesso!");
            Menu();
        } else {
            Menu();
        }
        
    }

    public static void main(String[] args) {
        Menu();
    }
}
