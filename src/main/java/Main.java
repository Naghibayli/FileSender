import IOUtil.UInput;
import TCPClient.ClientConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String name = UInput.requireString("Enter name: ");
        String surname = UInput.requireString("Enter surname: ");
        System.out.print(name + " " + surname +
                " , enter path for the image you want to send over: ");
        ClientConnection.sendFile(new Scanner(System.in).nextLine());
    }
}
