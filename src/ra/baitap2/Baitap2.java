package ra.baitap2;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    sc.nextLine();
                    break;
                case 2:
                    // hiển thị tam giác vuông theo menu
                        System.out.println("a. Trên cùng bên trái (top-left) \n" +
                                "b. Trên cùng bên phải( top-right)\n" +
                                "c. Dưới cùng bên trái( bottom-left) \n" +
                                "d. Dưới cùng bên phải(bottom-right)\n");
                        System.out.println("nhập lựa chọn của bạn");
                        String next = sc.nextLine();
                        switch (next) {
                            case "a":
                                sc.nextLine();
                                break;
                            case "b":
                                sc.nextLine();
                                break;
                            case "c":
                                sc.nextLine();
                                break;
                            case "d":
                                sc.nextLine();
                                break;
                            default:
                                System.out.println("nhập lại");

                        }
                    break;
                case 3:
                    sc.nextLine();
                    break;
                case 4:
//                    System.exit(0);
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("nhập không hợp lệ");
            }

            if (choice == 4){
                break;
            }
        }
        // nothing
    }
}
