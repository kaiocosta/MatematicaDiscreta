/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Conjunto;
import model.Elemento;
import model.Operacoes;
import model.Relacao;
import trabalhomatematica.TrabalhoMatematica;
import static trabalhomatematica.TrabalhoMatematica.conjunto;
import static trabalhomatematica.TrabalhoMatematica.elemento;
import static trabalhomatematica.TrabalhoMatematica.retiraNomeTxt;
import static trabalhomatematica.TrabalhoMatematica.retiraNumeroTxt;
import static trabalhomatematica.TrabalhoMatematica.retiraNumerosTxt;

/**
 *
 * @author Math
 */
public class main extends javax.swing.JFrame {

    ArrayList<Conjunto> conjuntos = new ArrayList<Conjunto>();
    ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        abrirArquivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pertence = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        contido = new javax.swing.JButton();
        contidoPropriamente = new javax.swing.JButton();
        uniao = new javax.swing.JButton();
        intersecao = new javax.swing.JButton();
        produtoCartesiano = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        maiorQue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        menorQue = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        quadrado = new javax.swing.JButton();
        raizQuadrada = new javax.swing.JButton();
        compMaiorQue = new javax.swing.JButton();
        CompMenorQue = new javax.swing.JToggleButton();
        CompIgual = new javax.swing.JToggleButton();
        CompQuadrado = new javax.swing.JToggleButton();
        CompRaizQuadrada = new javax.swing.JToggleButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Relações");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Trabalho de Matemática Discreta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        abrirArquivo.setText("Abrir Arquivo");
        abrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(abrirArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 53, 190, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 86, 380, 170));

        pertence.setText("Pertence");
        pertence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pertenceActionPerformed(evt);
            }
        });
        getContentPane().add(pertence, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Operações");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 390, 30));

        contido.setText("Contido ou igual");
        contido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contidoActionPerformed(evt);
            }
        });
        getContentPane().add(contido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 130, -1));

        contidoPropriamente.setText("Contido propriamente");
        contidoPropriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contidoPropriamenteActionPerformed(evt);
            }
        });
        getContentPane().add(contidoPropriamente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 160, -1));

        uniao.setText("União");
        uniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniaoActionPerformed(evt);
            }
        });
        getContentPane().add(uniao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, -1));

        intersecao.setText("Interseção");
        intersecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intersecaoActionPerformed(evt);
            }
        });
        getContentPane().add(intersecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, -1));

        produtoCartesiano.setText("Produto Cartesiano");
        produtoCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoCartesianoActionPerformed(evt);
            }
        });
        getContentPane().add(produtoCartesiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Composição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        maiorQue.setText("Maior Que");
        maiorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maiorQueActionPerformed(evt);
            }
        });
        getContentPane().add(maiorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Relações");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        menorQue.setText("Menor Que");
        menorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorQueActionPerformed(evt);
            }
        });
        getContentPane().add(menorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        Igual.setText("Igual");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        getContentPane().add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        quadrado.setText("Ser Quadrado");
        quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quadradoActionPerformed(evt);
            }
        });
        getContentPane().add(quadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 100, -1));

        raizQuadrada.setText("Raiz Quadrada");
        raizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizQuadradaActionPerformed(evt);
            }
        });
        getContentPane().add(raizQuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        compMaiorQue.setText("Maior Que");
        compMaiorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compMaiorQueActionPerformed(evt);
            }
        });
        getContentPane().add(compMaiorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 90, -1));

        CompMenorQue.setText("Menor Que");
        CompMenorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompMenorQueActionPerformed(evt);
            }
        });
        getContentPane().add(CompMenorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, -1));

        CompIgual.setText("Igual");
        getContentPane().add(CompIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, -1, -1));

        CompQuadrado.setText("Ser Quadrado");
        CompQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompQuadradoActionPerformed(evt);
            }
        });
        getContentPane().add(CompQuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, -1, -1));

        CompRaizQuadrada.setText("Raiz Quadrada");
        CompRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompRaizQuadradaActionPerformed(evt);
            }
        });
        getContentPane().add(CompRaizQuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void imprimeClassificacaoRelacao(Relacao relacao){
        if(relacao.funcional()){
            jTextArea1.replaceSelection("\n A relacao e funcional." );
        }
        if(relacao.injetora()){
            jTextArea1.replaceSelection("\n A relacao e injetora." );
        }
        if(relacao.sobrejetora()){
            jTextArea1.replaceSelection("\n A relacao e sobrejetora." );
        }
        if(relacao.total()){
            jTextArea1.replaceSelection("\n A relacao e total." );
        }
        if(relacao.monomorfismo()){
            jTextArea1.replaceSelection("\n\n Logo, a relacao e um monomorfismo." );
        }
        if(relacao.epimorfismo()){
            jTextArea1.replaceSelection("\n\n Logo, a relacao e um epimorfismo." );
        }
        if(relacao.isomorfismo()){
            jTextArea1.replaceSelection("\n\n Logo, a relacao e um isomorfismo." );
        }
        
        if(!relacao.funcional() && !relacao.injetora() && !relacao.sobrejetora() && !relacao.total()){
            jTextArea1.replaceSelection("\n A relacao nao e funcional, nem injetora, nem sobrejetora, nem total, ");
            jTextArea1.replaceSelection("\n nem monomorfismo, nem epimorfismo e nem isomorfismo.");        
        }
        
    }
    
    private void abrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArquivoActionPerformed
 
        Scanner s = null;
        try {
            
             File fileLer = null;
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Arquivos TXT", "txt");
        arquivo.addChoosableFileFilter(filtroTxt);
        arquivo.setAcceptAllFileFilterUsed(false);
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileLer = new File(arquivo.getSelectedFile().getAbsolutePath());
        }
          s = new Scanner(fileLer);
          jTextArea1.setText("");
//            s = new Scanner(new File("teste.txt"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Abrir arquivo");
        }
        while(s.hasNextLine()){
            String sas = s.nextLine();
            if(sas.matches(conjunto)){
                conjuntos.add(new Conjunto(retiraNomeTxt(sas),retiraNumerosTxt(sas))); 
                jTextArea1.replaceSelection(sas + "\n");    
            }else if(sas.matches(elemento)){
                elementos.add(new Elemento(retiraNomeTxt(sas),retiraNumeroTxt(sas).getValor()));
                jTextArea1.replaceSelection(sas + "\n"); 
            }            
        }   
    }//GEN-LAST:event_abrirArquivoActionPerformed

    private void pertenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pertenceActionPerformed
        if(elementos.size() < 1 && conjuntos.size() < 1){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            for(int i = 0 ; i < elementos.size(); i++){
                if(Operacoes.pertence(elementos.get(i).getValor(), conjuntos.get(0)) == true){
                  jTextArea1.replaceSelection("O elemento "+elementos.get(i).getNome()+" pertence ao conjunto "+ conjuntos.get(0).getNome()+ "\n");
                }else{
                  jTextArea1.replaceSelection("O elemento "+elementos.get(i).getNome()+" nao pertence ao conjunto "+ conjuntos.get(0).getNome()+ "\n");
                }
            }           
        }
    }//GEN-LAST:event_pertenceActionPerformed

    private void produtoCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoCartesianoActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            jTextArea1.replaceSelection("O produto Cartesiano dos conjuntos "+ conjuntos.get(0).getNome()+ " e "+ conjuntos.get(1).getNome()+" "+ Operacoes.produtoCartesiano(conjuntos.get(0), conjuntos.get(1)));
            //Operacoes.produtoCartesiano(conjuntos.get(0), conjuntos.get(1));
            //jTextArea1.replaceSelection("O elemento"+elementos.get(0).getNome()+"pertence ao conjunto "+ conjuntos.get(0).getNome()+ "\n");
         
        }
    }//GEN-LAST:event_produtoCartesianoActionPerformed

    private void uniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniaoActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            for(int i = 0; i < conjuntos.size(); i++){
              for(int j = 0; j < conjuntos.size(); j++){
                  jTextArea1.replaceSelection(Operacoes.uniao(conjuntos.get(i), conjuntos.get(j)).getNome()+" : "+ Operacoes.imprimiConjunto(Operacoes.uniao(conjuntos.get(i), conjuntos.get(j))) + "\n");
              }
            }
         
        }
    }//GEN-LAST:event_uniaoActionPerformed

    private void contidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contidoActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            if(Operacoes.contido(conjuntos.get(0), conjuntos.get(1))){
                jTextArea1.replaceSelection("O conjunto "+ conjuntos.get(0).getNome()+" esta contido no conjunto "+ conjuntos.get(1).getNome()+ "\n");
            }else{
                jTextArea1.replaceSelection("O conjunto "+ conjuntos.get(0).getNome()+" nao esta contido no conjunto "+ conjuntos.get(1).getNome()+ "\n");
            } 
        }
    }//GEN-LAST:event_contidoActionPerformed

    private void contidoPropriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contidoPropriamenteActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            if(Operacoes.contidoPropriamente(conjuntos.get(0), conjuntos.get(1))){
                jTextArea1.replaceSelection("O conjunto "+ conjuntos.get(0).getNome()+" esta contido propriamente no conjunto "+ conjuntos.get(1).getNome()+ "\n");
            }else{
                jTextArea1.replaceSelection("O conjunto "+ conjuntos.get(0).getNome()+" nao esta contido propriamente no conjunto "+ conjuntos.get(1).getNome()+ "\n");
            } 
        }
    }//GEN-LAST:event_contidoPropriamenteActionPerformed

    private void intersecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intersecaoActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            for(int i = 0; i < conjuntos.size(); i++){
              for(int j = 0; j < conjuntos.size(); j++){
                  jTextArea1.replaceSelection(Operacoes.intersecao(conjuntos.get(i), conjuntos.get(j)).getNome()+" : "+ Operacoes.imprimiConjunto(Operacoes.intersecao(conjuntos.get(i), conjuntos.get(j))) + "\n");
              }
            }
         
        }
        
    }//GEN-LAST:event_intersecaoActionPerformed

    private void maiorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maiorQueActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
            
        }else{
            Relacao relacao = Operacoes.maiorQue(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao));
            imprimeClassificacaoRelacao(relacao);
        }
        
        
    }//GEN-LAST:event_maiorQueActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
            
        }else{
            Relacao relacao = Operacoes.igualA(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao));
            imprimeClassificacaoRelacao(relacao);
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void menorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorQueActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
            
        }else{
            Relacao relacao = Operacoes.menorQue(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao));
            imprimeClassificacaoRelacao(relacao);
        }
    }//GEN-LAST:event_menorQueActionPerformed

    private void quadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadradoActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao = Operacoes.serQuadradoDe(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao));
            imprimeClassificacaoRelacao(relacao);
        }
        
    }//GEN-LAST:event_quadradoActionPerformed

    private void raizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizQuadradaActionPerformed
        if(conjuntos.size() < 2){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao = Operacoes.serRaizQuadrada(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao));
            imprimeClassificacaoRelacao(relacao);
        }
        
        
    }//GEN-LAST:event_raizQuadradaActionPerformed

    private void compMaiorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compMaiorQueActionPerformed
        if(conjuntos.size() < 3){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao1 = Operacoes.maiorQue(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao1));
            Relacao relacao2 = Operacoes.maiorQue(conjuntos.get(1), conjuntos.get(2));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao2));
            Relacao composicao = Operacoes.gerarComposta(relacao1, relacao2);
            jTextArea1.replaceSelection("\n Composta: " + Operacoes.imprimiRelacao(composicao));
            imprimeClassificacaoRelacao(composicao);
        }
    }//GEN-LAST:event_compMaiorQueActionPerformed

    private void CompQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompQuadradoActionPerformed
        if(conjuntos.size() < 3){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao1 = Operacoes.serQuadradoDe(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao1));
            Relacao relacao2 = Operacoes.serQuadradoDe(conjuntos.get(1), conjuntos.get(2));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao2));
            Relacao composicao = Operacoes.gerarComposta(relacao1, relacao2);
            jTextArea1.replaceSelection("\n Composta: " + Operacoes.imprimiRelacao(composicao));
        }
    }//GEN-LAST:event_CompQuadradoActionPerformed

    private void CompRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompRaizQuadradaActionPerformed
        if(conjuntos.size() < 3){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao1 = Operacoes.serRaizQuadrada(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao1));
            Relacao relacao2 = Operacoes.serRaizQuadrada(conjuntos.get(1), conjuntos.get(2));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao2));
            Relacao composicao = Operacoes.gerarComposta(relacao1, relacao2);
            jTextArea1.replaceSelection("\n Composta: " + Operacoes.imprimiRelacao(composicao));
        }
    }//GEN-LAST:event_CompRaizQuadradaActionPerformed

    private void CompMenorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompMenorQueActionPerformed
        if(conjuntos.size() < 3){
            JOptionPane.showMessageDialog(null, "Não existe operandos suficientes");
        }else{
            Relacao relacao1 = Operacoes.menorQue(conjuntos.get(0), conjuntos.get(1));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao1));
            Relacao relacao2 = Operacoes.menorQue(conjuntos.get(1), conjuntos.get(2));
            jTextArea1.replaceSelection("\n Relacao: " + Operacoes.imprimiRelacao(relacao2));
            Relacao composicao = Operacoes.gerarComposta(relacao1, relacao2);
            jTextArea1.replaceSelection("\n Composta: " + Operacoes.imprimiRelacao(composicao));
        }
    }//GEN-LAST:event_CompMenorQueActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CompIgual;
    private javax.swing.JToggleButton CompMenorQue;
    private javax.swing.JToggleButton CompQuadrado;
    private javax.swing.JToggleButton CompRaizQuadrada;
    private javax.swing.JButton Igual;
    private javax.swing.JButton abrirArquivo;
    private javax.swing.JButton compMaiorQue;
    private javax.swing.JButton contido;
    private javax.swing.JButton contidoPropriamente;
    private javax.swing.JButton intersecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton maiorQue;
    private javax.swing.JButton menorQue;
    private javax.swing.JButton pertence;
    private javax.swing.JButton produtoCartesiano;
    private javax.swing.JButton quadrado;
    private javax.swing.JButton raizQuadrada;
    private javax.swing.JButton uniao;
    // End of variables declaration//GEN-END:variables
}
