import java.rmi.*;
import java.rmi.registry.*;

public class SearchServer {
    public static void main(String args[]) {
        try {
            // Create the remote object
            Search obj = new SearchQuery();

            // Create the registry on port 1900
            LocateRegistry.createRegistry(1900);

            // Bind the remote object to the registry with a name
            Naming.rebind("rmi://localhost:1900/geeksforgeeks", obj);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}

