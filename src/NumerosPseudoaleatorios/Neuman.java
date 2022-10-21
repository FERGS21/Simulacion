/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosPseudoaleatorios;

import java.math.*;

/**
 *
 * @author fersa
 */
public class Neuman extends javax.swing.JFrame {

    /**
     * Creates new form Neuman
     */
    public Neuman() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        semilla = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        numeros = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Neumann");

        jLabel2.setText("Semilla (10 numeros )");

        semilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semillaActionPerformed(evt);
            }
        });

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        numeros.setColumns(20);
        numeros.setRows(5);
        jScrollPane1.setViewportView(numeros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calcular)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(semilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuMetodos nf = new MenuMetodos();
       nf.setVisible(true);
       this.dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void semillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semillaActionPerformed

    private static String cuadrado (String num1)
    {
        BigInteger numero = new BigInteger(num1);
            return numero.pow(2).toString();
    }
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
        String resultado=cuadrado(semilla.getText());
        String resultados="";
        
        
        int total_v=0;
        total_v = resultado.length();
        //System.out.println(""+total_v);
        
        int val1=(total_v/2)-2;
        int val2=(total_v/2)-1;
        int val3=total_v/2;
        int val4=(total_v/2)+1;
        int val5=(total_v/2)+2;
        
        String valor1 =resultado.charAt(val1)+"";
        String valor2 =resultado.charAt(val2)+"";
        String valor3 =resultado.charAt(val3)+"";
        String valor4 =resultado.charAt(val4)+"";
        String valor5 =resultado.charAt(val5)+"";
        
        String resultado1=valor1+valor2+valor3+valor4+valor5;
        
        total_v = resultado1.length();
            
        val1=(total_v/2)-2;
        val2=(total_v/2)-1;
        val3=total_v/2;
        val4=(total_v/2)+1;
        val5=(total_v/2)+2;

        valor1 =resultado.charAt(val1)+"";
        valor2 =resultado.charAt(val2)+"";
        valor3 =resultado.charAt(val3)+"";
        valor4 =resultado.charAt(val4)+"";
        valor5 =resultado.charAt(val5)+"";

        resultados=valor1+valor2+valor3+valor4+valor5;
        
        total_v = resultado1.length();
            
        val1=(total_v/2)-2;
        val2=(total_v/2)-1;
        val3=total_v/2;
        val4=(total_v/2)+1;
        val5=(total_v/2)+2;

        valor1 =resultado.charAt(val1)+"";
        valor2 =resultado.charAt(val2)+"";
        valor3 =resultado.charAt(val3)+"";
        valor4 =resultado.charAt(val4)+"";
        valor5 =resultado.charAt(val5)+"";

        resultados=valor1+valor2+valor3+valor4+valor5;
        
        numeros.setText(resultado+"\n"+""+resultado1+"\n"+resultados);
    }//GEN-LAST:event_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(Neuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Neuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Neuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Neuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Neuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea numeros;
    private javax.swing.JTextField semilla;
    // End of variables declaration//GEN-END:variables
}
