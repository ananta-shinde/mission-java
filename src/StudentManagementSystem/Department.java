package StudentManagementSystem;

public class Department {

    private int id;
    private String name;
    private int collegeId;

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

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public void  showDetails(){
        System.out.println("id:" +this.id+" name: "+this.name);
    }

}
