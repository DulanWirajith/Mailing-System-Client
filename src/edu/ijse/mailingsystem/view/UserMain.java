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
 * @author dulan
 */
public class UserMain extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public UserMain() {
        initComponents();
        showPasswordLable.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    UserMain(UserDTO user) {
        callSignUpPanel(user);
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

        panelShowAll = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        passwordUserPassword = new javax.swing.JPasswordField();
        showPasswordLable = new javax.swing.JLabel();
        showPassword = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(561, 465));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShowAll.setOpaque(false);
        panelShowAll.setPreferredSize(new java.awt.Dimension(570, 437));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign In", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 3, 19), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("User Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 107, 168, 27));

        passwordUserPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(passwordUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 107, 280, 32));
        jPanel1.add(showPasswordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 30));

        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\show_hide_password-05-128 (1).png")); // NOI18N
        showPassword.setBorder(new javax.swing.border.MatteBorder(null));
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showPasswordMouseReleased(evt);
            }
        });
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, 30));

        textUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 56, 280, 32));

        jLabel1.setFont(new java.awt.Font("URW Bookman L", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 57, 168, 32));

        signInButton.setFont(new java.awt.Font("Miriam Fixed", 1, 18)); // NOI18N
        signInButton.setForeground(new java.awt.Color(0, 165, 255));
        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 166, 140, -1));

        jSeparator1.setForeground(new java.awt.Color(252, 236, 236));
        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 212, 547, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("New User ??");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 237, 168, 32));

        jButton3.setFont(new java.awt.Font("Miriam Fixed", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 165, 255));
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 236, 140, -1));

        javax.swing.GroupLayout panelShowAllLayout = new javax.swing.GroupLayout(panelShowAll);
        panelShowAll.setLayout(panelShowAllLayout);
        panelShowAllLayout.setHorizontalGroup(
            panelShowAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShowAllLayout.setVerticalGroup(
            panelShowAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowAllLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(panelShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 583, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\106591-3d-glossy-orange-orb-ic.png")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\aaa.png")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 10, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\image-0-02-06-70d7cca73e45aaeffba7fcdc168a40b831aee97897bcaa391b54d05e561a6e60-V.jpg")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1200, 300));
        jLabel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        try {
            String userName = textUserName.getText().toLowerCase();
            String userPassword = passwordUserPassword.getText();
            UserDTO user = new UserDTO(userName, userPassword);
            UserController userController = ServerConnector.getServerConnector().getUserController();
            boolean isAvailable = userController.SignIn(user);
            
            if (isAvailable) {
                System.out.println("0");
                boolean isReserved = userController.reserveUser(userName);
                if (isReserved) {
                    System.out.println("1");
//                    JOptionPane.showMessageDialog(null, "Ehenam ethulata yaman brooo...");
                    System.out.println("ethulata giya");
                    HomePage homePage = new HomePage(userName);
                    this.dispose();
                    homePage.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "You are already signed into the system...");
                }

            } else {
                JOptionPane.showMessageDialog(null, "UserName eka or Password weradi bn.. Apahu balapan...");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_signInButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SignUpPanel signUpPanel = new SignUpPanel();
        panelShowAll.removeAll();
        signUpPanel.setSize(panelShowAll.getSize());
        panelShowAll.add(signUpPanel);
        panelShowAll.repaint();
        panelShowAll.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked


    }//GEN-LAST:event_showPasswordMouseClicked

    private void showPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMousePressed
        String password = passwordUserPassword.getText();
        showPasswordLable.setText(password);
        showPasswordLable.setVisible(true);
        passwordUserPassword.setVisible(false);
    }//GEN-LAST:event_showPasswordMousePressed

    private void showPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseReleased
        showPasswordLable.setText("");
        showPasswordLable.setVisible(false);
        passwordUserPassword.setVisible(true);
    }//GEN-LAST:event_showPasswordMouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelShowAll;
    private javax.swing.JPasswordField passwordUserPassword;
    private javax.swing.JLabel showPassword;
    private javax.swing.JLabel showPasswordLable;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables

    private void callSignUpPanel(UserDTO user) {
        SignUpPanel signUpPanel = new SignUpPanel(user);
        panelShowAll.removeAll();
        signUpPanel.setSize(panelShowAll.getSize());
        panelShowAll.add(signUpPanel);
        panelShowAll.repaint();
        panelShowAll.revalidate();
    }
}
