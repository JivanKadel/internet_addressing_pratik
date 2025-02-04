import java.net.*;
public class LoopBackAddress {
 public static void main(String[] args) {
    try{
        InetAddress address = InetAddress.getByName("127.0.0.1");
        if(address.isLoopbackAddress()){
            System.out.println("Loopback Address");
        }
        else{
            System.out.println("Not Loopback Address");
        }
    }
    catch(UnknownHostException e){
        System.out.println("No Hostname");
    }
 }
}
