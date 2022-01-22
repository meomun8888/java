/* TODO: 02/12/2021
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
import java.util.Scanner;

public class CreateFile2 {
    private File file;

    public CreateFile2(String nameFile) {
        this.file = new File(nameFile);
    }

    public boolean kiemThucThi() {
        return this.file.canExecute();
    }

    public boolean checkRead() {
        return this.file.canRead();
    }

    public boolean checkWirte() {
        return this.file.canWrite();
    }

    public void getPath() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void getNameFile() {
        System.out.println(this.file.getName());
    }

    public void checkFileOrFolder() {
        if (this.file.isFile()) {
            System.out.print("File");
        } else if (this.file.isDirectory()) {
            System.out.print("Folder");
        }
    }

    public void printListFolder() {
        if (this.file.isDirectory()) {
            File[] listFile = this.file.listFiles();
            for (File file : listFile) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Error, not Folder");
        }
    }

    public void printTreeFolder() {
        this.printFolder(this.file,1);

    }

    private void printFolder(File f, int leve) {
        for (int i = 0; i < leve; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] listFile = f.listFiles();
            for (File fx : listFile) {
                printFolder(fx,leve + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên File: ");
        String nameFile = sc.nextLine();
        CreateFile2 cr = new CreateFile2(nameFile);
        int choose = 0;
        do {
            System.out.println("\n----------Menu----------------");
            System.out.println("1. kiểm tra file có thể thực thi.");
            System.out.println("2. kiểm tra file có thể dọc.");
            System.out.println("3. kiểm tra file có thể ghi.");
            System.out.println("4. In đường dẫn.");
            System.out.println("5. In tên file.");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin.");
            System.out.println("7. In ra danh sách file con.");
            System.out.println("8. In ra cây thư mục.");
            System.out.println("0. Thoat");
            System.out.println("Bạn chọn: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.print("kiểm tra file có thể thực thi: " + cr.kiemThucThi());
                    break;
                }
                case 2: {
                    System.out.println("kiểm tra file có thể dọc: " + cr.checkRead());
                    break;
                }
                case 3: {
                    System.out.println("kiểm tra file có thể viết: " + cr.checkWirte());
                    break;
                }
                case 4: {
                    System.out.println("In dường dẫn: ");
                    cr.getPath();
                    break;
                }
                case 5: {
                    System.out.println("Lấy tên file: ");
                    cr.getNameFile();
                    break;
                }
                case 6: {
                    System.out.println("Kiểm tra là thư mục hoặc tập tin: ");
                    cr.checkFileOrFolder();
                    break;
                }
                case 7: {
                    System.out.println("Tất cả các file con: ");
                    cr.printListFolder();
                    break;
                }
                case 8:{
                    cr.printTreeFolder();
                }
                default:
                    System.out.println("Nhap lai");
            }
        } while (choose != 0);
    }
}