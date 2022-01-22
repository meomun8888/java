package student;

public class Person {
    protected String name;
    protected String cmnn;
    protected int age;
    protected Date birhtday;

    public Person(String name, String cmnn, int age, Date birhtday) {
        this.name = name;
        this.cmnn = cmnn;
        this.age = age;
        this.birhtday = birhtday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnn() {
        return cmnn;
    }

    public void setCmnn(String cmnn) {
        this.cmnn = cmnn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirhtday() {
        return birhtday;
    }

    public void setBirhtday(Date birhtday) {
        this.birhtday = birhtday;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + ".\nCMNN: " + this.cmnn + ".\nAge: " + this.age + ".\nBirthDay: " + this.birhtday.toString();
    }
}
