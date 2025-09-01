package StudentManagementSystem;

public class Teacher extends User {

    public Teacher(String name,String email,String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = "teacher";
    }
}
