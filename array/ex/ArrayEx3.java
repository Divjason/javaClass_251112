package array.ex;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        /*
        1. 사용자로부터 몇 명의 학생수를 입력할 것인지 정수로 입력받으세요. n / 3
        2. n명의 학생들의 국어, 영어, 수학 점수를 각각 입력받으세요.
        3. n명의 학생들의 국어, 영어, 수학 점수의 총점과 평균을 출력해주는 코드를 작성하세요.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균" + average);
        }
    }
}
