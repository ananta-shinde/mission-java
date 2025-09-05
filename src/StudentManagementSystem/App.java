package StudentManagementSystem;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App  {

    public static void main(String[] args) {
        College college = new College();
        Student s  = new Student();
        s.college = college;
        Student s2  = new Student();
        s2.college = college;

    }
}
