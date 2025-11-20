package scanner.ex;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) System.out.printf("입력한 숫자 : %d은 짝수 입니다.", number);
        else System.out.printf("입력한 숫자 : %d은 홀수 입니다.", number);
    }
}
