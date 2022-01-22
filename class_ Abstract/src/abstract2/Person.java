package abstract2;

public abstract class Person {
    protected String name;
    protected String id;
    protected int age;
    protected String sex;

    public Person(String name, String id, int age, String sex) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract  void getInfo();
}
