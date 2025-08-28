package StudentManagementSystem;

public class App {
    public static void main(String[] args) {
        College c1 = new College();
        Department d = new Department();
        d.setName("CSE");
        College c2;
        c1.setName("GICA");
        c1.setDepartment(d);
        // shallow copy
        c2 = c1;
        // deep copy
        c2 = new College(c1);
        c2.setDepartment(d);

        c2.setName("MIT");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}
