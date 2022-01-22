/* TODO: 02/12/2021
   Class java.io.PrintWriter => hỗ trợ ghi file

   class này có thể cho chung ta thao tác với temirnal, với nhiều bảng mãng UTF-8.

   println(x) gi dữ liệu bất kỳ xong mới dùng flush().
   flush () đẩy dữ liệu xuống file.
   close () đóng file. ! có mở phải có đong.
 */
package create_file.write_read_file;

import java.io.*;

public class Write {
    public static void main(String[] args) {

//        File f = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder");
//        f.mkdir();
//        File fx = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\Input.txt");
//        try {
//            fx.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {

            PrintWriter pw = new PrintWriter("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\Input.txt", "UTF-8");
            pw.println("Hello meo");
            pw.print("11/12/2001");
            pw.print(" ");
            pw.println("ĐÓ là ngày sinh nhật của tui");
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
