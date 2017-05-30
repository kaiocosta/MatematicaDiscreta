package model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;


public class Trabalho2 {
    
    ArrayList<Conjunto> conjuntos = new ArrayList();
    ArrayList<Elemento> elementos = new ArrayList();
    int matriz[][];

    public List menorQue(){

        List<Integer> menorQue=new ArrayList();
        List<Integer> conj1=new ArrayList();
        List<Integer> conj2=new ArrayList();
        int linha = conjuntos.get(0).getConjunto().size();;
        int coluna = conjuntos.get(1).getConjunto().size();
        matriz=new int[linha][coluna];

        for(int i=0;i<conjuntos.get(0).getConjunto().size();i++){
            int eleConj1 = conjuntos.get(0).getConjunto().get(i).getValor();
            conj1.add(eleConj1);
        }

        for(int j=0;j<conjuntos.get(1).getConjunto().size();j++){
            int eleConj2 = conjuntos.get(1).getConjunto().get(j).getValor();
            conj2.add(eleConj2);
        }

        for(int i=0;i<conj1.size();i++){
            for(int j=0;j<conj2.size();j++){
                if(conj1.get(i)<conj2.get(j)){
                    menorQue.add(conj1.get(i));
                    menorQue.add(conj2.get(j));
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        return menorQue;
    }

    public List maiorQue(){

        List<Integer> maiorQue=new ArrayList();
        List<Integer> conj1=new ArrayList();
        List<Integer> conj2=new ArrayList();
        int linha=conjuntos.get(0).getConjunto().size();
        int coluna=conjuntos.get(1).getConjunto().size();
        matriz=new int[linha][coluna];

        for(int i=0;i<conjuntos.get(0).getConjunto().size();i++){

            int eleConj1 = conjuntos.get(0).getConjunto().get(i).getValor();
            conj1.add(eleConj1);
        }

        for(int j=0;j<conjuntos.get(1).getConjunto().size();j++){

            int eleConj2 = conjuntos.get(1).getConjunto().get(j).getValor();
            conj2.add(eleConj2);
        }

        for(int i=0;i<conj1.size();i++){
            for(int j=0;j<conj2.size();j++){
                if(conj1.get(i)>conj2.get(j)){
                    maiorQue.add(conj1.get(i));
                    maiorQue.add(conj2.get(j));
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        return maiorQue;
    }

    public List igualA(){

        List<Integer> igualA=new ArrayList();
        List<Integer> conj1=new ArrayList();
        List<Integer> conj2=new ArrayList();
        int linha=conjuntos.get(0).getConjunto().size();
        int coluna=conjuntos.get(1).getConjunto().size();
        matriz=new int[linha][coluna];

            for(int i=0;i<conjuntos.get(0).getConjunto().size();i++){

                int eleConj1 = conjuntos.get(0).getConjunto().get(i).getValor();
                conj1.add(eleConj1);
            }

            for(int j=0;j<conjuntos.get(1).getConjunto().size();j++){

                int eleConj2 = conjuntos.get(1).getConjunto().get(j).getValor();
                conj2.add(eleConj2);
            }

        for(int i=0;i<conj1.size();i++){
            for(int j=0;j<conj2.size();j++){
                if(conj1.get(i)==conj2.get(j)){
                    igualA.add(conj1.get(i));
                    igualA.add(conj2.get(j));
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        return igualA;
    }

    public List serQuadrado(){
        List<Integer> quadrado=new ArrayList();
        List<Integer> conj1=new ArrayList();
        List<Integer> conj2=new ArrayList();
        int linha=conjuntos.get(0).getConjunto().size();
        int coluna=conjuntos.get(1).getConjunto().size();
        matriz=new int[linha][coluna];

        for(int i=0;i<conjuntos.get(0).getConjunto().size();i++){

            int eleConj1 = conjuntos.get(0).getConjunto().get(i).getValor();
            conj1.add(eleConj1);
        }

        for(int j=0;j<conjuntos.get(1).getConjunto().size();j++){

            int eleConj2 = conjuntos.get(1).getConjunto().get(j).getValor();
            conj2.add(eleConj2);
        }

        for(int i=0;i<conj1.size();i++){
            for(int j=0;j<conj2.size();j++){
                if(conj1.get(i)==conj2.get(j)*conj2.get(j)){
                    quadrado.add(conj1.get(i));
                    quadrado.add(conj2.get(j));
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        return quadrado;
    }

    public List serRaizQuadrada(){

        List<Double> raiz=new ArrayList();
        List<Double> conj1=new ArrayList();
        List<Double> conj2=new ArrayList();
        int linha=conjuntos.get(0).getConjunto().size();
        int coluna=conjuntos.get(1).getConjunto().size();
        matriz=new int[linha][coluna];

        for(int i=0;i<conjuntos.get(0).getConjunto().size();i++){
            double eleConj1 = conjuntos.get(0).getConjunto().get(i).getValor();
            conj1.add(eleConj1);
        }

        for(int j=0;j<conjuntos.get(1).getConjunto().size();j++){
            double eleConj2 = conjuntos.get(1).getConjunto().get(j).getValor();
            conj2.add(eleConj2);
        }

        for(int i=0;i<conj1.size();i++){
            for(int j=0;j<conj2.size();j++){
                int valor=(int)Math.sqrt(conj2.get(j));

                    if(conj1.get(i)==valor){
                        raiz.add(conj1.get(i));
                        raiz.add(conj2.get(j));
                        matriz[i][j]=1;
                    }else{
                        matriz[i][j]=0;
                    }
                }
            }
            return raiz;
        }

    public List dominio(List lista) {
        List<Integer> dominio = new ArrayList();

            for (int i = 0; i < lista.size(); i = i + 2) {
                dominio.add((Integer) lista.get(i));
            }

            List novaLista = new ArrayList(new HashSet(dominio));
                return novaLista;
    }

    public List imagem(List lista) {
            List<Integer> imagem = new ArrayList();

            for (int i = 1; i < lista.size(); i = i + 2) {
                imagem.add((Integer) lista.get(i));
            }

            List novaLista = new ArrayList(new HashSet(imagem));
                return novaLista;
    }

    public boolean funcional() {
        int valor = 0;
        for (int i = 0; i < conjuntos.get(0).getConjunto().size(); i++) {
            for (int j = 0; j < conjuntos.get(1).getConjunto().size(); j++) {
                if (matriz[i][j] == 1) {
                    valor++;
                }
                if (valor > 1) {
                    return false;
                }
            }
            valor = 0;
        }
        return true;
    }

    public boolean total() {
        int valor = 0;
        for (int i = 0; i < conjuntos.get(0).getConjunto().size(); i++) {
            for (int j = 0; j < conjuntos.get(1).getConjunto().size(); j++) {
                if (matriz[i][j] == 1) {
                    valor++;
                }
            }
            if (valor == 0) {
                return false;
            }
            valor = 0;
        }
        return true;
    }

    public boolean injetora() {
        int valor = 0;
        for (int i = 0; i < conjuntos.get(1).getConjunto().size(); i++) {
            for (int j = 0; j < conjuntos.get(0).getConjunto().size(); j++) {
                if (matriz[j][i] == 1) {
                    valor++;
                }
                if (valor > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sobrejetora() {
        int valor = 0;
        for (int i = 0; i < conjuntos.get(1).getConjunto().size(); i++) {
            for (int j = 0; j < conjuntos.get(0).getConjunto().size(); j++) {
                if (matriz[j][i] == 1) {
                    valor++;
                }
            }
            if (valor == 0) {
                return false;
            }
            valor = 0;
        }
        return true;
    }

}