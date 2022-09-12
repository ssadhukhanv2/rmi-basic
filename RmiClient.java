

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author Subhrajit Sadhukhan
 */
public class RmiClient {
    public static void main(String args[]) throws Exception {
        Add add = (Add) Naming.lookup("AddImpl");
        int result = add.add(9, 78);
    }
}
