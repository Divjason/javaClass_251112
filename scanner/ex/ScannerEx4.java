package scanner.ex;
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        /*
        1.사용자로부터 상품 정보 입력 (상품명, 가격, 수량)
        2.해당 상품 총 가격을 출력하는 프로그래밍 코드를 작성!
        3.언제라도 상품을 추가할 수 있음.
        4.프로그램을 언제라도 종료할 수 있음.
        */
        
        while(true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료 = ");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                System.out.printf("상품명 %s, 가격 %d, 수량 %d, 합계금액 %d\n", product, price, quantity, price * quantity);
            } else if (option == 2) {
                System.out.printf("총 비용 : %d\n", totalCost);
            } else if (option ==3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
