package example;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0, lose = 0, draw = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("가위(0), 바위(1), 보(2) 중 선택 : ");

            int user = sc.nextInt();
            int com = (int)(Math.random() * 3);

            System.out.println(String.format("컴퓨터 : %d", com));

            if(user == com) {
                System.out.println("비겼습니다.");
                draw++;
            } else if((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
                System.out.println("이겼습니다.");
                win++;
            } else {
                System.out.println("졌습니다.");
                lose++;
            }
        }
        System.out.println(String.format("최종결과: %d 승 %d 패 %d 무", win, lose, draw));
    }
}
