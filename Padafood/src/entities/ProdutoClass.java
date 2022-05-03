package entities;

import java.text.NumberFormat;

public class ProdutoClass {
    
    // Atributos
	private String nome;
	private double preco;

	// construtores
	public ProdutoClass(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
	
    // Métodos
	public String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}

	// Getters & Setters
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
