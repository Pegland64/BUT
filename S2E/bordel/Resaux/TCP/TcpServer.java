import java.io.*;
import java.net.*;
public class TcpServer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java TcpServer port_number");
            System.exit(1);
        }

        int port = Integer.parseInt(args[0]);

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("[serveur] en attente du port de connexion " + port + "...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("[serveur] connexion etablie");

            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);

            String messageToClient;

            while (true) {
                System.out.print("[serveur] entrez votre message : ");
                messageToClient = serverInput.readLine();
                outToClient.println(messageToClient);

                if (messageToClient.equalsIgnoreCase("stop")) {
                    break;
                }

                String messageFromClient = clientInput.readLine();
                System.out.println("[serveur] messages recu : " + messageFromClient);

                if (messageFromClient.equalsIgnoreCase("stop")) {
                    break;
                }
            }

            System.out.println("[serveur] fermeture des serveurs");
            serverSocket.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}