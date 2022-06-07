package ProyectoFinal;

import java.util.Random;
import javax.swing.JOptionPane;


public class PPT extends javax.swing.JFrame {


    public PPT() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(800,650);
        this.setBounds(620, 200, 870, 750);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Computer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 78, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 20, 224, 149));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/papel.png"))); // NOI18N
        jLabel4.setVisible(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedra.png"))); // NOI18N
        jLabel5.setVisible(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tijeras.png"))); // NOI18N
        jLabel2.setVisible(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedra.png"))); // NOI18N
        jLabel6.setVisible(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tijeras.png"))); // NOI18N
        jLabel7.setVisible(false);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/papel.png"))); // NOI18N
        jLabel8.setVisible(false);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 247, 0));
        jButton1.setText("Tijera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 100, 60));

        jButton2.setBackground(new java.awt.Color(252, 255, 0));
        jButton2.setText("Papel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 100, 60));

        jButton3.setBackground(new java.awt.Color(239, 254, 13));
        jButton3.setText("Piedra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 100, 60));

        jButton4.setBackground(new java.awt.Color(0, 156, 255));
        jButton4.setText("JUGAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 100, 60));

        jLabel9.setText("Puntuación:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jLabel10.setText("0");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 20, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 212));
        jButton5.setText("Menú Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>



    int identificador=0;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jLabel5.setVisible(false);
        jLabel4.setVisible(false);
        jLabel2.setVisible(true);
        identificador=1;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        jLabel4.setVisible(true);
        identificador=2;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(true);
        identificador=3;
    }

    int numeroRand=0;
    int contador=0;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        Random rand = new Random();
        numeroRand=rand.nextInt(3)+1;

        if(numeroRand==1){
            jLabel6.setVisible(true);
        }else{
            jLabel6.setVisible(false);
        }
        if(numeroRand==2){
            jLabel7.setVisible(true);
        }else{
            jLabel7.setVisible(false);
        }

        if(numeroRand==3){
            jLabel8.setVisible(true);
        }else{
            jLabel8.setVisible(false);
        }
        //  Computer      Usuario
        if(numeroRand==1 && identificador==1){//   piedra       tijeras
            JOptionPane.showMessageDialog(null, "Has perdido!");
            contador--;
            jLabel10.setText(String.valueOf(contador));
        }
        if(numeroRand==1 && identificador==2){//   piedra       papel
            JOptionPane.showMessageDialog(null, "Has Ganado!!");
            contador++;
            jLabel10.setText(String.valueOf(contador));
        }
        if(numeroRand==1 && identificador==3){//    piedra      piedra
            JOptionPane.showMessageDialog(null, "Empate, sacasteis lo mismo!");
        }
        if(numeroRand==2 && identificador==1){//    tijeras       tijeras
            JOptionPane.showMessageDialog(null, "Empate, sacasteis lo mismo!");
        }
        if(numeroRand==2 && identificador==2){//    tijeras       papel
            JOptionPane.showMessageDialog(null, "Has perdido!");
            contador--;
            jLabel10.setText(String.valueOf(contador));
        }
        if(numeroRand==2 && identificador==3){//   tijeras       piedra
            JOptionPane.showMessageDialog(null, "Has Ganado!!");
            contador++;
            jLabel10.setText(String.valueOf(contador));
        }
        if(numeroRand==3 && identificador==1){//  papel        tijeras
            JOptionPane.showMessageDialog(null, "Has Ganado!!");
            contador++;
            jLabel10.setText(String.valueOf(contador));
        }
        if(numeroRand==3 && identificador==2){//   papel       papel
            JOptionPane.showMessageDialog(null, "Empate, sacasteis lo mismo!");
        }
        if(numeroRand==3 && identificador==3){//  papel        piedra
            JOptionPane.showMessageDialog(null, "Has perdido!");
            contador--;
            jLabel10.setText(String.valueOf(contador));
        }

        if(contador<0){
            jLabel10.setText(String.valueOf(0));
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();

    }


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
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
