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

/**
 *
 * @author Damasceno
 */
public class TrabalhoMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        String conjunto = "([A-Z][\" \"]*[\"=\"][\" \"]*[\"{\"][0-9,]*[\"}\"])";
        String elemento = "([a-z][\" \"]*[\"=\"][\" \"]*[0-9]*)";
        String numero = "[0-9]*";
        Pattern conjuntoPattern = Pattern.compile(conjunto);
        ArrayList<ArrayList<Integer>> conjuntos = new ArrayList<ArrayList<Integer>>();
        
        Scanner s = new Scanner(new File("teste.txt"));
        while(s.hasNextLine()){
            String sas = s.nextLine();
            if(sas.matches(conjunto)){
               for(int i = 0; i < sas.length(); i++) { 
                    
                   
               }
               
             
              System.out.println("sim" );  
            }else{
              System.out.println("nao"); 
            }
              
        }
        
        
    }
    
}
