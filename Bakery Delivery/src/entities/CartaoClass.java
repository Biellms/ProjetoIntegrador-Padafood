package entities;

import javax.swing.*;

import interfaces.FinalizarPedido;

public class CartaoClass {

    // Atributos
    private static String tipo;
    private static String nome;
	private static String numero;
	private static String dataVenc;
	private static String codSeg;
	private static Boolean status;

    public static String textoPagamento = "";

    // Métodos
    public static void cadastro() { // Implementa dados para o Pagamento
		String a, b, c, d;

		int op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n"
            + " CADASTRAR CARTÃO\n"
            + " ----------------------------------------\n"
            + " 1) Cartão de Crédito\n"
            + " 2) Cartão de Débito\n\n"
            + " Opção:"));

            if (op == 1) { setTipo("Crédito"); } 
            else { setTipo("Débito"); }
        
            a = JOptionPane.showInputDialog(" Nome do Titular: "); setNome(a);
            b = JOptionPane.showInputDialog(" Número do Cartão: "); setNumero(b);
            c = JOptionPane.showInputDialog(" Data de Vencimento: "); setDataVenc(c);
            d = JOptionPane.showInputDialog(" Código de Segurança: "); setCodSeg(d);
            status = true;
            JOptionPane.showMessageDialog(null,"\n CARTÃO CADASTRADO COM SUCESSO!!    ");

		FinalizarPedido.Menu(); // RETORNA FINALIZAR PEDIDO
	}

    public static void remover() {
        setStatus(false);
        FinalizarPedido.Menu();
    }

    public static String print() {
        textoPagamento = "";
        if (status == null || status == false) {
            textoPagamento = " Nenhuma forma de pagamento cadastrada!\n";
        } else {
            textoPagamento = " Forma de pagamento: "+getTipo()
                + "\n Nome do titular: "+getNome()
                + "\n Número: "+getNumero()
                + "\n Data de Vencimento: "+getDataVenc()
                + "\n Código de Segurança: "+getCodSeg()
                + "\n";
        }
        return textoPagamento;
    }

    // Getters and Setters
    public static String getTipo() {
        return tipo;
    }
    public static void setTipo(String tipo) {
        CartaoClass.tipo = tipo;
    }
    public static String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
        CartaoClass.nome = nome;
    }
    public static String getNumero() {
        return numero;
    }
    public static void setNumero(String numero) {
        CartaoClass.numero = numero;
    }
    public static String getDataVenc() {
        return dataVenc;
    }
    public static void setDataVenc(String dataVenc) {
        CartaoClass.dataVenc = dataVenc;
    }
    public static String getCodSeg() {
        return codSeg;
    }
    public static void setCodSeg(String codSeg) {
        CartaoClass.codSeg = codSeg;
    }
    public static Boolean getStatus() {
        return status;
    }
    public static void setStatus(Boolean status) {
        CartaoClass.status = status;
    }
}
