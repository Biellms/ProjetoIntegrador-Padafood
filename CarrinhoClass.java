package entities;

import java.util.*;

import principal.Game;

public class CarrinhoClass {
    
    // Atributos
    private ArrayList <ProdutoClass> lista = new ArrayList <>();
	
    // Constructor
	public CarrinhoClass() { }

    // Getters And Setters
	public ArrayList<ProdutoClass> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ProdutoClass> lista) {
		this.lista = lista;
	}
}
