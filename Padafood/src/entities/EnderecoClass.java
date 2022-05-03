package entities;

import javax.swing.*;

import interfaces.FinalizarPedido;

public class EnderecoClass {
    
    // Atributos
    private static String rua;
    private static int numero;
    private static String complemento;
    private static Boolean status;

    public static String textoEndereco = "";

    // Métodos
    public static void cadastro() { // Implementa dados para o Pagamento
		String a, c;
        int b;

            JOptionPane.showMessageDialog(null," ----------------------------------------\n"
            + " CADASTRAR ENDEREÇO\n ----------------------------------------");
            a = JOptionPane.showInputDialog(" Endereço: "); setRua(a);
            b = Integer.parseInt(JOptionPane.showInputDialog(" Número: ")); setNumero(b);
            c = JOptionPane.showInputDialog(" Complemento: "); setComplemento(c);
            setStatus(true);
            JOptionPane.showMessageDialog(null,"\n ENDEREÇO CADASTRADO COM SUCESSO!    \n");

		FinalizarPedido.Confirmar(); // RETORNA CONFIRMAR PEDIDO
	}

    public static String print() {
        return textoEndereco = " Endereço: "+getRua()
        + "\n Número: "+getNumero()
        + "\n Complemento: "+getComplemento()
        + "\n";
    }

    // Getters and Setters
    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        EnderecoClass.rua = rua;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        EnderecoClass.numero = numero;
    }

    public static String getComplemento() {
        return complemento;
    }

    public static void setComplemento(String complemento) {
        EnderecoClass.complemento = complemento;
    }

    public static Boolean getStatus() {
        return status;
    }

    public static void setStatus(Boolean status) {
        EnderecoClass.status = status;
    }

}
