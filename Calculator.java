/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.*;
import java.rmi.registry.*;
/**
 *
 * @author npappas
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        try{
            CalculateImp  ci= new CalculateImp();
            Naming.rebind("rmi://localhost:5000/sonoo", ci);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
