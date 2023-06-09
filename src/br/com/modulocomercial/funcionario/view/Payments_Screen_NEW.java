/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.modulocomercial.funcionario.view;

import javax.swing.JFrame;

/**
 *
 * @author joanb
 */
public class Payments_Screen_NEW extends javax.swing.JFrame {

    /**
     * Creates new form Payments_Screen
     */
    public Payments_Screen_NEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPYS = new javax.swing.JPanel();
        jPanelBoardPYS = new javax.swing.JPanel();
        jLabelPaymentNamePYS = new javax.swing.JLabel();
        jLabelPaymentMethodPYS = new javax.swing.JLabel();
        jComboBoxPaymentMethodPYS = new javax.swing.JComboBox<>();
        jLabelDiscountPYS = new javax.swing.JLabel();
        jTextFieldDiscountPYS = new javax.swing.JTextField();
        jLabelTotalValuePYS = new javax.swing.JLabel();
        jTextFieldTotalValuePYS = new javax.swing.JTextField();
        jLabelEmployeeeCodePYS = new javax.swing.JLabel();
        jTextFieldEmployeeCodePYS = new javax.swing.JTextField();
        jButtonPrintNotePYS = new javax.swing.JButton();
        jButtonReturnPYS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPYS.setBackground(new java.awt.Color(244, 245, 241));

        jPanelBoardPYS.setBackground(new java.awt.Color(15, 27, 54));

        jLabelPaymentNamePYS.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPaymentNamePYS.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelPaymentNamePYS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPaymentNamePYS.setText("PAYMENT");

        javax.swing.GroupLayout jPanelBoardPYSLayout = new javax.swing.GroupLayout(jPanelBoardPYS);
        jPanelBoardPYS.setLayout(jPanelBoardPYSLayout);
        jPanelBoardPYSLayout.setHorizontalGroup(
            jPanelBoardPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoardPYSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentNamePYS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBoardPYSLayout.setVerticalGroup(
            jPanelBoardPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoardPYSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentNamePYS)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabelPaymentMethodPYS.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabelPaymentMethodPYS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelPaymentMethodPYS.setText("PAYMENT METHOD:");

        jComboBoxPaymentMethodPYS.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPaymentMethodPYS.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxPaymentMethodPYS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IN CASH", "CREDIT CARD", "DEBIT CARD", "NOTE (FOR 30 DAYS)", "30/60 DAYS" }));

        jLabelDiscountPYS.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabelDiscountPYS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelDiscountPYS.setText("DISCOUNT:");

        jTextFieldDiscountPYS.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDiscountPYS.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTotalValuePYS.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabelTotalValuePYS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelTotalValuePYS.setText("TOTAL VALUE:");

        jTextFieldTotalValuePYS.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalValuePYS.setForeground(new java.awt.Color(0, 0, 0));

        jLabelEmployeeeCodePYS.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabelEmployeeeCodePYS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelEmployeeeCodePYS.setText("EMPLOYEE CODE:");

        jTextFieldEmployeeCodePYS.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmployeeCodePYS.setForeground(new java.awt.Color(0, 0, 0));

        jButtonPrintNotePYS.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPrintNotePYS.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButtonPrintNotePYS.setForeground(new java.awt.Color(15, 27, 54));
        jButtonPrintNotePYS.setText("PRINT NOTE");
        jButtonPrintNotePYS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonReturnPYS.setBackground(new java.awt.Color(255, 255, 255));
        jButtonReturnPYS.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButtonReturnPYS.setForeground(new java.awt.Color(204, 0, 0));
        jButtonReturnPYS.setText("RETURN");
        jButtonReturnPYS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReturnPYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnPYSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPYSLayout = new javax.swing.GroupLayout(jPanelPYS);
        jPanelPYS.setLayout(jPanelPYSLayout);
        jPanelPYSLayout.setHorizontalGroup(
            jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBoardPYS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPYSLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEmployeeeCodePYS)
                    .addComponent(jLabelPaymentMethodPYS)
                    .addComponent(jLabelDiscountPYS)
                    .addComponent(jLabelTotalValuePYS))
                .addGap(35, 35, 35)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelPYSLayout.createSequentialGroup()
                        .addComponent(jButtonReturnPYS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrintNotePYS))
                    .addComponent(jComboBoxPaymentMethodPYS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDiscountPYS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotalValuePYS)
                    .addComponent(jTextFieldEmployeeCodePYS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanelPYSLayout.setVerticalGroup(
            jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPYSLayout.createSequentialGroup()
                .addComponent(jPanelBoardPYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPaymentMethodPYS)
                    .addComponent(jComboBoxPaymentMethodPYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiscountPYS)
                    .addComponent(jTextFieldDiscountPYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalValuePYS)
                    .addComponent(jTextFieldTotalValuePYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmployeeeCodePYS)
                    .addComponent(jTextFieldEmployeeCodePYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelPYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrintNotePYS)
                    .addComponent(jButtonReturnPYS))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPYS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPYS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReturnPYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnPYSActionPerformed
        Market_Screen_NEW rgf = new Market_Screen_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    
    }//GEN-LAST:event_jButtonReturnPYSActionPerformed

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
            java.util.logging.Logger.getLogger(Payments_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments_Screen_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments_Screen_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrintNotePYS;
    private javax.swing.JButton jButtonReturnPYS;
    private javax.swing.JComboBox<String> jComboBoxPaymentMethodPYS;
    private javax.swing.JLabel jLabelDiscountPYS;
    private javax.swing.JLabel jLabelEmployeeeCodePYS;
    private javax.swing.JLabel jLabelPaymentMethodPYS;
    private javax.swing.JLabel jLabelPaymentNamePYS;
    private javax.swing.JLabel jLabelTotalValuePYS;
    private javax.swing.JPanel jPanelBoardPYS;
    private javax.swing.JPanel jPanelPYS;
    private javax.swing.JTextField jTextFieldDiscountPYS;
    private javax.swing.JTextField jTextFieldEmployeeCodePYS;
    private javax.swing.JTextField jTextFieldTotalValuePYS;
    // End of variables declaration//GEN-END:variables
}
