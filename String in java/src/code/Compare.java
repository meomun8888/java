package code;

// TODO: 30/10/2021 Compare 2 String
public class Compare {
    public static void main(String[] args) {

        // equals() so sánh 2 chuỗi có giống nhau hay không, có phân biệt chữ hoa chữ thường.
        String l = "ly thanh long";
        String l2 = "LY THANH LONG";
        System.out.println(" equals => l = l2: "+l.equals(l2));

        /* equalsIgnoreCase() so sánh nội dung 2 chuỗi có giống nội dung hay không, không phân biệt chữ hoa hay chữ thường
         Nhưng phân biệt khoảng trắng */
        System.out.println("equalsIgnoreCase => l = l2: "+l.equalsIgnoreCase(l2));

        /* compareTo => So sánh  >= <= với 2 chuỗi.
           - Nếu ra trị âm đối tượng a < b.
           - Nếu trả về số 0 thì 2 đối thượng bằng nhau.
           - Nếu trả về số dương đối tượng a > b.
        */
        String sv1 = "Ly Thanh A";
        String sv2 = "Ly Thanh B";
        String sv3 = "ly thanh a";
        System.out.println("compareTo => sv1 vs sv2: "+sv1.compareTo(sv2));
        System.out.println("compareTo => sv1 vs sv3: "+sv1.compareTo(sv3));

        //compareToIgnoreCase so sánh không phân biệt chữ hoa hay chữ thường
        System.out.println("compareToIgnoreCase => sv1 vs sv2: "+sv1.compareToIgnoreCase(sv2));
        System.out.println("compareToIgnoreCase => sv1 vs sv3: "+sv1.compareToIgnoreCase(sv3));

        // startsWith() So sánh ký tự đầu tiên, giá trị trả về true || false.
        String phoneNumber = "0866642xxx";
        System.out.println("startsWith "+phoneNumber.startsWith("086"));

        //endsWith() so sánh ký tự cuối cùng, giá trị trả về true || false.
        System.out.println("endsWith => " +phoneNumber.endsWith("086"));

        // regionMatches() so sánh một đoạn (bắt đầu, chuỗi cần so sánh, bắt đầu tại vị trí, kết thúc tại vị trí);
        String test = "Ly.Thanh.Long";
        String test2 = ".Long";
        boolean check = test.regionMatches(8,test2,0,5);
        System.out.println(check);


    }
}
