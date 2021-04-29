package server;

import model.Contact;
import rmiinterface.RMIinterface;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerOperation extends UnicastRemoteObject implements RMIinterface {
    protected ServerOperation() throws RemoteException{
        super();
    }

    @Override
    public String helloto(String name) throws RemoteException {
        System.err.println(name + " is trying to contact!");
        return "Server says hello to " + name;

    }

    @Override
    public Contact getContact() throws RemoteException {
        return new Contact("Jonatan Santamaria: ","7676798563");
    }

    public static void main(String[] args){

        try {

            Naming.rebind("//localhost/MyServer", new ServerOperation());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }

    }

}
