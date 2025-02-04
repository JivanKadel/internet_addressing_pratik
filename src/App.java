import java.net.*;
public class App {
    public static void main(String[] args) {
        try{
            
            InetAddress obj= InetAddress.getByName("www.samriddhicollege.edu.np");
            System.out.println(obj);
            // InetAddress obj1= InetAddress.getByName("104.21.23.181");
            // System.out.println(obj1.getHostName());
            InetAddress obj2= InetAddress.getLocalHost();
            System.out.println(obj2.getHostAddress());
            System.out.println(obj.getCanonicalHostName());
            System.out.println(obj.getAddress());
            // System.out.println(obj1.getHostName());
        }
        catch(UnknownHostException e){

            System.out.println("No Hostname");
        }
    }
}
