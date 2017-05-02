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
    
    public static int retiraNumerosTxt(String linha){
        int val = 0;
    	for(int i = 0; i < linha.length(); i++) { 
            String teste = Character.toString(linha.charAt(i));
            if(teste.matches(numero)){
            	val = Integer.parseInt(teste);
            }
       }
        return val;
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
