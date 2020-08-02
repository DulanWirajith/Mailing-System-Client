/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.view;

import edu.ijse.mailingsystem.connector.ServerConnector;
import edu.ijse.mailingsystem.controller.MailController;
import edu.ijse.mailingsystem.dto.MailDTO;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulan
 */
public class InboxMail extends javax.swing.JPanel {

    /**
     * Creates new form ComposedMail
     */
    MailDTO mail;
    String userName;

    public InboxMail() {
        initComponents();
    }

    InboxMail(MailDTO inboxMail, String userName) {
        initComponents();
        this.mail = inboxMail;
        this.userName=userName;
        setInboxMail(inboxMail);
        oldMail(inboxMail);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        toText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        topicText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        attachmentNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        attachmentLabel = new javax.swing.JLabel();
        attachmentPathLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("From");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 150, 30));

        toText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        toText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTextActionPerformed(evt);
            }
        });
        add(toText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 380, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Subject");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        topicText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        topicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicTextActionPerformed(evt);
            }
        });
        add(topicText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 430, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Content");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 140, 30));

        closeLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\invalid (1).png")); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 11, 31, 31));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 517, 590, -1));

        contentText.setColumns(20);
        contentText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        contentText.setRows(5);
        jScrollPane1.setViewportView(contentText);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 430, 270));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Attachment Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, 30));

        attachmentNameText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        attachmentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachmentNameTextActionPerformed(evt);
            }
        });
        add(attachmentNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 430, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Attachment Path");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 140, 30));

        sendButton.setText("OK");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 111, -1));

        attachmentLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        attachmentLabel.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\gmail-attachment-icons-128--1-.png")); // NOI18N
        attachmentLabel.setText("Save Attachment");
        attachmentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attachmentLabelMouseClicked(evt);
            }
        });
        add(attachmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 140, 40));

        attachmentPathLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        attachmentPathLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(attachmentPathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 430, 30));

        jLabel6.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        jLabel6.setText("Inbox Message");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 132, 29));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\IJSE\\Project\\Second Sem Project\\MailingSystemClient\\src\\edu\\ijse\\mailingsystem\\image\\18185-hd-color-background-wall (1).jpg")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void topicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topicTextActionPerformed

    private void toTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toTextActionPerformed

    private void attachmentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachmentNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attachmentNameTextActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_sendButtonActionPerformed

    private void attachmentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attachmentLabelMouseClicked
        try {
            if (!attachmentNameText.getText().equals("")) {
                JFileChooser chooser = new JFileChooser("F://");
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.showSaveDialog(null);
                File f = chooser.getSelectedFile();
                String attachmentSavingPath = f.getAbsolutePath();

                String attachmentSavedPath = attachmentPathLabel.getText();
                MailController mailController = ServerConnector.getServerConnector().getMailController();
                boolean isSaved = mailController.saveReceivedAttachment(attachmentSavingPath, attachmentSavedPath, attachmentNameText.getText());
                if (isSaved) {
                    JOptionPane.showMessageDialog(null, "File Saved Successfully to : " + attachmentSavingPath);
                } else {
                    JOptionPane.showMessageDialog(null, "Error in File Saving... ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Attachment to this Mail");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_attachmentLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_closeLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attachmentLabel;
    private javax.swing.JTextField attachmentNameText;
    private javax.swing.JLabel attachmentPathLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JTextArea contentText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField toText;
    private javax.swing.JTextField topicText;
    // End of variables declaration//GEN-END:variables

    private void setInboxMail(MailDTO inboxMail) {
        toText.setText(inboxMail.getSenderName());
        topicText.setText(inboxMail.getMailTopic());
        contentText.setText(inboxMail.getMailContent());
        attachmentNameText.setText(inboxMail.getAttachmentName());
        attachmentPathLabel.setText(inboxMail.getAttachmentPath());
    }

    private void oldMail(MailDTO inboxMail) {
        try {
            MailController mailController=ServerConnector.getServerConnector().getMailController();
            System.out.println(inboxMail.getMailID());
            boolean isViewed=mailController.viewCurrentMail(userName,inboxMail.getMailID());
        } catch (NotBoundException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InboxMail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}