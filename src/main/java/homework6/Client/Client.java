package homework6.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 80);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Напишите сообщение");
            String textClient = scanner.nextLine();
            if (textClient.equals("end")) {
                out.writeUTF(textClient);
                out.flush();
                System.out.println("Клиент отключен");
                break;
            }
            out.writeUTF(textClient);
            out.flush();
            String textServer = in.readUTF();
            System.out.println(textServer);

        }
    }
}
