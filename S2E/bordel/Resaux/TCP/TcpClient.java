import java.net.*;
import java.io.*;

public class TcpClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java TcpClient server_address port_number");
            System.exit(1);
        }

        String sa = args[0];
        int port = Integer.parseInt(args[1]);

        try {
            Socket socket = new Socket(sa, port);

            BufferedReader si = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

            String messageToServer;

            while (true) {
                String messageFromServer = si.readLine();
                System.out.println("[client] message recu du serveur: " + messageFromServer);

                if (messageFromServer.equalsIgnoreCase("stop")) {
                    break;
                }

                System.out.print("[client] entrez votre message : ");
                messageToServer = clientInput.readLine();
                outToServer.println(messageToServer);

                if (messageToServer.equalsIgnoreCase("stop")) {
                    break;
                }
            }

            System.out.println("[client] fermeture de la connexion.");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
