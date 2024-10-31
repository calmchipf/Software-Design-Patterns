package architectural.TodoMVC;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8083), 0);
        server.createContext("/todos", new TodoController()); // Use TodoController directly
        server.createContext("/static", new StaticFileHandler()); // Use StaticFileHandler for serving static files
        server.setExecutor(null);
        server.start();
        System.out.println("Server started on http://localhost:8083");
    }
}


