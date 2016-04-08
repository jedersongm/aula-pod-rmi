/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pod.rmi.examples;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jederson
 */
public class RemoteObjectImpl extends UnicastRemoteObject implements RemoteObject{

    public RemoteObjectImpl() throws RemoteException{
        super();
    }
    
    @Override
    public String hello() throws RemoteException {
       return "Toca Raul";
    }
    
}
