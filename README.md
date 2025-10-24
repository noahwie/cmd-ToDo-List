# Java cmd To Do List App

A simple and lightweight **command-line To-Do List application** written in Java.
It allows you to **add**, **view**, **complete** and **delete** tasks - all from your terminal.
Perfect for learning Java basics suhc as classes, loops, input handling and ArrayLists.

---

## Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- Delete tasks
- Runs entirely in your terminal - no external dependencies

---

## Project Structure 

```bash
cmdToDoList/
├── README.md
└── src/
    └── main/
        └── java/
            ├── Main.java
            └── Task.java
```
--- 

## Getting Started 

### 1. Clone the Repository

Open your terminal (Command Prompt, PowerShell, Git bash etc.) and run:

```bash
git clone https://github.com/noahwie/cmd-ToDo-List.git
```

Then navigate to the into the project folder: 

```bash
cd cmdToDoList
```

### 2. Compile the Java Files

Make sure you have the Java JDK installed and added to your system's PATH.
You can check by running 

```bash
java -version
javac -version
```

If both coommands show version numbers, youre good to go!

Now compile the project:

```bash
javac Main.java Task.java
```

this will create .class files for each Java source file. 

### 3. Run the Program 

Once compiled, start the app with: 

```bash
java Main
```

---

## How to Use

When the app runs, youll see a simple menu like this:

```bash
=== TO-DO LIST ===
1. Add a new task
2. View Tasks
3. Mark task as completed
4. Delete a task
5. Exit
```

### Options 

1. Add a new task to the List (youll be prompted to enter a description)
2. View all the tasks in the list
3. Mark a specific task as completed from the list
4. Delete a task from the list
5. Exit the program

Completed tasks are shown as [X] Task description
Incomplete tasks are shown as [ ] Task description

---

## Example Session

```bash
=== TO-DO LIST ===
1. Add a new task
2. View Tasks
3. Mark task as completed
4. Delete a task
5. Exit

> 1
Please enter the description of the task you would like to add
Buy groceries
Task added successfully

> 2
1. [ ] Buy groceries

> 3
Please enter the number of the task you would like to mark as completed
1
Task 1 marked successfully

> 2
1. [x] Buy groceries
```

--- 

## Requirements 

- Java JDK 8 or higher
- Command-line terminal

---

## Author 

- Developed by Noah Wieschmann 
- GitHub: noahwie 
- LinkedIn: Noah Wieschmann 
