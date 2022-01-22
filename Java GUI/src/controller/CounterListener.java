package controller;

import view.CountNumberView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CountNumberView cnv;
    public CounterListener(CountNumberView cnv) {
        this.cnv = cnv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("nnn");
    }
}
