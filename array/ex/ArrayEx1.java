package array.ex;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        /*
        사용자에게 5개의 정수를 입력받으세요.
        입력한 정수를 역순으로 출력하는 코드를 작성해주세요!
        > 1, 2, 3, 4, 5 => 무한루프 반복문
        > 5개만 값을 받아도 되는 상황 => 무한루프
        > 값을 받는 행위도 반복 5번만
        */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력 : ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
