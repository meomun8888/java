package code;

public class SearchString {
    public static void main(String[] args) {
        String s = "Hello Chu Meo, Be Meo";
        String s2 = "Meo";

        //indexOf() tim từ trái qua phải và trả về vị trí đầu tiên tìm thấy
        // có thể dung bước nhảy để kiểm tra từ tìm kiếm tại vị trí tiếp theo.

        System.out.println("Tìm từ trái qua phải !!");
        System.out.println("s.indexOf(s2) => vị trí 'Meo': "+s.indexOf(s2));
        System.out.println("s.indexOf(s2,11) => vị trí 'Meo' tiếp theo: "+s.indexOf(s2,11));

        //lastindexOf() tìm từ phải qua trái trả về vị trí đầu tiền khi tìm thấy từ khóa.
        // có thể dung bước nhảy để kiểm tra từ tìm kiếm tại vị trí tiếp theo.
        System.out.println("Tìm từ phải qua trái !!!");
        System.out.println("s.lastIndexOf(s2) => vị trí 'Meo': "+s.lastIndexOf(s2));
        System.out.println("s.lastIndexOf(s2,17) => vị trí 'Meo' tiếp theo: "+s.lastIndexOf(s2,17));
    }
}
