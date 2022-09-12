

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;

/**
 * @author Subhrajit Sadhukhan
 */
public class RmiServer {
    public static void main(String[] args) throws MalformedURLException, RemoteException {
        System.setSecurityManager(new RMISecurityManager());
        AddImpl add = new AddImpl();
        Naming.rebind("AddImpl", add);
        System.out.println("Server started..");
    }
}
