/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damasceno
 */
public class Relacao {
    
    public Conjunto conjunto1 = new Conjunto();
    public Conjunto conjunto2 = new Conjunto();
    
    public Conjunto dominio = new Conjunto();
    public Conjunto imagem = new Conjunto();
    public List<String> produto = new ArrayList<String>();

    public Relacao() {
    }
    
    public Relacao(Conjunto conj1, Conjunto conj2) {
        this.conjunto1 = conj1;
        this.conjunto2 = conj2;
    }

    public Conjunto getDominio() {
        return dominio;
    }

    public Conjunto getImagem() {
        return imagem;
    }

    public List<String> getProduto() {
        return produto;
    }

    public void setDominio(Conjunto dominio) {
        this.dominio = dominio;
    }

    public void setImagem(Conjunto imagem) {
        this.imagem = imagem;
    }

    public void setProduto(List<String> produto) {
        this.produto = produto;
    }
    
    public void setConjunto1(Conjunto conjunto1) {
        this.conjunto1 = conjunto1;
    }

    public void setConjunto2(Conjunto conjunto2) {
        this.conjunto2 = conjunto2;
    }

    public Conjunto getConjunto1() {
        return conjunto1;
    }

    public Conjunto getConjunto2() {
        return conjunto2;
    }
    
    public boolean funcional(){
        int contador = 0;
        for(Elemento item1 : this.dominio.getConjunto()){
            for(Elemento item2 : this.dominio.getConjunto()){
                if(item1.getValor() == item2.getValor()){
                    contador++;
                }
            }         
            if(contador > 1)
                return false;
            
            contador = 0;
        }  
            return true;
    }
    
    public boolean injetora(){
        int contador = 0;
        for(Elemento item1 : this.imagem.getConjunto()){
            for(Elemento item2 : this.imagem.getConjunto()){
                if(item1.getValor() == item2.getValor()){
                    contador++;
                }
            }
             if(contador > 1)
                return false;
             
             contador = 0;
        }      
            return true;
    }
    
    public boolean total(){
        int contador = 0;
        Conjunto dominioNaoRepetida = new Conjunto();
        for(Elemento item1 : this.dominio.getConjunto()){
            if(!Operacoes.pertence(item1.getValor(), dominioNaoRepetida)){
                dominioNaoRepetida.adicionarElemento(item1);
            }
        }
        
        for(Elemento item1 : dominioNaoRepetida.getConjunto()){
            for(Elemento item2 : this.conjunto1.getConjunto()){
                if(item1.getValor() == item2.getValor()){
                    contador++;
                }
            }
        }
        if(contador == this.conjunto1.getConjunto().size()){
            return true;
        }else{
            return false;
        }  
    }
    
    public boolean sobrejetora(){
        int contador = 0;
        Conjunto imagemNaoRepetida = new Conjunto();
        for(Elemento item1 : this.imagem.getConjunto()){
            if(!Operacoes.pertence(item1.getValor(), imagemNaoRepetida)){
                imagemNaoRepetida.adicionarElemento(item1);
            }
        }       
        for(Elemento item1 : imagemNaoRepetida.getConjunto()){
            for(Elemento item2 : this.conjunto2.getConjunto()){
                if(item1.getValor() == item2.getValor()){
                    contador++;
                }
            }
        }
        if(contador == this.conjunto2.getConjunto().size()){
            return true;
        }else{
            return false;
        }  
    }
    
    public boolean monomorfismo(){
        if(total() && injetora()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean epimorfismo(){
        if(funcional() && sobrejetora()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isomorfismo(){
        if(epimorfismo()&& monomorfismo()){
            return true;
        }else{
            return false;
        }
    }
}
