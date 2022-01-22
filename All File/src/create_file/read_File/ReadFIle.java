/* TODO: 02/12/2021
   class BufferedReader  =>  giup đọc file.
   readLine() đọc từng giòng.
*/

package create_file.read_File;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadFIle {
    public static void main(String[] args) {

        //cach 1
//        File f = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\Input.txt");
//
//
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line  = null;
//            while (true){
//                // đọc từng giòng 1
//                line = br.readLine();
//                if(line == null){
//                    break;
//                }else {
//                    System.out.println(line);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Cach 2.

        File f2 = new File("D:\\Programming Language\\Code For Window\\Java\\All File\\MyFolder\\image_1.txt");

        try {
            List<String> ls = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for (String line: ls) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}