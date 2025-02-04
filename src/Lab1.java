import java.net.*;
public class Lab1{
    public static void main(String[] args) {
        try{
            
            InetAddress address = InetAddress.getByName("www.samriddhicollege.edu.np");
            System.out.println(address.getCanonicalHostName());
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            byte[] arr = address.getAddress();
            for(byte b: arr){
                System.out.println(b );
            }
        }
        catch(UnknownHostException e){
            System.out.println("No Hostname");
        }
    }
}