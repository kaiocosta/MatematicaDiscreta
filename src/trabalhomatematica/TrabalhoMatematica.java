/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomatematica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JTextArea;
import model.Elemento;

/**
 *
 * @author Damaceno
 */
public class TrabalhoMatematica {

	public static String conjunto = "([A-Z][\" \"]*[\"=\"][\" \"]*[\"{\"][0-9,]*[\"}\"])";
	public static String elemento = "([a-z][\" \"]*[\"=\"][\" \"]*[0-9]*)";
        public static String numero = "[0-9]*";
        public static String nomeConjunto = "[A-Z]";
        public static String nomeElemento = "[a-z]";

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Pattern conjuntoPattern = Pattern.compile(conjunto);
        ArrayList<ArrayList<Integer>> conjuntos = new ArrayList<ArrayList<Integer>>();
        
        Scanner s = new Scanner(new File("teste.txt"));
        while(s.hasNextLine()){
            String sas = s.nextLine();
            if(sas.matches(conjunto)){
            	retiraNumerosTxt(sas);
                retiraNomeTxt(sas);
                System.out.println(sas);

            }else{
              System.out.println("nao"); 
            }
              
        }   
    }
    
    public static ArrayList<Elemento> retiraNumerosTxt(String linha){
        ArrayList<Elemento> conjunto = new ArrayList<Elemento>();
        StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < linha.length(); i++) { 
            String teste = Character.toString(linha.charAt(i));
            if(teste.matches(numero)){
                sb.append(teste);   
            }else if(sb.length() > 0){
                Elemento valor = new Elemento();
                valor.setNome(" ");
                valor.setValor(Integer.parseInt(sb.toString()));
            	conjunto.add(valor);
                sb.setLength(0);
            }
       }
       return conjunto;
    }
    
    public static Elemento retiraNumeroTxt(String linha){
        Elemento valor = new Elemento();
        StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < linha.length(); i++) { 
            String teste = Character.toString(linha.charAt(i));
            if(teste.matches(numero)){
                sb.append(teste);
            }
       }
        valor.setNome(" ");
        valor.setValor(Integer.parseInt(sb.toString()));
        sb.setLength(0);
       return valor;
    }
    
    public static String retiraNomeTxt(String linha){
        String nome = "";
        for(int i = 0; i < linha.length(); i++) { 
            String teste = Character.toString(linha.charAt(i));
            if(teste.matches(nomeConjunto) || teste.matches(nomeElemento)){
            	nome = teste;
            }
       }
        return nome;
        
    }
    
}
