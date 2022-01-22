package basic;

import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Nhap Gia Tri khong dung !");
        }
        System.out.println("gia tri Nhap la : "+n);
    }
}
