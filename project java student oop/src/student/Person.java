package student;

import java.util.Scanner;

public class Person {
    private String name;
    private String id;
    private int age;
    private String sex;


    public Person() {
    }

    public Person(String name, String id, int age, String sex) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "Id: " + this.id + "Age: " + this.age + "sex: " + this.sex;
    }

    public void input() {
        Person ps = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        this.id = sc.nextLine();
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Sex: ");
        this.sex = sc.nextLine();
        System.out.println("Age: ");
        sc.nextLine();
        this.age = sc.nextInt();
    }
}
