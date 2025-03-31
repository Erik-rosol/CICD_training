import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    taskManager.addTask(desc);
                    break;
                case "2":
                    taskManager.listTasks();
                    break;
                case "3":
                    System.out.print("Enter task ID to complete: ");
                    int completeId = Integer.parseInt(scanner.nextLine());
                    taskManager.completeTask(completeId);
                    break;
                case "4":
                    System.out.print("Enter task ID to remove: ");
                    int removeId = Integer.parseInt(scanner.nextLine());
                    taskManager.removeTask(removeId);
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
