package entities;

import java.util.*;

import principal.Game;

public class CarrinhoClass {
    
    // Atributos
    private ArrayList <Game> lista = new ArrayList <>();
	
    // Constructor
	public CarrinhoClass() { }

    // Getters And Setters
	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
