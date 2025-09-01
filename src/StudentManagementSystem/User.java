package StudentManagementSystem;

public class User {

    protected int id;
    protected String name;
    protected   String email;
    protected String password;
    protected String type;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
