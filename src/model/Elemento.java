package model;

public class Elemento {
	private String nome;
	private int valor;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Elemento(){
    
    }
    
    public Elemento(String nome, int val){
        this.nome = nome;
        this.valor = val;
    
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
