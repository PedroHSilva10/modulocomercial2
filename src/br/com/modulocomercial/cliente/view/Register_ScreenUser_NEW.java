package br.com.modulocomercial.cliente.view;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.infrastructure.service.FacadeInstance;
import br.com.modulocomercial.view.Principal_Screen_NEW;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joanb
 */
public class Register_ScreenUser_NEW extends javax.swing.JFrame {
//String usuario 
    String usuario;    
//carega todos os clientes do banco de dados para verificar se não existem 2 logins iguais
    List<Cliente> clientes = FacadeInstance.getInstance().getAllClientes();
//cria numeros aleatorios    
        Random num1 = new Random();
        Random num2 = new Random();
        
//construtor de cliente
    Cliente user = new Cliente();
    /**
     * Creates new form Register_ScreenUser
     */
    public Register_ScreenUser_NEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    
    //a funçao vai definir um login aleatorio para usuario com o padrao de xxxCLIxxx
    //logo em seguida vai verificar se esse login ja existe no banco de dados
    //se existir ela se chama novamente para gerar outro numero e fazer a checagem novamente
    //se der tudo certo ele retorna o usario 
    private String validaUsuario(){
    usuario=(100+num1.nextInt(900))+"CLI"+(100+num2.nextInt(900));
    for(int i = 0; i < clientes.size(); i++){
        if(usuario.equals(clientes.get(i).getLogin())){
            usuario=validaUsuario();
        }    
    }
    return usuario;
    }
    
    
     //validaçoes()
    private boolean validaCampos(){
        
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The Name field cannot be blank");
            return false;
        }
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The Username field cannot be blank");
            return false;
        }
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The Email field cannot be blank");
            return false;
        } 
        if(txtEmail.getText().contains("@")== false){
            JOptionPane.showMessageDialog(null,"Error  the email is invalid");
            return false;
        }
        if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The Password field cannot be blank");
            return false;
        }
        
        return true;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelUserRegistration = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNameUS = new javax.swing.JLabel();
        txtNome = new javax.swing.JFormattedTextField();
        jLabelUsernameUS = new javax.swing.JLabel();
        txtUsername = new javax.swing.JFormattedTextField();
        jLabelPasswordUS = new javax.swing.JLabel();
        txtPassword = new javax.swing.JFormattedTextField();
        jLabelEmailUS = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        jButtonREGISTERUS = new javax.swing.JButton();
        jButtonRETURNUS = new javax.swing.JButton();
        jPanelLS = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Screen");
        setMinimumSize(new java.awt.Dimension(800, 548));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 32, 64));

        jLabelUserRegistration.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelUserRegistration.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserRegistration.setText("USER REGISTRATION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserRegistration)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserRegistration)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 230, 510);

        jPanel1.setBackground(new java.awt.Color(244, 245, 241));

        jLabelNameUS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelNameUS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelNameUS.setText("NAME:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabelUsernameUS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelUsernameUS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelUsernameUS.setText("USERNAME:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabelPasswordUS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelPasswordUS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelPasswordUS.setText("PASSWORD:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabelEmailUS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelEmailUS.setForeground(new java.awt.Color(15, 37, 54));
        jLabelEmailUS.setText("EMAIL:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jButtonREGISTERUS.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonREGISTERUS.setForeground(new java.awt.Color(0, 102, 153));
        jButtonREGISTERUS.setText("REGISTER");
        jButtonREGISTERUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonREGISTERUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREGISTERUSActionPerformed(evt);
            }
        });

        jButtonRETURNUS.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButtonRETURNUS.setForeground(new java.awt.Color(204, 0, 0));
        jButtonRETURNUS.setText("RETURN");
        jButtonRETURNUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRETURNUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRETURNUSMouseClicked(evt);
            }
        });

        jPanelLS.setBackground(new java.awt.Color(15, 27, 54));

        javax.swing.GroupLayout jPanelLSLayout = new javax.swing.GroupLayout(jPanelLS);
        jPanelLS.setLayout(jPanelLSLayout);
        jPanelLSLayout.setHorizontalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        jPanelLSLayout.setVerticalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelUsernameUS)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPasswordUS)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabelEmailUS)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jButtonREGISTERUS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jButtonRETURNUS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNameUS)
                                .addGap(0, 0, 0)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(150, 150, 150))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNameUS)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelUsernameUS))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelPasswordUS))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelEmailUS))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonREGISTERUS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRETURNUS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButtonRETURNUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRETURNUSMouseClicked
        Principal_Screen_NEW rgf = new Principal_Screen_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRETURNUSMouseClicked

    private void jButtonREGISTERUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREGISTERUSActionPerformed
       //verfica se os campos estao todos preenchidos
        if(validaCampos() == true){
            user.setNome(txtNome.getText());
            user.setSenha(txtPassword.getText());
            user.setEmail(txtEmail.getText());
            user.setUserName(txtUsername.getText());
            user.setLogin(validaUsuario());
        //mostra o login do cliente
            JOptionPane.showMessageDialog(null,"O login do funcionario é:" + usuario);   
        //salva o usuario
            user = FacadeInstance.getInstance().saveCliente(user);
            if (user != null) {
                this.clientes.add(user);
                this.clientes = FacadeInstance.getInstance().getAllClientes();
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o Cliente");
            }
        //limpa os campos
            txtNome.setText("");
            txtUsername.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
    
            Profile_Screen_NEW rgf = new Profile_Screen_NEW();
            rgf.setVisible(true);
            rgf.pack();
            rgf.setLocationRelativeTo(null);
            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonREGISTERUSActionPerformed

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
            java.util.logging.Logger.getLogger(Register_ScreenUser_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenUser_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenUser_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_ScreenUser_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_ScreenUser_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonREGISTERUS;
    private javax.swing.JButton jButtonRETURNUS;
    private javax.swing.JLabel jLabelEmailUS;
    private javax.swing.JLabel jLabelNameUS;
    private javax.swing.JLabel jLabelPasswordUS;
    private javax.swing.JLabel jLabelUserRegistration;
    private javax.swing.JLabel jLabelUsernameUS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelLS;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtPassword;
    private javax.swing.JFormattedTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
