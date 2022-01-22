package view;

import javax.swing.*;

public class View {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        // Đặt tên
        jFrame.setTitle("Hello");

        // Đặt kích thước.
        jFrame.setSize(600, 400);

        // Gắn vị trí hiện thị
        jFrame.setLocation(500,300);

        //jFrame.EXIT_ON_CLOSE thoát ra khỏi chương trình khi đóng của sổ.
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        // hiện thị cửa sổ
        jFrame.setVisible(true);
    }
}
