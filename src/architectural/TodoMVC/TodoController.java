package architectural.TodoMVC;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class TodoController implements HttpHandler {
    private final List<Todo> todos = new ArrayList<>();
    private static final Gson gson = new Gson();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();

        if ("GET".equalsIgnoreCase(method)) {
            String response = gson.toJson(todos);
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        } else if ("POST".equalsIgnoreCase(method)) {
            byte[] requestBody = exchange.getRequestBody().readAllBytes();
            Todo todo = gson.fromJson(new String(requestBody), Todo.class);
            todos.add(todo);
            exchange.sendResponseHeaders(200, 0);
        } else {
            exchange.sendResponseHeaders(405, -1); // Method Not Allowed
        }
    }
}





