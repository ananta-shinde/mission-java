package StudentManagementSystem;

public class College {
    private int id;
    private String name;
    private String website;
    private String address;
    private Department department;

    public College(){
       department = new Department();
    }
    public College(int id,String name){
        this.id = id;
        this.name = name;
    }

    public College(College c){
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
