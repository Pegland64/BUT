import java.net.*;
import java.io.*;
import java.nio.file.Files;

public class HttpServer {
    public static void main(String[] args) {
        int port = 8080;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serveur connecté sur le port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    processClientRequest(clientSocket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processClientRequest(Socket clientSocket) {
        try (
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream())
        ) {
            String requestLine = input.readLine();
            System.out.println("Requête : " + requestLine);


            String[] tokens = requestLine.split(" ");
            String method = tokens[0];
            String requestedFile = tokens[1];

            if (!method.equals("GET")) {
                sendErrorResponse(output, 405, "Méthode non autorisée");
                return;
            }

            if (requestedFile.equals("/")) {
                requestedFile = "/index.html";
            }

            File file = new File("." + requestedFile);
            if (!file.exists()) {
                sendErrorResponse(output, 404, "Non trouvé");
                return;
            }

            byte[] fileContent = Files.readAllBytes(file.toPath());
            String contentType = getContentType(requestedFile);

            output.writeBytes("HTTP/1.1 200 OK\r\n");
            output.writeBytes("Content-Type: " + contentType + "\r\n");
            output.writeBytes("Content-Length: " + fileContent.length + "\r\n");
            output.writeBytes("\r\n");
            output.write(fileContent);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendErrorResponse(DataOutputStream output, int statusCode, String statusMessage) throws IOException {
        output.writeBytes("HTTP/1.1 " + statusCode + " " + statusMessage + "\r\n");
        output.writeBytes("Content-Type: text/html\r\n");
        output.writeBytes("\r\n");
        output.writeBytes("<html><body><h1>" + statusCode + " " + statusMessage + "</h1></body></html>");
        output.flush();
    }

    private static String getContentType(String fileName) {
        if (fileName.endsWith(".html") || fileName.endsWith(".htm")) {
            return "text/html";
        } else if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (fileName.endsWith(".gif")) {
            return "image/gif";
        } else if (fileName.endsWith(".png")) {
            return "image/png";
        } else if (fileName.endsWith(".css")) {
            return "text/css";
        } else if (fileName.endsWith(".js")) {
            return "application/javascript";
        } else {
            return "application/octet-stream";
        }
    }
}
