package example;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        1. 입금
        2. 출금
        3. 잔액조회
        0. 종료
        */

        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while(true) {
            System.out.println("==== ATM 메뉴 ====");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액조회");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("입금액 : ");
                int desposit = sc.nextInt();
                balance += desposit;
                System.out.println(String.format("%d원 입금완료", desposit));
            } else if (menu == 2) {
                System.out.print("출금액 : ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(String.format("%d원 출금완료", withdraw));
                } else {
                    System.out.println(String.format("잔액부족"));
                }
            } else if (menu == 3) {
                System.out.println(String.format("현재잔액 : %d원", balance));
            } else if (menu == 0) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
