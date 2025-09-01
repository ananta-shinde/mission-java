package StudentManagementSystem;

public class Student extends User{

  public Student(String name,String email,String password){
      this.name = name;
      this.email = email;
      this.password = password;
      this.type = "student";
  }
}
