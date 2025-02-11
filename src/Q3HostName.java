//Lab 3 Write a prrogram to retrieve Hostname, IP Address, and Mac Address of Local Machine
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class Q3HostName {
    public static void main(String[] args) throws Exception{
        InetAddress localHost= InetAddress.getLocalHost();
        String hostName= localHost.getHostName();
        String ipAddress = localHost.getHostAddress();

        NetworkInterface network= NetworkInterface.getByInetAddress(localHost);
        byte[] mac= network.getHardwareAddress();

        //Print the details
        System.out.println("Host Name: "+hostName);
        System.out.println("IP Address: "+ipAddress);
        System.out.print("MAC Address: ");
        if (mac!= null) {
            for(int i=0; i<mac.length;i++){
                
                System.out.printf("%02X",mac[i]);

            }
        }
    }
}
