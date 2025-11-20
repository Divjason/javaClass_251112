package scanner.ex;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        /*
        사용자로부터 음식이름을 하나 받아주세요. 햄버거
        그리고 해당 음식의 값도 하나 받아주세요. 5000
        그리고 마지막으로 주문하고자 하는 음식의 갯수를 받아주세요. 4

        > 최종적으로 이렇게 문장이 출력될 수 있도록 해주세요.
        > "햄버거 4개를 주문하셨습니다. 총 금액은 20000원 입니다."
        */

        Scanner input = new Scanner(System.in);

        System.out.print("음식이름을 입력하세요 : ");
        String foodName = input.nextLine();

        System.out.print("음식가격을 입력하세요 : ");
        int foodPrice = input.nextInt();

        System.out.print("음식수량을 입력하세요 : ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d 입니다.", foodName, foodQuantity, totalPrice);
    }
}
