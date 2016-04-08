/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pod.rmi.examples;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jederson
 */
public interface RemoteObject extends Remote{
    
    String hello() throws RemoteException;
}
