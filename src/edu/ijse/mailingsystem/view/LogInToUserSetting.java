/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.view;

import edu.ijse.mailingsystem.connector.ServerConnector;
import edu.ijse.mailingsystem.controller.UserController;
import edu.ijse.mailingsystem.dto.UserDTO;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulan
 */
public class LogInToUserSetting extends javax.swing.JFrame {

    /**
     * Creates new form LogInToUserSetting
     */
    public LogInToUserSetting() {
        initComponents();
    }

    LogInToUserSetting(UserDTO user) {
        initComponents();
        showPasswordLable.setVisible(false);
        confirmPasswordOK.setVisible(false);
        confirmPasswordNotOK.setVisible(false);
        textUserId.setEditable(false);
        loadToLables(user);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textUserId = new javax.swing.JTextField();
        textUserName = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        passwordUserPassword = new javax.swing.JPasswordField();
        showPasswordLable = new javax.swing.JLabel();
        showPassword = new javax.swing.JLabel();
        lableUserNameAvailability = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        passwordUserPasswordConfirm = new javax.swing.JPasswordField();
        confirmPasswordOK = new javax.swing.JLabel();
        confirmPasswordNotOK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 3, 19), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 165, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(542, 377));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 168, 32));

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("User ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 168, 32));

        jLabel4.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 168, 32));

        jLabel5.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 168, 32));

        jLabel6.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("User Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 168, 32));
        jPanel1.add(textUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 315, 32));
        jPanel1.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 315, 32));
        jPanel1.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 315, 32));
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 315, 32));
        jPanel1.add(passwordUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 254, 32));
        jPanel1.add(showPasswordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 250, 30));

        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\show_hide_password-05-128 (1).png")); // NOI18N
        showPassword.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 49, 30));
        jPanel1.add(lableUserNameAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 134, 315, 17));

        signUpButton.setFont(new java.awt.Font("Miriam Fixed", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 165, 255));
        signUpButton.setText("Modify");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 140, -1));

        jLabel7.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 168, 27));
        jPanel1.add(passwordUserPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 254, 30));

        confirmPasswordOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordOK.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\correct-symbol-clipart-best-hg 30.png")); // NOI18N
        confirmPasswordOK.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(confirmPasswordOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 49, 29));

        confirmPasswordNotOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordNotOK.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\6a011570391c4a970c01a3fd06b553.png")); // NOI18N
        confirmPasswordNotOK.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(confirmPasswordNotOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 49, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String userId = textUserId.getText();
        String userName = textUserName.getText().toLowerCase();
        String firstName = textFirstName.getText().toLowerCase();
        String lastName = textLastName.getText().toLowerCase();
        String password = passwordUserPassword.getText();
        String confirmPassword = passwordUserPasswordConfirm.getText();
        String userType = "User";
        
        UserDTO userDTO=new UserDTO(userId, userName, firstName, lastName, password, userType);
        if (password.equals(confirmPassword)) {
            System.out.println("password confirmed");
            try {
                UserController userController=ServerConnector.getServerConnector().getUserController();
                boolean isModified=userController.modifyUser(userDTO);
                if (isModified) {
                    System.out.println("modify OK");
                    JOptionPane.showMessageDialog(null, "User Details are Modified...");
                    this.dispose();
                }else{
                    System.out.println("lol");
                }
            } catch (NotBoundException ex) {
                Logger.getLogger(LogInToUserSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(LogInToUserSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(LogInToUserSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LogInToUserSetting.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Passwords are not confirmed...");
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogInToUserSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInToUserSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInToUserSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInToUserSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInToUserSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordNotOK;
    private javax.swing.JLabel confirmPasswordOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lableUserNameAvailability;
    private javax.swing.JPasswordField passwordUserPassword;
    private javax.swing.JPasswordField passwordUserPasswordConfirm;
    private javax.swing.JLabel showPassword;
    private javax.swing.JLabel showPasswordLable;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textUserId;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables

    private void loadToLables(UserDTO user) {
        textUserId.setText(user.getUserID());
        textUserName.setText(user.getUserName());
        textFirstName.setText(user.getFirstName());
        textLastName.setText(user.getLastName());
    }
}