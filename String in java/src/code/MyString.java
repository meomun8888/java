package code;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine();
        System.out.println("-------------");

        //length => lấy độ dài của chuỗi
        System.out.println("Độ dài của chuỗi: "+s.length());

        //charAt() => lấy ra ký tự vị trí bất kỳ của chuỗi > 0 < length
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Vị trí: " + i +" = "+ s.charAt(i));
        }

        //getChars(bắt đầu, kết thúc, mảng lưu, vị trí mới lưu từ x);
        char[] arrayChar = new char[100];
        s.getChars(0,5,arrayChar,0); // => copy chuyên phần tử
        System.out.println("Copy từng phần tử vào mảng mới: ");
        for (int i = 0 ; i < arrayChar.length; i ++){
            System.out.println("Vi tri: "+ i + " = "+arrayChar[i]);
        }

        //getByte  => lấy giá trị thành thành 1 mảng, chuyển chuỗi thành số ASCII
        System.out.println("Chuyển chuỗi sang mã ASCII");
        byte []ascii = s.getBytes();
        int i = 0;
        for (byte a: ascii) {
            System.out.println(s.charAt(i) +" to ASCII: "+a);
            i++;
        }
    }
}
