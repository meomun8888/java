package test;

import model.CountNumber;
import view.CountNumberView;

public class Test {
    public static void main(String[] args) {
        CountNumber cn = new CountNumber();
        cn.incresment();
        cn.incresment();
        System.out.println(cn.getValue());
        cn.reset();
        System.out.println(cn.getValue());

        CountNumberView cv = new CountNumberView();

    }
}
