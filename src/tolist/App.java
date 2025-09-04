package tolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<Task> taskList;

    public App(){
        taskList = new ArrayList<>();
    }

    public void addTask(){
        Task task = new Task(this.taskList.size()+1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter description:");
        task.setDescription(scanner.nextLine());
        this.taskList.add(task);
    }

    public void viewTaskList(){
        for (Task t:this.taskList){
            t.viewTask();
        }
    }

    public void updateTask(int id){
        Task task = getTaskById(id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter new status :");
        task.setStatus(scanner.next());
    }

    private Task getTaskById(int id) {
        for(Task t : this.taskList){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public void deleteTask(int id){
        Task task = getTaskById(id);
        this.taskList.remove(task);
    }

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("************** welcome to todo list **********");
        while (choice !=5) {
            System.out.println("choose from following actions :");
            System.out.println("1. add new task");
            System.out.println("2. view task list");
            System.out.println("3. update task");
            System.out.println("4. delete task");
            System.out.println("5. exit");
            System.out.println("enter your choice here :");
            try {
                choice = scanner.nextInt();
                if(choice == 1){
                    app.addTask();
                }else if(choice == 2){
                    app.viewTaskList();
                } else if (choice == 3) {
                    System.out.println("enter id of task to be updated :");
                    int id = scanner.nextInt();
                    app.updateTask(id);
                }
                else if (choice == 4) {
                    System.out.println("enter id of task to be deleted :");
                    int id = scanner.nextInt();
                    app.deleteTask(id);
                }else if(choice == 5){
                    break;
                }else{
                    System.out.println("invalid choice , please try again");
                }
            } catch (Exception e) {
                System.out.println("invalid choice , please try again");
                scanner.next();
                choice = 0;
            }
        }

    }
}
