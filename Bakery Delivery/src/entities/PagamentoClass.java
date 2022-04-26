package entities;

import javax.swing.*;

public class PagamentoClass {

    // Atributos
    private static String tipo;
    private static String nome;
	private static String numero;
	private static String dataVenc;
	private static String codSeg;
	private static Boolean status;

    private static String textoPagamento = "";

    // Construtor
    public PagamentoClass() {
        status = false;
    }

    // Métodos
    public static String print() {
        if (status == null || status == false) {
            textoPagamento = " Nenhuma forma de pagamento cadastrado!\n";
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
        PagamentoClass.tipo = tipo;
    }
    public static String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
        PagamentoClass.nome = nome;
    }
    public static String getNumero() {
        return numero;
    }
    public static void setNumero(String numero) {
        PagamentoClass.numero = numero;
    }
    public static String getDataVenc() {
        return dataVenc;
    }
    public static void setDataVenc(String dataVenc) {
        PagamentoClass.dataVenc = dataVenc;
    }
    public static String getCodSeg() {
        return codSeg;
    }
    public static void setCodSeg(String codSeg) {
        PagamentoClass.codSeg = codSeg;
    }
    public static Boolean getStatus() {
        return status;
    }
    public static void setStatus(Boolean status) {
        PagamentoClass.status = status;
    }
}
