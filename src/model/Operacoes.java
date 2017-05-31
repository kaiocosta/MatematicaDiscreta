/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Damasceno
 */
public class Operacoes {
    
    public static boolean pertence(int valor,Conjunto conjunto){
        for(Elemento elementos : conjunto.getConjunto()){
            if(valor == elementos.getValor()){
                return true;
            }   
        }
        return false;
    }
    
    public static boolean contido(Conjunto conjunto1, Conjunto conjunto2){
        int contador1 = 0;
        int contador2 = 0;
        for(Elemento elemento1 : conjunto1.getConjunto()){
            if(pertence(elemento1.getValor(), conjunto2)){
                contador1++;
            }
        }
        for(Elemento elemento2 : conjunto2.getConjunto()){
            if(pertence(elemento2.getValor(), conjunto1)){
                contador2++;
            }
        }
        if(contador1 == conjunto1.getConjunto().size() && contador2 == conjunto2.getConjunto().size() ){
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean contidoPropriamente(Conjunto conjunto1, Conjunto conjunto2){
        int contador = 0;
        for(Elemento elemento1 : conjunto1.getConjunto()){
            if(pertence(elemento1.getValor(), conjunto2)){
                contador++;
            }
        }
        if(contador == conjunto1.getConjunto().size()){
            return true;
        }else{
            return false;
        }
    }
    
    public static Conjunto intersecao(Conjunto conjunto1, Conjunto conjunto2){
        Conjunto intersecao = new Conjunto();
        intersecao.setNome(conjunto1.getNome() + " ∩ " + conjunto2.getNome());
        for(Elemento valores1 : conjunto1.getConjunto()){
            for(Elemento valores2 : conjunto2.getConjunto()){
                if(valores1.getValor() == valores2.getValor()){
                    intersecao.adicionarElemento(valores1);
                }

            }   
        }
        return intersecao;
    }
    
    public static Conjunto uniao(Conjunto conjunto1, Conjunto conjunto2){
        Conjunto uniao = new Conjunto();
        uniao.setNome(conjunto1.getNome() + " ∪ " + conjunto2.getNome());
        for(Elemento elemento1 : conjunto1.getConjunto()){
            uniao.adicionarElemento(elemento1);
        }
        for(Elemento elemento2 : conjunto2.getConjunto()){
            if(uniao.getConjunto().indexOf(elemento2) == -1){
                uniao.adicionarElemento(elemento2);
            }
        }
        return uniao;
    }
    
    public static ArrayList<String> produtoCartesiano(Conjunto conjunto1, Conjunto conjunto2){
        ArrayList<String> produtoCartesiano = new ArrayList<String>();
        for(Elemento elemento1 : conjunto1.getConjunto()){
            for(Elemento elemento2 : conjunto2.getConjunto()){
                StringBuilder sb = new StringBuilder();
                sb.append("{");
                sb.append(Integer.toString(elemento1.getValor()));
                sb.append(",");
                sb.append(Integer.toString(elemento2.getValor()));
                sb.append("}");
                produtoCartesiano.add(sb.toString());
                sb.reverse();
            }  
        }
        return produtoCartesiano;
        }
    
    public static String imprimiConjunto(Conjunto conjunto){
        String conj = "";
        conj += "{ ";
            for(Elemento ele : conjunto.getConjunto()){
                conj += ele.getValor();
                if(conjunto.getConjunto().indexOf(ele) != conjunto.getConjunto().size()-1){
                 conj += ",";
                }     
            }
        conj += " }";
        return conj;
    }
    
       
    
    //Operacoes de Relacao
    
     public static Relacao maiorQue(Conjunto conjunto1, Conjunto conjunto2){
        Relacao relacao = new Relacao(conjunto1, conjunto2);
        for(Elemento element1 : conjunto1.getConjunto() ){
            for(Elemento element2 : conjunto2.getConjunto() ){
                if(element1.getValor() > element2.getValor()){
                    relacao.dominio.adicionarElemento(element1);
                    relacao.imagem.adicionarElemento(element2);
                } 
            }
        
        }
        
        return relacao;
    }
    
    public static Relacao menorQue(Conjunto conjunto1, Conjunto conjunto2){
        Relacao relacao = new Relacao(conjunto1, conjunto2);
        for(Elemento element1 : conjunto1.getConjunto() ){
            for(Elemento element2 : conjunto2.getConjunto() ){
                if(element1.getValor() < element2.getValor()){
                    relacao.dominio.adicionarElemento(element1);
                    relacao.imagem.adicionarElemento(element2);
                } 
            }
        
        }
        
        return relacao;
    }
    
    public static Relacao igualA(Conjunto conjunto1, Conjunto conjunto2){
        Relacao relacao = new Relacao(conjunto1, conjunto2);
        for(Elemento element1 : conjunto1.getConjunto() ){
            for(Elemento element2 : conjunto2.getConjunto() ){
                if(element1.getValor() < element2.getValor()){
                    relacao.dominio.adicionarElemento(element1);
                    relacao.imagem.adicionarElemento(element2);
                } 
            }
        
        }
        
        return relacao;
    }
    
    public static Relacao serQuadradoDe(Conjunto conjunto1, Conjunto conjunto2){
        Relacao relacao = new Relacao(conjunto1, conjunto2);
        for(Elemento element1 : conjunto1.getConjunto() ){
            for(Elemento element2 : conjunto2.getConjunto() ){
                if(element2.getValor() == (element1.getValor() * element1.getValor()) ){
                    relacao.dominio.adicionarElemento(element1);
                    relacao.imagem.adicionarElemento(element2);
                } 
            }
        
        }
        
        return relacao;
    }
    
    public static Relacao serRaizQuadrada(Conjunto conjunto1, Conjunto conjunto2){
        Relacao relacao = new Relacao(conjunto1, conjunto2);
        for(Elemento element1 : conjunto1.getConjunto() ){
            for(Elemento element2 : conjunto2.getConjunto() ){
                if(element1.getValor() == (element2.getValor() * element2.getValor()) ){
                    relacao.dominio.adicionarElemento(element1);
                    relacao.imagem.adicionarElemento(element2);
                } 
            }
        }    
        return relacao;
    }
    
}
    
    
    
    
   
