package ToDoListManager;

import java.util.LinkedList;

public class TaskList {
    LinkedList<Task> taskList;
    LinkedList<Task> toDoList;

    public TaskList() {
        taskList = new LinkedList<>();
        toDoList = new LinkedList<>();
    }

    public LinkedList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(LinkedList<Task> taskList) {
        this.taskList = taskList;
    }

    public LinkedList<Task> getToDoList() {
        return toDoList;
    }

    public void setToDoList(LinkedList<Task> toDoList) {
        this.toDoList = toDoList;
    }

    public void addTask(Task task){
        taskList.add(task);
        if(task.getCompletionStatus().equals("pending")){
            toDoList.add(task);
        }
    }

    public void markTaskAsCompleted(Task task){
        if (toDoList.contains(task)){
            task.setCompletionStatus("completed");
            toDoList.remove(task);
            System.out.println(task.getDescription() + " - Task status successfully updated to completed.");
        } else{
            System.out.println("Specified task was not found in the to-do list.");
        };
    }

    public void printAllTasks(){
        System.out.println("Task List: " + taskList);
    }
    public void printToDoTasks(){
        System.out.println("To-Do List: " + toDoList);
    }


    @Override
    public String toString() {
        return "\nTo-Do List: " + toDoList;
    }
}
