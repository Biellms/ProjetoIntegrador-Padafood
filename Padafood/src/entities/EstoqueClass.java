package entities;

import java.util.*;

// Classe para criar ArrayList dos produtos
public class EstoqueClass {
    
    // Atributos
    private ArrayList <ProdutoClass> lista = new ArrayList <>();

    // Constructor
    public EstoqueClass() { }

    // Getters and Setters
    public ArrayList<ProdutoClass> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ProdutoClass> lista) {
        this.lista = lista;
    }

}
