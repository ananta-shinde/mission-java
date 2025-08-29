package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    private int id;
    private String name;

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public Department(){
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  addStudent(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student details :");
        System.out.println("enter id :");
        student.setId(scanner.nextInt());
        System.out.println("enter name :");
        student.setName(scanner.next());
        System.out.println("enter email :");
        student.setEmail(scanner.next());
        System.out.println("enter password :");
        student.setPassword(scanner.next());
        this.students.add(student);
    }

    public void  addTeacher(){
        Teacher teacher = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Teacher details :");
        System.out.println("enter id :");
        teacher.setId(scanner.nextInt());
        System.out.println("enter name :");
        teacher.setName(scanner.next());
        System.out.println("enter email :");
        teacher.setEmail(scanner.next());
        System.out.println("enter password :");
        teacher.setPassword(scanner.next());
        this.teachers.add(teacher);
    }

    // printList of students
    public void printListOfStudents(){
        for(Student s : this.students){
            s.showDetails();
        }
    }

    public void printListOfTeacher(){
        for(Teacher t : this.teachers){
            t.showDetails();
        }
    }

}
