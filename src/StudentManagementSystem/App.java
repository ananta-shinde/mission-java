package StudentManagementSystem;

public class App {
    public static void main(String[] args) {
       College college = new College();
       college.addDepartment();
       college.getDepartmentById(100).addStudent();
        college.getDepartmentById(100).addStudent();

        college.getDepartmentById(100).addTeacher();
        college.getDepartmentById(100).addTeacher();

       college.getDepartmentById(100).printListOfStudents();
        System.out.println("****************************");
        college.getDepartmentById(100).printListOfTeacher();

    }
}
