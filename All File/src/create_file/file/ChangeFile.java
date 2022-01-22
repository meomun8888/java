/* TODO: 02/12/2021

   canExecute()  kiêm có phải thực thi hay không exe, java,..
   canWirte() kiểm tra file có viết được không.(true || false)
   canRead() kiểm tra file có đọc được không.(true || false)
   getAbsolutePath() lấy đường dẫn của file. (true || false)
   getName() lấy tên file || folder.
   isFile() kiêm tra có phải file hay không. (true || false)
   isDirectory() kiểm tra có phải folder hay không. (true || false)
   exists() file có tồn tại chưa.

                            *_Tạo file_*
   mkdir() tạo Folder, nêu file tồn tại rồi thì ko thay đổi file cũ(ko tạo)
   mkdirs() tạo nhiều Folder.
   creaeNewFile(), tạo file (cpp,java,txt,docx,...) nhưng phải để trong try{ }cath{ }
                           *_Xóa file_*
   deleteOnExit() xóa được thư mục rỗng và các file khác( nếu file đó mở sẽ ko xóa đc).
   delete() xóa file hoặc folder đồng thời trả về kết quả true or false,nếu xóa được(true) ko xóa được (false).

                          *_Di chuyển file_*

 */
package create_file.file;

import java.io.File;

public class ChangeFile {

    public static void main(String[] args) {

        File f1 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\vidu.cpp");
        File f2 = new File(".x.txt");
        f2.delete();
    }
}
