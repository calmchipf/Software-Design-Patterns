package architectural.TodoMVC;

public class Todo {
    private static long counter = 0;
    private final long id;
    private String description;

    public Todo (String description) {
        this.id = counter++;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


