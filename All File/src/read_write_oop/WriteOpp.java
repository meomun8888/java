package read_write_oop;

import java.io.*;
import java.util.ArrayList;

public class WriteOpp {
    private File file;

    public WriteOpp(File file) {
        this.file = file;
    }
    public void WriteOOP(ArrayList[] st){
        try {
            file.createNewFile();
            OutputStream os = new FileOutputStream(file);
            ObjectOutput oos = new ObjectOutputStream(os);
          for (ArrayList fi : st){
              oos.writeObject(fi);
              oos.flush();
          }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
