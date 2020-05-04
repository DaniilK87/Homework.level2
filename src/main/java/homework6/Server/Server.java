package homework6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        System.out.println("Сервер подключен");
        Socket connected = server.accept();
        System.out.println("Соедиенение установлено");
        DataInputStream in = new DataInputStream(connected.getInputStream());
        DataOutputStream out = new DataOutputStream(connected.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        Thread inServerText = new Thread(() -> {
            while (true) {
                System.out.println("Отправить сообщение");
                String command = scanner.nextLine();
                if (true) {
                    try {
                        out.writeUTF("Сообщение с сервера" + " " + command);
                        out.flush();
                    } catch (Exception e) {e.printStackTrace();}
                }
            }
        });
            while (true) {
                String textServer = in.readUTF();
                System.out.println("Client" + textServer);
                out.writeUTF("Server" + textServer);
                out.flush();
                if (textServer.equals("end")) {
                    System.out.println("Сервер отключен");
                    break;
                }
            }
    }
}
