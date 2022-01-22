package array.oop.student1;

public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nStudent{ Name: "+this.name +" Id: "+this.id +" Age: "+this.age;
    }

    public String getNamex(){
        String s = this.name.trim();
        if(s.indexOf(" ") >= 0 ) {
            int loction = s.lastIndexOf(" ");
            return s.substring(loction + 1);
        }
            return s;
    }
    @Override
    public int compareTo(Student student) {
        String thisName = this.getNamex();
        String thisStudent = student.name.trim();
        return thisStudent.compareTo(thisName);
    }
}
