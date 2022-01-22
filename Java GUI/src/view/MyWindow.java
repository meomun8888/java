package view;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {
    }

    public void showIt(){
        this.setVisible(true);
    }
    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showIt(String title,int width, int height){
        this.setLocation(500,250);
        this.setTitle(title);
        this.setSize(width,height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
