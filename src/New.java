import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd;
        int change;
        System.out.println("Chon 1 de chuyen tu VND sang USD" + "\n" + "chon 2 de chuyen tu USD sang VND");
        System.out.println("Nhap so(chon 1 hoac 2) :");
        change = scanner.nextInt();
        if (change == 1) {
            System.out.println("Nhap so tien (VND) :");
            vnd = scanner.nextDouble();
            System.out.println("So tien chuyen sang USD la :" + vnd / 23000 + "USD");
        }
        if (change == 2) {
            System.out.println("Nhap so tien (USD) :");
            usd = scanner.nextDouble();
            System.out.println("So tien chuyen sang VND la :" + usd * 23000 + "USD");
        } else {
            System.out.println("sai");
        }
    }
}


//        int year;
//        System.out.println("Nhap nam ");
//        year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d là năm nhuận", year);
//                } else {
//                    System.out.printf("%d là năm không nhuận", year);
//                }
//            } else {
//                System.out.printf("%d là năm nhuận", year);
//            }
//        } else {
//            System.out.printf("%d là năm không nhuận", year);
//        }
