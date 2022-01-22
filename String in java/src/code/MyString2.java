package code;

public class MyString2 {
    public static void main(String[] args) {
        String c = "Con";
        String m = "Meo";

        // nối chuỗi thông thường
        String s1 = c + m;
        // concat() => hàm string nổi chuỗi
        String s2 = c.concat(m);
        System.out.println(s1);

        // replace() => thay thế chuỗi, ko thay đổi chuỗi gốc mà phải gán vào đối tượng mới.
        String s3 = "Cat.VN";
        String s4 = s3.replace("Cat","Meo");
        System.out.println("Thay thế Cat.VN =>  "+s4);

        System.out.println("---------------------------");
        String s5 ="lY ThAnH LoNg";
        System.out.println("Chuỗi chưa sửa: "+s5);

        //toUpperCase() viết hoa toàn bộ chuỗi
        String s6 = s5.toUpperCase();
        System.out.println("toUpperCase => " +s6);

        // toLowerCase() viết thường toàn bộ chuỗi.
        String s7 = s5.toLowerCase();
        System.out.println("toLowerCase => "+s7);

        // trim() xóa khoản trắng giữa 2 đầu String
        System.out.println("---------------------------");
        String s8 ="   ly thanh long     ";
        System.out.println("s8: "+s8);
        System.out.println("s8.trim() => "+s8.trim());

        // subString(); (bắt đầu, kết thúc)  => cắt chuỗi
        System.out.println("---------------------------");
        String s9 = "Ly Thanh Long";
        String s10 = s9.substring(2);
        String s11 = s9.substring(2,6);
        System.out.println("chuỗi chưa cắt: "+s9);
        System.out.println("chuỗi sau khi căt !");
        System.out.println("subString(2) => "+s10);
        System.out.println("subString(2, 6) => "+s11);


    }
}
