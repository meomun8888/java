package read_write_oop;

public class Student implements Comparable<Student>{
    private String name;
    private String id;
    private int age;
    private double mediumScore;

    public Student(String name, String id, int age, double mediumScore) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.mediumScore = mediumScore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student [ "+"Name: "+this.name+", Id: "+this.id+", Age: "+this.age +" Medium Score: "+this.mediumScore +']';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
