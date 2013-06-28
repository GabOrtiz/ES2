/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static vendaingressos.Conexao.rs;
import static vendaingressos.Conexao.stmt;

/**
 *
 * @author Ortiz
 */
public class CompraIngresso extends javax.swing.JFrame {
    String text;
    Conexao c = new Conexao();
    
    public CompraIngresso(){
        
        initComponents();
        setLocationRelativeTo( null ); 
        
        
        Conexao c = new Conexao();
        c.buscaFilmes();

//        for(int i = 0;i<c.filmes.size(); i++) {
//            boxFilmes.addItem(c.filmes.get(i));
//        }
        
        Set<String> chaves = c.filmes.keySet();  
        for (String chave : chaves)  
        {  
            if(chave != null)  
                 boxFilmes.addItem(chave);  
             }  
       
        text = c.filmes.get(boxFilmes.getSelectedItem().toString());
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Bcomprar = new javax.swing.JButton();
        BCancelarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxFilmes = new javax.swing.JComboBox();

        setTitle("Cine Totem");

        jScrollPane2.setViewportView(jTextPane1);

        Bcomprar.setText("Comprar");
        Bcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomprarActionPerformed(evt);
            }
        });

        BCancelarCompra.setText("Cancelar");
        BCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarCompraActionPerformed(evt);
            }
        });

        jLabel1.setText("Filme:");

        jLabel2.setText("Informações:");

        atualizar();
        boxFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bcomprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BCancelarCompra))
                    .addComponent(boxFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcomprar)
                    .addComponent(BCancelarCompra))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizar(){
        for(Cliente c: VendaIngressos.clientes){
            System.out.println(c.toString());
        }
        
         for(Ingresso i: VendaIngressos.ingressos){
            boxFilmes.addItem(i);
        }
    }
    
    private void boxFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFilmesActionPerformed
            
             jTextPane1.setText(text);
            
    }//GEN-LAST:event_boxFilmesActionPerformed

    private void BCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarCompraActionPerformed
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BCancelarCompraActionPerformed

    private void BcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomprarActionPerformed
        double precoaux = 0;
        
        for(Ingresso i:VendaIngressos.ingressos){
            if(i.equals(boxFilmes.getSelectedItem())){
                Inicial.Iaux = i;
                i.getSala();
            }
        }
        
                
        for(Cliente c:VendaIngressos.clientes){
            if(c == Inicial.Caux && c.getSaldo() >= Inicial.Iaux.getValor() && Inicial.Iaux.getQuantidade()>=1){
            c.setSaldo(c.getSaldo() - Inicial.Iaux.getValor());
            
            
            for(Ingresso i:VendaIngressos.ingressos){
                if((i.equals(Inicial.Iaux))){
                    i.setQuantidade(i.getQuantidade()-1);
                }
           }
         }
        }
        this.dispose();
    }//GEN-LAST:event_BcomprarActionPerformed
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
            java.util.logging.Logger.getLogger(CompraIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new CompraIngresso().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelarCompra;
    private javax.swing.JButton Bcomprar;
    private javax.swing.JComboBox boxFilmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
