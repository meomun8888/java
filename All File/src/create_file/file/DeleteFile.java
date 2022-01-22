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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {

    //cài dặt lại hàm xóa file.
    public static void deleteFilex(File f){
        // nếu là file thì xóa
        System.out.println("Delete: "+f.getAbsolutePath());
        if(f.isFile()){
            f.delete();
        }else if(f.isDirectory()){
            // lấy các folder con.
            File [] element = f.listFiles();
            for(File fx : element) deleteFilex(fx);
            f.delete();
        }
    }
    public static void deleteFilex2(File f){
        if(f.isFile()){
            Path p = f.toPath();
            try {
                Files.deleteIfExists(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(f.isDirectory()){
            File [] s =  f.listFiles();
            for (File fx: s){
                deleteFilex2(fx);
            }
            Path p = f.toPath();
            try {
                Files.deleteIfExists(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        File f1 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder");
        File f2 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\MyFolder2");
        File f3 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\MyFolder2\\MyFolder3");
        File f4 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\vidu.cpp");
        File f5 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\MyFolder2\\MyFolder3\\Test");

        f1.mkdir();
        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        f5.mkdirs();
        DeleteFile dl = new DeleteFile();
        dl.deleteFilex(f1);
        dl.deleteFilex2(f1);
//        try {
//            f4.createNewFile();
//        } catch (IOException e) {
//            // ko co duong dan
//            // o cung day
//            // ko co quyen tao file
//            e.printStackTrace();
//        }
//        f5.mkdirs();
//        // Xoá thư mục rỗng và các file ko phải folder.
//        f5.deleteOnExit();
//        // Xóa được file txt (ko xóa được khi file đó đang mở)
//        //f4.deleteOnExit();
//        f4.mkdir();
//        // delete() tra về giá trị true || false, xóa được file( true), không xóa được false.
//        System.out.println(f4.delete());

        /*    Sử dụng class Files để xóa
              deleteIfExists( )  xóa từng mục ko thể xóa folder có phần tử.
        *  */

//        Path p = f1.toPath();
//        try {
//            Files.deleteIfExists(p);
//        } catch (IOException e) {e.printStackTrace();
//        }
    }
}
