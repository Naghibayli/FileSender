package TCPClient;

import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ClientConnection {

    public static void sendFile(String path) throws Exception {
        System.out.print("Enter IP Address and Port of the Server: ");
        String ip_Port = new Scanner(System.in).nextLine();
        String[] split_IP_Port = ip_Port.split(":");
        String ip = split_IP_Port[0];
        int port = Integer.parseInt(split_IP_Port[1]);

        try{
            Socket socket = new Socket(ip, port);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            byte[] bytes = Files.readAllBytes(Paths.get(path));
            dataOutputStream.writeInt(bytes.length);
            dataOutputStream.write(bytes);
            System.out.println(" ");
            System.out.println("Image successfully sent.");
            socket.close();
        }catch (Exception e){
            System.out.println("Something went wrong...");
        }
    }
}
