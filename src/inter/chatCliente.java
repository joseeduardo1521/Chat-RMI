/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author josee
 */
public interface chatCliente extends Remote {
    void mensajeCliente(String mensaje) throws RemoteException;
    
}
