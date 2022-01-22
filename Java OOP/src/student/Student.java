// TODO: 17/12/2021
package student;

import java.util.Comparator;

public class Student extends Person implements Comparable<Student> {
    private String studentId;
    private Department department;
    private Class class_x;
    public   static int number = 0;
    public Student(String name, String cmnn, int age, Date birhtday,
                   String studentId, Department department, Class class_x) {
        super(name, cmnn, age, birhtday);
        this.studentId = studentId;
        this.department = department;
        this.class_x = class_x;
        number += 1;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Class getClass_x() {
        return class_x;
    }

    public void setClass_x(Class class_x) {
        this.class_x = class_x;
    }

    @Override
    public String toString() {
        return "Department: "+this.department +".\nClass: "+this.class_x+".\nStudentID: "+this.studentId+
                ".\nName: "+this.name+ ".\nCMNN: "+this.cmnn+".\nAge: "+this.age +".\nBirthDay: "+this.birhtday;
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
