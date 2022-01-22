package view2;

import javax.swing.*;

public class FlowLayout extends JFrame {
    public FlowLayout(){
        this.setTitle("Layout");
        this.setSize(600,400);
        // giữa màn hình
        this.setLocationRelativeTo(null);

        //set Layout có thể căn chỉnh vị trí của button
        java.awt.FlowLayout layout = new java.awt.FlowLayout();
        java.awt.FlowLayout layout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        java.awt.FlowLayout layout3 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10,10);
//        this.setLayout(layout);
//        this.setLayout(layout2);
        this.setLayout(layout3);

        JButton jButton = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");

        //add phần tử.
        this.add(jButton);
        this.add(jButton2);
        this.add(jButton3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayout();
    }
}
