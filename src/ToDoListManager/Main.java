package ToDoListManager;

public class Main {
    public static void main(String[] args) {

        // Creates users and adds them to an array.
        User sally = new User("Sally");
        User john = new User("John");
        User alice = new User("Alice");
        User[] arr = new User[3];
        arr[0] = sally;
        arr[1] = john;
        arr[2] = alice;

        // Adds tasks to users to-do lists.
        TaskList sallysTaskList = new TaskList();
        sally.setTaskList(sallysTaskList);
        Task sallyTask1 = new Task("Pick up kids from school");
        Task sallyTask2 = new Task("Buy groceries");
        Task sallyTask3 = new Task("Go to the gym");
        sallysTaskList.addTask(sallyTask1);
        sallysTaskList.addTask(sallyTask2);
        sallysTaskList.addTask(sallyTask3);

        TaskList johnsTaskList = new TaskList();
        john.setTaskList(johnsTaskList);
        Task johnTask1 = new Task("Clean house");
        Task johnTask2 = new Task("Sell dirt bike");
        johnsTaskList.addTask(johnTask1);
        johnsTaskList.addTask(johnTask2);

        TaskList alicesTaskList = new TaskList();
        alice.setTaskList(alicesTaskList);
        Task aliceTask1 = new Task("Wash clothes");
        Task aliceTask2 = new Task("Walk the dog");
        Task aliceTask3 = new Task("Make a doctors appointment");
        alicesTaskList.addTask(aliceTask1);
        alicesTaskList.addTask(aliceTask2);
        alicesTaskList.addTask(aliceTask3);

        // Prints to-do lists for each user.
        sally.printToDoTasksForUser();
        john.printToDoTasksForUser();
        alice.printToDoTasksForUser();

        // Marks tasks as completed.
        System.out.println();
        sally.markTaskAsCompleted(sallyTask1);
        john.markTaskAsCompleted(johnTask2);
        alice.markTaskAsCompleted(aliceTask3);
        System.out.println();

        // Prints to-do lists for each user.
        sally.printToDoTasksForUser();
        john.printToDoTasksForUser();
        alice.printToDoTasksForUser();

        // Prints all tasks for each user.
        System.out.println();
        System.out.println("ALL TASKS FOR EACH USER: ");
        sally.printAllTasksForUser();
        alice.printAllTasksForUser();
        john.printAllTasksForUser();







    }
}
