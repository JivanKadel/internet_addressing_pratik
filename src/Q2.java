//Write a program to retrieve Hostname, Ip of local machine
import java.net.*;

public class q2 {
  public static void main(String[] args) {
    try {
      InetAddress obj = InetAddress.getLocalHost();
      System.out.println(obj.getHostName());
      System.out.println(obj.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println("No Hostname");
    }
  }
}
