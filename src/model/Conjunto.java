package model;

import java.util.ArrayList;
import java.util.List;

import model.Elemento;

public class Conjunto {
	private String nome;
	private List<Elemento> conjunto = new ArrayList<Elemento>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConjunto(List<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

    public List<Elemento> getConjunto() {
        return conjunto;
    }
    
    public void adicionarElemento(Elemento valor){
        this.conjunto.add(valor); 
    }
}
