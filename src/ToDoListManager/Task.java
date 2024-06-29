package ToDoListManager;

public class Task {
    private String description;
    private String completionStatus;

    public Task(String description) {
        this.description = description;
        this.completionStatus = "pending";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public void markTaskAsCompleted(){
        this.completionStatus = "completed";
    }

    @Override
    public String toString() {
        return description + " - " + completionStatus;
    }
}
