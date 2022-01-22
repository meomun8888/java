package student;

import java.util.ArrayList;

public class Array_List_Student {
    private ArrayList<Student> studentList;

    public Array_List_Student() {
        this.studentList = new ArrayList<Student>();
    }

    public Array_List_Student(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    //add
    public void add(Student st) {
        studentList.add(st);
    }

    // add index
    public void add(Student st, int index) {
        if (index < 0 || index > studentList.size()) {
            System.out.println("Error ");
        } else {
            studentList.add(index, st);
        }
    }

    //size
    public int size() {
        return studentList.size();
    }
    // sort name

    // remove
    public void remove(Student s){
        studentList.remove(s.getStudentId());
    }
    @Override
    public String toString() {
        return "\n" + this.studentList;
    }
}
