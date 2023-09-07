import java.math.BigDecimal;
import java.util.Scanner;

public class baiTapZalo {
    public static void main(String[] args) {
//       Bài 1  Kiểm tra số nguyên tố
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào một số nguyen bất kỳ :");
//        int a = inputNumber.nextInt();
//        Cách thứ 1
//        int count = 0;
//        for (int i = 1; i <=a; i++) {
//            if (a%i == 0){
//                count ++;
//            }
//        }
//        if (count<3) {
//            System.out.println("Đây là số nguyên tố");
//        } else {
//            System.out.println("Đây không phải là số nguyên tố");
//        }

        // Cách thu 2 :
//        boolean flag = false;
//        for (int i = 2; i <a; i++) {
//            if (a%i == 0){
//                flag = true;
//            }
//        }
//        if (flag == true) {
//            System.out.println("Đây không phải là số nguyên tố");
//        } else {
//            System.out.println("Đây  là số nguyên tố");
//        }

//       Bài 2 Ứng dụng tính tiền lãi cho vay
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Xin mời nhập vào số tiền bạn muốn gửi :");
//        double mount = inputNumber.nextDouble();
//        System.out.println("Xin mời nhập vào lãi suất tháng :");
//        double interest = inputNumber.nextDouble();
//        System.out.println("Xin mời nhập vào số tháng  bạn muốn gửi :");
//        double month = inputNumber.nextDouble();
//        double totalInterest = 0;
//        for (int i = 1; i <= month; i++) {
//            totalInterest += mount*(interest/1200)*month;
//        }
//
//
//        System.out.println("Lãi suất mà bạn gửi với số tiền " + new BigDecimal(mount).toPlainString() + " với số tháng là " + month + "với số " +
//                "lãi suất là " + interest + " là : " + new BigDecimal(totalInterest).toPlainString());

        // Bài 3 đếm 20 số nguyên tố đầu tiên;
//            int countPrime = 0;
//        for (int i = 2;i>=2; i++) {
//            int count = 0;
//            for (int j = 1; j <=i; i++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//
//            if (count <3) {
//                countPrime ++;
//                System.out.println("số nguyên tố là : " + i);
//            }
//            if (countPrime == 20)
//                break;
//
//        }
            // Kiểm tra từ 2 đến 100 có bao nhiêu số nguyên tố:
//        for (int i = 2; i <=100; i++) {
//            boolean flag = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j ==0) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == false) {
//                System.out.println("So nguyên tố là : " +i);
//            }
//        }

//        int countPrime = 0;
//        for (int i = 2; i >=2; i++) {
//            boolean flag = false;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j ==0) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag == false) {
//                countPrime ++;
//                System.out.println("So nguyên tố thứ " +countPrime+ " là : " +i);
//
//            }
//            if (countPrime==20)
//                break;
//        }









    }
}
