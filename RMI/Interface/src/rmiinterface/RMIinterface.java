package rmiinterface;

import model.Contact;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIinterface extends Remote {
    public String helloto(String name) throws RemoteException;

    public Contact getContact()throws RemoteException;

}
