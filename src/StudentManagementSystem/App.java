package StudentManagementSystem;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App  implements StudentManagementSystem{

    private List<User> users;
    private int userSequence = 1000;
    private File database;
    public App(){
        users = new ArrayList<User>();
       try{
           database = new File("data.text");
           database.createNewFile();
       }catch (Exception e){
           System.out.println("file could not be created");
       }
    }
    public static void main(String[] args) {
      App app = new App();
      app.registerStudent();
      app.registerTeacher();
      app.showListofUsers();
    }

    @Override
    public void registerUser(String type) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.type = type;
        user.id = userSequence;
        System.out.println("Enter your name");
        user.name = scanner.next();
        System.out.println("Enter your email :");
        user.email = scanner.next();
        System.out.println("Enter your password :");
        user.password = scanner.next();
        this.users.add(user);
        try {
            FileWriter fw = new FileWriter(database);
            fw.write(this.users.toString());
        }catch (Exception e){
            System.out.println("could not save user");
        }

        this.userSequence++;
    }

    public void registerStudent(){
        registerUser("student");
    }

    public void registerTeacher(){
        registerUser("teacher");
    }

    @Override
    public void loginUser() {

    }

    @Override
    public void logoutUser() {

    }

    @Override
    public void resetPassword() {

    }

    @Override
    public void showListofUsers() {
        for(User u:this.users){
            System.out.println(u);
        }
    }

    public void showListofStduents(){
        for(User u:this.users){
            if(u.type.equals("student"))
            System.out.println(u);
        }
    }

    public void showListofTeachers(){
        for(User u:this.users){
            if(u.type.equals("teacher"))
                System.out.println(u);
        }
    }
}
