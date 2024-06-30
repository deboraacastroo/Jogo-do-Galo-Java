
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rvcc
 */
public class JogoDoGalo extends javax.swing.JFrame {

     final int POSH=3, POSV=3, NUMIMAGENS=3;
    final char ZERO='0', XIS='X', NADA='\0';
    final int NJOGADAS=5;
    
    private ImageIcon[] imagens = new ImageIcon[NUMIMAGENS];
    String [] fichImagens={"vazio.png","zero.png","xis.png"};
    String caminho1_abs = "xxxx";
    String caminho2_rel= "images/";
    char[] letras={'\0','0','X'};
    boolean jogador1=true;
    boolean jogoAcabou=false;
    int nJogadas = 0;
    char [][] jogoC = new char[POSH][POSV];
    // mapa do jogo para processamento
    private ImageIcon[][] jogoI = new ImageIcon[POSH][POSV];
    // mapa do jogo para memória intermédia de imagens
    ArrayList<JLabel> jogoB = new ArrayList<JLabel>();
    // mapa do jogo para apresentação
    /**
     * Creates new form JogoDoGalo
     */
    public JogoDoGalo() {
        initComponents();
        jPanel1.setBorder(new EmptyBorder(0, 0, 0, 0)); // top, left, bottom, right
        
        lb01.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 2, Color.RED) // Inner border
        ));
        
          lb02.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 2, Color.RED) // Inner border
        ));
              lb03.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED) // Inner border
        ));
          lb04.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 2, Color.RED) // Inner border
        ));
                lb05.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 2, Color.RED) // Inner border
        ));
                            lb06.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED) // Inner border
        ));
           lb07.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 0, 2, Color.RED) // Inner border
        ));
               lb08.setBorder(new CompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 0), // Outer border
            BorderFactory.createMatteBorder(0, 0, 0, 2, Color.RED) // Inner border
        ));
        
        jogoB.add(lb01);
        jogoB.add(lb02);
        jogoB.add(lb03);
        jogoB.add(lb04);
        jogoB.add(lb05);
        jogoB.add(lb06);
        jogoB.add(lb07);
        jogoB.add(lb08);
        jogoB.add(lb09);
        
        imagens=carregaImagens(imagens,caminho2_rel,fichImagens);
        imagens=organizaImagens(imagens,letras);
        novoJogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb01 = new javax.swing.JLabel();
        lb02 = new javax.swing.JLabel();
        lb03 = new javax.swing.JLabel();
        lb04 = new javax.swing.JLabel();
        lb05 = new javax.swing.JLabel();
        lb06 = new javax.swing.JLabel();
        lb07 = new javax.swing.JLabel();
        lb08 = new javax.swing.JLabel();
        lb09 = new javax.swing.JLabel();
        lbMensagem = new javax.swing.JLabel();
        btNovoJogo = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        lb01.setBackground(new java.awt.Color(255, 255, 204));
        lb01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb01MouseClicked(evt);
            }
        });

        lb02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb02MouseClicked(evt);
            }
        });

        lb03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb03MouseClicked(evt);
            }
        });

        lb04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb04MouseClicked(evt);
            }
        });

        lb05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb05MouseClicked(evt);
            }
        });

        lb06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb06MouseClicked(evt);
            }
        });

        lb07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb07MouseClicked(evt);
            }
        });

        lb08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb08MouseClicked(evt);
            }
        });

        lb09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb09MouseClicked(evt);
            }
        });

        btNovoJogo.setText("Novo Jogo");
        btNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoJogoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb07, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb08, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb09, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNovoJogo)
                                .addGap(18, 18, 18)
                                .addComponent(btSair))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb04, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb01, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb05, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb06, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb02, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb03, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb02, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb03, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb01, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb04, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb05, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb06, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb07, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb08, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb09, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoJogo)
                    .addComponent(btSair))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoJogoActionPerformed
        
        novoJogo();
    }//GEN-LAST:event_btNovoJogoActionPerformed

    private void lb01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb01MouseClicked
       executaJogada(0);
    }//GEN-LAST:event_lb01MouseClicked

    private void lb03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb03MouseClicked
       executaJogada(2);
    }//GEN-LAST:event_lb03MouseClicked

    private void lb02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb02MouseClicked
        executaJogada(1);// TODO add your handling code here:
    }//GEN-LAST:event_lb02MouseClicked

    private void lb04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb04MouseClicked
        executaJogada(3);
    }//GEN-LAST:event_lb04MouseClicked

    private void lb05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb05MouseClicked
        executaJogada(4);
    }//GEN-LAST:event_lb05MouseClicked

    private void lb06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb06MouseClicked
        executaJogada(5);
    }//GEN-LAST:event_lb06MouseClicked

    private void lb07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb07MouseClicked
        executaJogada(6);
    }//GEN-LAST:event_lb07MouseClicked

    private void lb08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb08MouseClicked
        executaJogada(7);
    }//GEN-LAST:event_lb08MouseClicked

    private void lb09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb09MouseClicked
        executaJogada(8);
    }//GEN-LAST:event_lb09MouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    
    public ImageIcon[] carregaImagens(ImageIcon[] imagens, String caminho,
            String[] fichImagens){
        for(int nImagem=0;nImagem<imagens.length;nImagem++){
            
             try {
            imagens[nImagem]= new ImageIcon(getClass().getResource(caminho+fichImagens[nImagem]));

            // Display the image icon
            System.out.println("Image icon loaded successfully.");
        } catch (Exception e) {
            // Log the exception to the console
            System.out.println("Error loading image icon: " + e.getMessage());
            e.printStackTrace();
        }
            
            
            
        }
        return imagens;
    }
    
    public ImageIcon[] organizaImagens(ImageIcon[] imagens, char[] letras){
        ImageIcon[] imagensTemp= new ImageIcon[imagens.length];
        for(int nImagem=0; nImagem<imagens.length;nImagem++)
            imagensTemp[nImagem]=imagens[nImagem];
        for(int nletra=0;nletra<letras.length;nletra++){
            int nImagem=nletra;
            if(letras[nletra]==NADA)
                imagens[nImagem]=imagensTemp[0];
            else if(letras[nletra]==ZERO)
                imagens[nImagem]=imagensTemp[1];
            else if(letras[nletra]==XIS)
                imagens[nImagem]=imagensTemp[2];
        }
        
        return imagens;
    }
    
    public void novoJogo(){
        jogoC=inicializaMapadeJogoP(jogoC,POSH,POSV,NADA);
        jogoI=inicializaMapadeJogoA(jogoI,POSH,POSV,NADA);
        
        for(int nbotao=0;nbotao<jogoB.size();nbotao++)
            jogoB.get(nbotao).setEnabled(true);
        
        jogoB=apresentaMapa(jogoB, jogoI, POSH,POSV);
        jogador1=true;
        nJogadas=0;
        jogoAcabou=false;
        lbMensagem.setText("Jogador1");
    }
    
    public char[][] inicializaMapadeJogoP(
            char[][] jogoC,
            int nLinhas, int nColunas,
            char letra
    ){
        for(int nLinha=0; nLinha<nLinhas; nLinha++){
            for(int nColuna=0; nColuna<nColunas; nColuna++)
                jogoC[nLinha][nColuna]=letra;
        }
        return jogoC;
    }
    
    public ImageIcon obtemImagem(char letra){
        ImageIcon imagem=new ImageIcon();
        if(letra==NADA)
            imagem=imagens[0];
        else if(letra==ZERO)
            imagem=imagens[1];
        else if(letra==XIS)
            imagem=imagens[2];
        else
            System.out.println("Letra indefinida!");
        return imagem;
    }
    
    public ImageIcon[][] inicializaMapadeJogoA(
            ImageIcon[][] jogoI,
            int nLinhas, int nColunas,
            char letra
    ){
        ImageIcon imagem=obtemImagem(letra);
       for(int nLinha=0; nLinha<nLinhas; nLinha++){
            for(int nColuna=0; nColuna>nColunas; nColuna++)
            jogoI[nLinha][nColuna]=imagem;
       }
        return jogoI;
    }
    
    public ArrayList<JLabel> apresentaMapa(
            ArrayList<JLabel>jogoB, ImageIcon[][] jogoI,
            int nLinhas, int nColunas){
            int nBotao=0;
            for(int nLinha=0;nLinha<nLinhas; nLinha++)
                for(int nColuna=0; nColuna<nColunas; nColuna++){
                    nBotao=nLinha*POSV+nColuna;
                    jogoB.get(nBotao).setIcon(null);
                }
        
        return jogoB;
    }
    
    public void executaJogada(int nBotao){
        char letra='\0';
        if(jogador1) letra=XIS;
        else letra=ZERO;
        int nlinha=obtemLinha(nBotao);
        int nColuna=obtemColuna(nBotao);
        if(jogoC[nlinha][nColuna]=='\0'){
            jogoC[nlinha][nColuna]=letra;
            jogoI[nlinha][nColuna]=obtemImagem(letra);
            jogoB.get(nBotao).setIcon(jogoI[nlinha][nColuna]);
            nJogadas++;
            System.out.println("nJogadas: "+nJogadas);
            if(nJogadas>=NJOGADAS){
                if(testaVencedor(jogoC,POSH,POSV,jogador1)){
                    if(jogador1){
                        lbMensagem.setText("Jogador1 ganhou!");
                    } else {
                        lbMensagem.setText("Jogador2 ganhou!");
                    }
                    jogoAcabou=true;
                    for(int nbotao=0; nbotao<jogoB.size();nbotao++)
                        jogoB.get(nbotao).setEnabled(false);
                }
                else {
                    //System.out.println("jogo não decidido");
                    if(nJogadas==(POSV*POSH)){
                        //System.out.println("jogo terminou");
                        lbMensagem.setText("Jogo terminou");
                        jogoAcabou=true;
                        for(int nbotao=0; nbotao<jogoB.size();nbotao++)
                            jogoB.get(nbotao).setEnabled(false);
                    }
                }
            }
            //Troca de jogador
            if(!jogoAcabou)
            if(jogador1){
                jogador1=false; lbMensagem.setText("Jogador2");
            } else {jogador1=true; lbMensagem.setText("Jogador1");
        }
    }}
        
    public int obtemLinha(int nB){ return (int)(nB/POSV);}
    public int obtemColuna(int nB){ return (nB%POSV);}
    public boolean testaVencedor(char[][] jogoC, int nLinhas, int nColunas, boolean jogador1){
        char letra='\0';
        if(jogador1) letra=XIS;
        else letra=ZERO;
        int cColunas=0;
        for(int nLinha=0;nLinha<nLinhas;nLinha++){
            cColunas=0;
            for(int nColuna=0; nColuna<nColunas; nColuna++){
                if(jogoC[nLinha][nColuna]==letra) cColunas++;
            }
            if(cColunas==nColunas) return true;
        }
        int cLinhas = 0;
        for(int nColuna=0; nColuna<nColunas; nColuna++){
            cLinhas=0;
            for(int nLinha=0; nLinha<nLinhas; nLinha++)
                if(jogoC[nLinha][nColuna]==letra) cLinhas++;
            if(cLinhas==nLinhas) return true;
        }
        
        //testa diagonais de cima para baixo
        int cSimbolos=0;
        for(int nLinha=0; nLinha<nLinhas;nLinha++){
            int nColuna=nLinha;
            if(jogoC[nLinha][nColuna]==letra) cSimbolos++;
            if(cSimbolos==nLinhas)return true;
        }
        
        //Testa diagonal de baixo para cima
        cSimbolos=0;
        for(int nColuna=0;nColuna<nColunas; nColuna++){
            int nLinha=2-nColuna;
            if(jogoC[nLinha][nColuna]==letra) cSimbolos++;
            if(cSimbolos==nLinhas)return true;
        }
        return false;
    }
    
    
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
            java.util.logging.Logger.getLogger(JogoDoGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDoGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDoGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDoGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDoGalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovoJogo;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb01;
    private javax.swing.JLabel lb02;
    private javax.swing.JLabel lb03;
    private javax.swing.JLabel lb04;
    private javax.swing.JLabel lb05;
    private javax.swing.JLabel lb06;
    private javax.swing.JLabel lb07;
    private javax.swing.JLabel lb08;
    private javax.swing.JLabel lb09;
    private javax.swing.JLabel lbMensagem;
    // End of variables declaration//GEN-END:variables
}