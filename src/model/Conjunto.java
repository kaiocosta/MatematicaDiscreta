package model;

import java.util.ArrayList;
import java.util.List;

import model.Elemento;

public class Conjunto {
	private String nome;
	private ArrayList<Elemento> conjunto = new ArrayList<Elemento>();
        
    public String getNome() {
        return nome;
    }

    public Conjunto(String nome) {
        this.nome = nome;
    }
    
    public Conjunto(String nome,ArrayList<Elemento> elementos) {
        this.nome = nome;
        this.conjunto = elementos;
    }
    
    public Conjunto(){
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConjunto(ArrayList<Elemento> conjunto) {
        this.conjunto = conjunto;
    }

    public ArrayList<Elemento> getConjunto() {
        return conjunto;
    }
    
    public void adicionarElemento(Elemento valor){
        this.conjunto.add(valor); 
    }
    
    
}
