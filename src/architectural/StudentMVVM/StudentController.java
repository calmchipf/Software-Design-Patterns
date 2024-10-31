package architectural.StudentMVVM;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class StudentController {
    private final List<Student> students = new ArrayList<>();
    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        server.createContext("/students", controller::handleRequest);
        server.setExecutor(null);
        server.start();
        System.out.println("Server started on http://localhost:8081");
    }

    private void handleRequest(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();

        if ("GET".equals(method)) {
            String response = gson.toJson(students);
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        } else if ("POST".equals(method)) {
            byte[] requestBody = exchange.getRequestBody().readAllBytes();
            Student student = gson.fromJson(new String(requestBody), Student.class);
            students.add(student);
            exchange.sendResponseHeaders(200, 0);
        }
    }
}

