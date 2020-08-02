/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mailingsystem.connector;

import edu.ijse.mailingsystem.controller.MailController;
import edu.ijse.mailingsystem.controller.UserController;
import edu.ijse.mailingsystem.factory.MailingSystemFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author dulan
 */
public class ServerConnector {

    private static ServerConnector serverConnector;
    private UserController userController;
    private MailController mailController;
    private MailingSystemFactory factory;

    public ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        factory = (MailingSystemFactory) Naming.lookup("rmi://localhost:5050/MailSystemServer");
    }

    public UserController getUserController() throws NotBoundException, IOException {
        if (userController == null) {
            userController = (UserController) factory.getController(MailingSystemFactory.ControllerType.USER);
        }
        return userController;
    }

    public MailController getMailController() throws NotBoundException, IOException {
        if (mailController == null) {
            mailController = (MailController) factory.getController(MailingSystemFactory.ControllerType.MAIL);
        }
        return mailController;
    }

    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }
}
