import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // list which stores all the tasks
    static ArrayList<Task> tasks = new ArrayList<Task>();

    public static void main(String[] args) {
        //Declaring the scanner
        Scanner scanner = new Scanner(System.in);




        boolean running = true;
        while (running) {
            displayMenu();

            //Declaring to read one line of user input
            int input = scanner.nextInt();

            //Switch which delegates what method will be called based on user input
            switch (input) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Input a number between 1 and 5");
            }
        }

        //Closing scanner after Loop
        scanner.close();
    }

    private static void displayMenu() {
        //Printing menu
        System.out.println("=== TO-DO LIST ===");
        System.out.println("1. Add a new task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark task as completed");
        System.out.println("4. Delete a task");
        System.out.println("5. Exit");
    }

    public static void addTask() {
        //prompt user to type in a task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the description of the task you would like to add");

        // read prompt and safe it in a variable
        String description = scanner.nextLine();

        // create new Task object with user input description
        Task task = new Task(description);

        // add new task to taskList
        tasks.add(task);

        // letting user know task was added
        System.out.println("Task added succesfully");
    }

    public static void viewTasks() {
        //show user a list of all the tasks in ArrayList
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        }else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void markTaskAsCompleted() {
        //prompt user to mark a task as completed out of arrayList
    }

    public static void deleteTask() {
        //prompt user to delete a task out of arraylist
    }


}
