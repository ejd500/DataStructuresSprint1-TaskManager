package ToDoListManager;

public class User {
    private String name;
    private TaskList taskList = new TaskList();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void addTask(Task task){
        taskList.addTask(task);
    }

    public void markTaskAsCompleted(Task task){
        taskList.markTaskAsCompleted(task);
    }

    public void printAllTasksForUser(){
        System.out.println("--- " + this.name + " ---");
        taskList.printAllTasks();
    }
    public void printToDoTasksForUser(){
        System.out.println("--- " + this.name + " ---");
        taskList.printToDoTasks();
    }

    @Override
    public String toString() {
        return " --- " + name + " --- " + taskList.getTaskList();
    }
}
