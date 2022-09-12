

import java.rmi.Remote;

/**
 * @author Subhrajit Sadhukhan
 */
public interface Add extends Remote {
    public int add(int a, int b) throws Exception;
}
