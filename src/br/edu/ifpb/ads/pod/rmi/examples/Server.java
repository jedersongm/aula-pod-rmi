/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pod.rmi.examples;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jederson
 */
public class Server {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
        Registry registry = LocateRegistry.createRegistry(10999);
        registry.bind("HelloService", new RemoteObjectImpl());
    }
}
