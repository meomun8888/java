// TODO: 30/11/2021
/*
   canExecute()  kiêm có phải thực thi hay không exe, java,..
   canWirte() kiểm tra file có viết được không.(true || false)
   canRead() kiểm tra file có đọc được không.(true || false)
   getAbsolutePath() lấy đường dẫn của file. (true || false)
   getName() lấy tên file || folder.
   isFile() kiêm tra có phải file hay không. (true || false)
   isDirectory() kiểm tra có phải folder hay không. (true || false)
   exists() file có tồn tại chưa.
   mkdir() tạo Folder, nêu file tồn tại rồi thì ko thay đổi file cũ(ko tạo)
   mkdirs() tạo nhiều Folder.
   creaeNewFile(), tạo file (cpp,java,txt,docx,...) nhưng phải để trong try{ }cath{ }

   deleteOnExit() xóa được thư mục rỗng và các file khác( nếu file đó mở sẽ ko xóa đc).
   delete() xóa file hoặc folder đồng thời trả về kết quả true or false,nếu xóa được(true) ko xóa được (false).


*/
package create_file.file;
import java.io.File;
import java.io.IOException;

public class Create_File {
    public static void main(String[] args) {

       // true
        File f = new File("D:\\Programming Language\\Code For Window\\Java\\All File");
        System.out.println(f.exists());

        //false
        File f2 = new File("D:\\Programming Language\\Code For Window\\Java\\All File1");
        System.out.println(f2.exists());

       // tao thu muc MyFolder
        File  fx = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder");
        fx.mkdir();

        //tao nhieu thu muc
        File f3 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\MyFolder2\\MyFolder3");
        f3.mkdirs();

            // tao tap tin: .exe,txt,doc,xls ... phai de trong try {}cath
        File f4 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\vidu.txt");
        try {
            f4.createNewFile();
        } catch (IOException e) {
            // ko co duong dan
            // o cung day
            // ko co quyen tao file
            e.printStackTrace();
        }

    }
}
