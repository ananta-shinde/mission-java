package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class College {
    private int id;
    private String name;
    private String website;
    private String address;
    private ArrayList<Department> departments;

    public College() {
        departments = new ArrayList();
    }

    public College(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public College(College c) {
        this.name = c.name;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Department> getDepartments() {
        return this.departments;
    }

    public Department getDepartmentById(int id) {
        for (Department d : this.departments) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    public void setDepartment(Department d) {
        this.departments.add(d);
    }

    public void addDepartment(){
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter department id :");
        department.setId(scanner.nextInt());
        System.out.println("enter department name :");
        department.setName(scanner.next());
        setDepartment(department);
    }

}
