package scanner.ex;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        // 사용자가 값을 원하는 만큼 입력
        // 입력한 값의 전체 합계 값 & 평균값을 출력! 코드
        // -1을 입력한다면, 해당 반복문 종료!

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.");
        while (true) {
            input = scanner.nextInt();

            if (input == -1) {
                break;
            }


        }
    }
}
