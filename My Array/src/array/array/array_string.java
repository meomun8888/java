package array.array;

import java.util.Arrays;

// TODO: 03/11/2021 chuyển chuỗi thành mảng hàm split()
public class array_string {
    public static void main(String[] args) {
        String name = "Ly Thanh Long";
        //cắt từng phần tử thông qua khoản trắng.
        String[] a = name.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("vi tri " + i + " = " + a[i]);
        }
        System.out.println(Arrays.toString(a));
        //cắt từng phần tử thông qua dấu "," .
        String test = "Hello, I'm Long, I'm from Gia Lai";
        String [] result = test.split(",");
        System.out.println(Arrays.toString(result));

        //cắt từng phần tử thông qua dấu "," và "."
        String test2 = "Hello. I'm, Long. I'm. from, Gia Lai";
        String [] result2 = test2.split("\\,|\\.");
        System.out.println(Arrays.toString(result2));

        // lấy tên.
        String name2 = "Đinh Thị Sen";
        String []result3 = name2.split(" ");
        System.out.println(Arrays.toString(result3));
        System.out.println("Name: "+(result3[result3.length - 1]));
    }
}
