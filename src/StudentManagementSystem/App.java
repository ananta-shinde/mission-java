package StudentManagementSystem;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App  {

    private List<Student> studentList;
    private List<College> collegeList;
    private List<Department> departmentList;
    private List<Teacher> teacherList;
    private List<Subject> subjectList;

    public App(){
        collegeList = new ArrayList<>();
        departmentList = new ArrayList<>();
        teacherList = new ArrayList<>();
        studentList = new ArrayList<>();
        subjectList = new ArrayList<>();
    }
    public void  showCollegeList(){
         for(College c:this.collegeList){
             c.showDetails();
         }
    }

    public void showDepartmentList(int collegeId){
        for(Department d : this.departmentList){
            if(d.getCollegeId() == collegeId)
            d.showDetails();
        }
    }

    public void showTeacherList(int collegeId){
        for(Teacher t : this.teacherList){
            if(t.getCollegeId() == collegeId)
                t.showDetails();
        }
    }

    public void showTeacherListByDepartment(int departmentId){
        for(Teacher t : this.teacherList){
            if(t.getDepartmentId() == departmentId)
                t.showDetails();
        }
    }

    public void showStudentList(int collegeId){
        for(Student s : this.studentList){
            if(s.getCollegeId() == collegeId)
                s.showDetails();
        }
    }

    public void showStudentListByDepartment(int departmentId){
        for(Student s: this.studentList){
            if(s.getDepartmentId() == departmentId)
                s.showDetails();
        }
    }

    public void  addStudent(){
        Scanner scanner = new Scanner(System.in);
        Student s = new Student();
        System.out.println("enter student details :");
        s.setId(this.studentList.size()+1);
        System.out.println("enter name:");
        s.setName(scanner.nextLine());
        System.out.println("enter email:");
        s.setEmail(scanner.nextLine());
        System.out.println("enter password:");
        s.setPassword(scanner.nextLine());
        System.out.println("enter college id:");
        s.setCollegeId(scanner.nextInt());
        System.out.println("enter department id:");
        s.setDepartmentId(scanner.nextInt());
        this.studentList.add(s);
    }

    public void  addTeacher(){
        Scanner scanner = new Scanner(System.in);
        Teacher t = new Teacher();
        System.out.println("enter Teacher details :");
        t.setId(this.teacherList.size()+1);
        System.out.println("enter name:");
        t.setName(scanner.nextLine());
        System.out.println("enter email:");
        t.setEmail(scanner.nextLine());
        System.out.println("enter password:");
        t.setPassword(scanner.nextLine());
        System.out.println("enter college id:");
        t.setCollegeId(scanner.nextInt());
        System.out.println("enter department id:");
        t.setDepartmentId(scanner.nextInt());
        this.teacherList.add(t);
    }

    public void  addDepartment(){
        Scanner scanner = new Scanner(System.in);
        Department d = new Department();
        System.out.println("enter Department details :");
        d.setId(this.departmentList.size()+1);
        System.out.println("enter name:");
        d.setName(scanner.nextLine());
        System.out.println("enter college id:");
        d.setCollegeId(scanner.nextInt());
        this.departmentList.add(d);
    }
    public void  addCollege(){
        Scanner scanner = new Scanner(System.in);
        College d = new College();
        System.out.println("enter Department details :");
        d.setId(this.collegeList.size()+1);
        System.out.println("enter name:");
        d.setName(scanner.nextLine());
        this.collegeList.add(d);
    }

    public void  addSubject(){
        Scanner scanner = new Scanner(System.in);
        Subject sub = new Subject();
        System.out.println("enter Department details :");
        sub.setId(this.subjectList.size()+1);
        System.out.println("enter name:");
        sub.setName(scanner.nextLine());
        this.subjectList.add(sub);
    }




    public static void main(String[] args) {

        App app = new App();
        app.addCollege();
        System.out.println("*********************");
        app.showCollegeList();
        app.addDepartment();
        System.out.println("*********************");



    }
}
