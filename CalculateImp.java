/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author npappas
 */
public class CalculateImp extends UnicastRemoteObject implements Calculate {

    public CalculateImp() throws RemoteException{
        super();
    }
    @Override
    public int add(int x, int y) throws RemoteException {
      return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }

    @Override
    public int div(int x, int y) throws RemoteException {
        assert(y!=0);
        return x/y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }

    
}
