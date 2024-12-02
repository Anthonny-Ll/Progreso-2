package udla.allanos.prueba_p2;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private String address;
    private String phone;
    private List<Student> students;
    private List<Department> departments;

    public College(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.students = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void deleteDepartment(Department department) {
        departments.remove(department);
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }
}
