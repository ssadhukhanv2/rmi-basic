

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Subhrajit Sadhukhan
 */
public class AddImpl extends UnicastRemoteObject implements Add {

    public AddImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) throws Exception {
        return a + b;
    }
}
