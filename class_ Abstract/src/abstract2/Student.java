package abstract2;

public class Student extends Person implements Tuition_Fee {
    private String studentId;
    private Department department;

    public Student(String studentId,Department department,String name, String id, int age, String sex) {
        super(name, id, age, sex);
        this.studentId = studentId;
        this.department = department;
    }

    @Override
    public void getInfo() {
        System.out.println("Department: "+this.department);
        System.out.println("Student Id: "+this.studentId);
        System.out.println("Name: "+this.name);
        System.out.println("Passport: "+this.id);
        System.out.println("Age: "+this.age);
        System.out.println("Sex: "+this.sex);

    }

    @Override
    public double tuitionFee(double mony) {
        return 0;
    }
}
