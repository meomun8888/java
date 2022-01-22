package view;

import controller.CounterListener;
import model.CountNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CountNumberView extends JFrame {
    private CountNumber countNumber;
    private JButton jButton_up,jButton_down;
    private JLabel jLabel_value;

    public CountNumberView()  {
        this.countNumber = new CountNumber();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Count Number");
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);


        jButton_up = new JButton("up");
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("down");
        jButton_down.addActionListener(ac);

        jLabel_value = new JLabel(this.countNumber.getValue()+"",JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up,BorderLayout.WEST);
        jPanel.add(jLabel_value,BorderLayout.CENTER);
        jPanel.add(jButton_down,BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
    }
}
