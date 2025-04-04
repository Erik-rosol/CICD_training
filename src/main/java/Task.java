import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;


    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return completed; }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    @Override
    public String toString() {
        return String.format("%s #%d - %s (Created_ %s)", completed ? "[X]" : "[ ]",id, description, createdAt);
    }
}