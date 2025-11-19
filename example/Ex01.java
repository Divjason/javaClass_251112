package example;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // 랜덤퀴즈
        // 2사람 게임
        // 17 (*컴퓨터)
        // 20 : 작은 숫자
        // 15 : 큰 숫자
        // 16 : 큰 숫자
        // 17 : 정답
        // 일본 오마카세 장인 : 절대 빠르면서 고급스러운 것은 없습니다.

        // 클래스, 프로토타입, 인스턴스
        int answer = (int)(Math.random() * 100) + 1;
        System.out.println(String.format("정답 : %d", answer));
        System.out.println();

        int guess;
        int attemps = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1~100사이의 숫자를 맞혀보세요!");

        while (true) {
            System.out.print("입력 : ");
            guess = sc.nextInt();
            attemps++;

            if(guess > answer) {
                System.out.println("더 작은 수입니다.");
            } else if (guess < answer) {
                System.out.println("더 큰 수입니다.");
            } else {
                System.out.println(String.format("정답! 시도 횟수 : %d", attemps));
                break;
            }
        }
    }
}
