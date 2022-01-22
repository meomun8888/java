package calculator;
/* JPanel vật chứa gom nhóm nhiều loại layout */
import javax.swing.*;
import java.awt.*;

public class Mycalculator extends JFrame {
    public Mycalculator() {
        this.setTitle("Calculator");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        JButton j_0 = new JButton("0");
        JButton j_1 = new JButton("1");
        JButton j_2 = new JButton("2");
        JButton j_3 = new JButton("3");
        JButton j_4 = new JButton("4");
        JButton j_5 = new JButton("5");
        JButton j_6 = new JButton("6");
        JButton j_7 = new JButton("7");
        JButton j_8 = new JButton("8");
        JButton j_9 = new JButton("9");
        JButton j_cong = new JButton("+");
        JButton j_tru = new JButton("-");
        JButton j_nhan = new JButton("*");
        JButton j_chia = new JButton("/");
        JButton j_bang = new JButton("=");


        // gán vị trí trên cùng khung JPanel
        JPanel jPanel_head = new JPanel();
        // tạo trường nhập văn bản
        JTextField jTextField = new JTextField(50);
        // chon layout hiển thị
        jPanel_head.setLayout(new BorderLayout());
        // thêm vào khung
        jPanel_head.add(jTextField, BorderLayout.CENTER);


        // tạo khung gom button
        JPanel JPanelButton = new JPanel();
        JPanelButton.setLayout(new GridLayout(5, 3));
        JPanelButton.add(j_0);
        JPanelButton.add(j_1);
        JPanelButton.add(j_2);
        JPanelButton.add(j_3);
        JPanelButton.add(j_4);
        JPanelButton.add(j_5);
        JPanelButton.add(j_6);
        JPanelButton.add(j_7);
        JPanelButton.add(j_8);
        JPanelButton.add(j_9);
        JPanelButton.add(j_cong);
        JPanelButton.add(j_tru);
        JPanelButton.add(j_nhan);
        JPanelButton.add(j_chia);
        JPanelButton.add(j_bang);

        // tao layout mới và gom 2 JPanel nhập và JPanel button thành 1
        this.setLayout(new BorderLayout());
        //set jPanel_head, kiểu layout BorderLayout gán lên phía trên JPanel
        this.add(jPanel_head, BorderLayout.NORTH);
        //set JpaneButton, kiểu layout BorderLayout gán ở giữa JPanel
        this.add(JPanelButton, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            //hiển thị theo hệ điều hành Mặc định.
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Mycalculator();
        } catch (Exception e) {
        }
    }
}
