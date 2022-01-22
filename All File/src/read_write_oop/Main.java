package read_write_oop;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList_Student listStudent = new ArrayList_Student();
        int choose = 0;
        do {
            System.out.println("1. add student. ");
            System.out.println("2. Print list. ");
            System.out.println("3. check size. ");
            System.out.println("4. check list null. ");
            System.out.println("5 check student");
            System.out.println("8. Remove all");
            System.out.println("9.Print list Student >= 8 or Student < 8");
            System.out.println("10 Write file");
            System.out.print("You enter: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Id: ");
                    String id = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.println("Medium Score: ");
                    double mediumScore = sc.nextDouble();

                    Student sv = new Student(name,id,age,mediumScore);
                    listStudent.add_student(sv);
                    break;
                }
                case 2:{
                    listStudent.printList();
                    break;
                }
                case 3:{
                    System.out.println(listStudent.size());
                    break;
                }
                case 4:{
                    System.out.println(listStudent.checkList());
                    break;
                }
                case 5:{
                    Student sv = new Student("long","021105",21,8.5);
                    System.out.println(listStudent.checkStudent(sv));
                }
                case 8:{
                    listStudent.removeList();
                }
                case 9:{
                    System.out.println("Max => studen >= 8, Min => student < 8: ");
                    String xx = sc.nextLine().trim();
                    listStudent.studentGpa(xx);
                    break;
                }
                case  10:{
                    break;
                }
                default:
                    break;
            }
        } while (choose != 0);
    }
}
