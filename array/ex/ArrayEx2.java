package array.ex;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        사용자에게 정수 n개를 입력받으세요. : 1 2 5
        가장 큰 정수 : 5
        가장 작은 정수 : 1
        
        1. 사용자에게 값을 2개 받는다. > 몇 개의 숫자를 입력할 것인지, 앞에서 입력한 숫자 만큼 값을 반복해서 받아야함
        2. Scanner를 선언한다
        3. 반복문을 통해서 계속 비교한다
        4. 비교할 때, 조건문을 통해서 만약 모든 값을 비교한 후 가장 작은 값이라고 생각되면, 미니멈 변수에 할당
        5. 비교할 때, 조건문을 통해서 만약 모든 값을 비교한 후 가장 큰 값이라고 생각되면, 맥시멈 변수에 할당
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.printf("%d개의 정수를 입력하세요 : \n", n);
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.printf("가장 큰 정수 : %d\n", maxNumber);
        System.out.printf("가장 작은 정수 : %d\n", minNumber);
    }
}
