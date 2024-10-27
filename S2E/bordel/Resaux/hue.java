import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hue {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String request = in.readLine();
            String[] parts = request.split(" ");
            if (parts.length != 3) {
                sendResponse(out, 400, "Bad Request");
                socket.close();
                continue;
            }

            String method = parts[0];
            String file = parts[1];
            String httpVersion = parts[2];

            if (!method.equals("GET")) {
                sendResponse(out, 405, "Method Not Allowed");
                socket.close();
                continue;
            }

            String contentType = obtenirTypeContenu(file);
            byte[] content = readFile(file);
            if (content == null) {
                sendResponse(out, 404, "Not Found");
            } else {
                sendResponse(out, 200, "OK", contentType, content);
            }

            socket.close();
        }
    }

    private static void sendResponse(DataOutputStream out, int statusCode, String statusMessage, String contentType, byte[] content) throws IOException {
        out.writeBytes("HTTP/1.1 " + statusCode + " " + statusMessage + "\r\n");
        out.writeBytes("Content-Type: " + contentType + "\r\n");
        out.writeBytes("Content-Length: " + content.length + "\r\n");
        out.writeBytes("\r\n");
        out.write(content, 0, content.length);
    }

    private static void sendResponse(DataOutputStream out, int statusCode, String statusMessage) throws IOException {
        sendResponse(out, statusCode, statusMessage, "text/html", ("<html><body><h1>" + statusCode + " " + statusMessage + "</h1></body></html>").getBytes());
    }

    private static byte[] readFile(String file) {
        try {
            return Files.readAllBytes(Paths.get(file));
        } catch (IOException e) {
            return null;
        }
    }

    private static String obtenirTypeContenu(String nomFichier) {
        if (nomFichier.endsWith(".html") || nomFichier.endsWith(".htm")) {
            return "text/html";
        } else if (nomFichier.endsWith(".jpg") || nomFichier.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (nomFichier.endsWith(".gif")) {
            return "image/gif";
        } else if (nomFichier.endsWith(".png")) {
            return "image/png";
        } else if (nomFichier.endsWith(".css")) {
            return "text/css";
        } else if (nomFichier.endsWith(".js")) {
            return "application/javascript";
        } else {
            return "application/octet-stream";
        }
    }
}