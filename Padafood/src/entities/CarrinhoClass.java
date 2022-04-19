package entities;

import java.util.*;

public class CarrinhoClass {
    
    // Atributos
    private ArrayList <ProdutoClass> lista = new ArrayList <>();

    // Constructor
    public CarrinhoClass() { }

    // Getters and Setters
    public ArrayList<ProdutoClass> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ProdutoClass> lista) {
        this.lista = lista;
    }
}
