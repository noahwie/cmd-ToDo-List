public class Task {
    // declare variable description and isCompleted
    private String description;
    private boolean isCompleted;

    //Constructor for both variable (sets isCompleted false as standard)
    public Task(String description) {
        this.description = description;
        isCompleted = false;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public boolean isComplete() {
        return isCompleted;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        if (isCompleted) {
            return "[x] " + description;
        } else {
            return "[ ] " + description;
        }
    }
}
