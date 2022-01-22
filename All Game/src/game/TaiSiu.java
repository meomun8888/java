package game;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/* TODO: 03/11/2021 game tai xiu
 *  Tung 3 cục xí ngầu x1,x2,x3 mỗi cục có giá trị từ 1 đến 6.
 *   + Nếu tổng = (3 || 18) nhà cái ăn hết.
 *   Người chơi có 2 lựa chọn tài và xỉu.
 *   + Nếu tổng = (4 -> 10) -> Xỉu, người chơi chọn xỉu sẽ thắng và ngược lại sẽ thua.
 *   + Nếu tổng = (11 -> 17) -> Tài, người chơi chọn taì sẽ thắng và ngược lại sẽ thua.
 * */
public class TaiSiu {
    private double playerMoney = 5000000;
    private Random x1 = new Random();
    private Random x2 = new Random();
    private Random x3 = new Random();
    private int xx1;
    private int xx2;
    private int xx3;

    private int sum() {
        xx1 = xx2 = xx3 = 0;
        xx1 = x1.nextInt(5) + 1;
        xx2 = x1.nextInt(5) + 1;
        xx3 = x1.nextInt(5) + 1;
        int x = xx1 + xx2 + xx3;
        return x;
    }

    public void game() {
        Scanner sc = new Scanner(System.in);
        Locale country = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(country);
        int choose;
        do {
            System.out.println("Mời bạn chọn Game ");
            System.out.println("1. Tài xỉu ");
            System.out.println("2. Thoat ");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    do {
                        System.out.println("Chào Mừng bạn đến với game Tài Xỉu !");
                        System.out.println("Số dư tài khoản của bạn: " + numberFormat.format(playerMoney));
                        if (playerMoney == 0) {
                            System.out.println("Tài khoản của bạn không đủ để tiếp tục chơi Game !");
                        } else {
                            int choose_player;
                            do {
                                if(playerMoney == 0.0){
                                    break;
                                }
                                System.out.println("Ván này bạn muốn cược\n1.Tài\n2.xỉu\n3.Thoát !");
                                choose_player = sc.nextInt();
                                switch (choose_player) {
                                    case 1: {
                                        double money;
                                        do {
                                            System.out.println("Số tiền cược: ");
                                            money = sc.nextDouble();
                                            if (money > playerMoney) {
                                                System.out.println("Bạn ơi, tiền cược phải nhỏ hơn tiền gôc: " + playerMoney);
                                            }
                                        } while (money > playerMoney);

                                        int xxx = sum();
                                        if (xxx == 3 || xxx == 18) {
                                            System.out.println(xx1 + " - " + xx2 + " - " + xx3 + " => " + xxx);
                                            playerMoney -= money;
                                            System.out.println("Bạn thua, 3 hoặc 18 nhà cài ăn hết !!!");
                                        } else if (xxx >= 11 && xxx <= 17) {
                                            System.out.println("Kết quả: " + xx1 + " - " + xx2 + " - " + xx3 + " = " + xxx + " => Tài");
                                            System.out.println("Bạn chọn: Tài");
                                            System.out.println("Chúc mừng bạn đã thắng !!!");
                                            System.out.println("Tiền bạn nhận được: " + numberFormat.format(money));
                                            playerMoney += money;
                                            System.out.println("Số tiền gốc của bạn đã tăng lên: " + numberFormat.format(playerMoney));
                                        } else {
                                            System.out.println("Kết quả: " + xx1 + " - " + xx2 + " - " + xx3 + " = " + xxx + " => Xỉu");
                                            System.out.println("Bạn chọn: Tài");
                                            System.out.println("Bạn đã thua !!!");
                                            System.out.println("Tiền bạn bị trừ: " + numberFormat.format(money));
                                            playerMoney -= money;
                                            System.out.println("Số tiền gốc của bạn giảm xuống: " + numberFormat.format(playerMoney));
                                            if (playerMoney != 0.0){break;}
                                        }
                                        break;
                                    }
                                    case 2: {
                                        double money;
                                        do {
                                            System.out.println("Số tiền cược: ");
                                            money = sc.nextDouble();
                                            if (money > playerMoney) {
                                                System.out.println("Bạn ơi, tiền cược phải nhỏ hơn tiền gôc: " + numberFormat.format(playerMoney));
                                            }
                                        } while (money > playerMoney);

                                        int xxx = sum();
                                        if (xxx == 3 || xxx == 18) {
                                            System.out.println(xx1 + " - " + xx2 + " - " + xx3 + " => " + xxx);
                                            playerMoney -= money;
                                            System.out.println("Bạn thua, 3 hoặc 18 nhà cài ăn hết !!!");
                                        } else if (xxx >= 4 && xxx <= 10) {
                                            System.out.println("Kết quả: " + xx1 + " - " + xx2 + " - " + xx3 + " = " + xxx + " => Xỉu");
                                            System.out.println("Bạn chọn: Xỉu");
                                            System.out.println("Chúc mừng bạn đã thắng !!!");
                                            System.out.println("Tiền bạn nhận được: " + numberFormat.format(money));
                                            playerMoney += money;
                                            System.out.println("Số tiền gốc của bạn đã tăng lên: " + numberFormat.format(playerMoney));
                                        } else {
                                            System.out.println("Kết quả: " + xx1 + " - " + xx2 + " - " + xx3 + " = " + xxx + " => Tài");
                                            System.out.println("Bạn chọn: Xỉu");
                                            System.out.println("Bạn đã thua !!!");
                                            System.out.println("Tiền bạn bị trừ: " + numberFormat.format(money));
                                            playerMoney -= money;
                                            System.out.println("Số tiền gốc của bạn giảm xuống: " + numberFormat.format(playerMoney));
                                            if (playerMoney != 0.0){break;}
                                        }
                                        break;
                                    }
                                    default:
                                        break;
                                }
                            } while (choose_player != 3);
                        }
                    } while (playerMoney != 0);
                    break;
                }
                default:
                    break;
            }
        } while (choose != 2);
    }

    public static void main(String[] args) {
        TaiSiu x = new TaiSiu();
        x.game();

    }
}
