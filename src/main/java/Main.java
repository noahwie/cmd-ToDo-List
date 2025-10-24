import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // list which stores all the tasks
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        //Declaring the scanner
        Scanner scanner = new Scanner(System.in);

        //Variable that decides if program should keep on running
        boolean running = true;

        //If variable running is true program keeps on running otherwise program quits
        while (running) {
            // Displays starting menu
            displayMenu();

            //Checks if User Input is a Int or not if it isn't an int it consumes it and gives out a message
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter a number between 1 and 5");
            }

            //Declaring to read one line of user input
            int input = scanner.nextInt();

            // Checks if iput is above 0 and below 6
            if (input < 1 || input > 5) {
                System.out.println("Please enter a number between 1 and 5");
            } else {
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
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Input a number between 1 and 5");
                }
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
        //tasks list is empty shows message
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        }else {
            //Displays numbered tasks list
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void markTaskAsCompleted() {
        //prompt user to mark a task as completed out of arrayList
        System.out.println("Please enter the task number you would like to mark as completed");
//        Scanner scanner = new Scanner(System.in);
//        int taskNumber = scanner.nextInt();
//        for (int i = 0; i < tasks.size(); i++) {
//            if (taskNumber - 1 == i) {
//                Task.markCompleted();
//                Task.isComplete();
//            } else {
//                System.out.println("there is no task with number " + taskNumber);
//            }
//        }
    }

    public static void deleteTask() {
        // Checks if there evene are any tasks to be deleted
        if (tasks.isEmpty()) {
            System.out.println("before you can delete a task you should add a task first ;)");
        }else {
            //prompt user to delete a task out of arraylist
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the task number you would like to delete");

            // Displays tasks list including number for user to check which task wants to be deleted
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            //Checks if User Input is a Int or not if it isn't an int it consumes it and gives out a message
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("please enter a number of a displayed task");
            }

            // Scans user input
            int taskNumber = scanner.nextInt();

            // Loops through tasks and checks if entered number - 1 matches an index
            for (int i = 0; i < tasks.size(); i++) {
                if (taskNumber - 1 == i) {
                    tasks.remove(i);
                } else {
                    System.out.println("No task found with number " + taskNumber);
                }
            }
            System.out.println("Task " + taskNumber + " deleted succesfully ");
        }
    }


}
