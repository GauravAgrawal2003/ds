import java.rmi.*;

public class ClientRequest {
    public static void main(String args[]) {
        String answer, value = "Reflection in Java";
        try {
            // Lookup the remote object
            Search access = (Search) Naming.lookup("rmi://localhost:1900/geeksforgeeks");

            // Call the remote method
            answer = access.query(value);
            System.out.println("Article on " + value + " " + answer + " at GeeksforGeeks");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}


