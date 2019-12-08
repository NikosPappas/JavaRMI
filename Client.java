/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author npappas
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        // TODO code application logic here
        try{
            Calculate stub = (Calculate)Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.add(10, 10));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
