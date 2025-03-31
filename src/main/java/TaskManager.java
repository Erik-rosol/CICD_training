import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description) {
        if(description == null || description.trim().isEmpty()){
            System.out.println("Error: Description cannot be empty.");
            return;
        }
        Task task = new Task(nextId++, description);
        tasks.add(task);
        System.out.println("Added: " + task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Marked task " + id + " as completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                System.out.println("Removed task " + id);
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
