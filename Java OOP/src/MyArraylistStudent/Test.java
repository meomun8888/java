package MyArraylistStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArrayList<Student> s = new MyArrayList<>();
        Student student;
        int choose = 0;
        do {
            System.out.println("1.add list student");
            System.out.println("2.show info student");
            System.out.println("0. exit !");
            System.out.println("---------------------");
            System.out.print("You Enter: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.print("number student: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Student "+(i+1));
                        student = new Student();
                        student.inputInfo();
                        s.add(student);
                    }
                    break;
                }
                case 2: {
                    for (int i = 0;i < s.size();i++){
                        System.out.println(s.toString());
                    }
                    break;
                }
                default:
            }
        } while (choose != 0);
    }
}
