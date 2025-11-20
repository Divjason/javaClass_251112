package example;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 사용자로부터 생년월일 입력받음
        // 사용자가 입력한 생년월일 -> 별자리 제공!
        // 오늘의 운세와 관련한 문장을 제공!!
        // 2000 1 1 -> 물병자리, 운세!

        Scanner sc = new Scanner(System.in);

        String[] fortunes = {
            "오늘은 새로운 도전을 해보세요!",
            "조심해야 할 하루입니다!",
            "예상치 못한 좋은 소식이 있습니다.",
            "평온하고 안정적인 하루를 보낼 수 있어요.",
            "주변 사람들과의 대화에서 기회를 잡을 수 있습니다.",
            "작은 변화가 큰 성과로 이어집니다."
        };

        String zodiac = "";

        System.out.print("생일 월 입력 : ");
        int month = sc.nextInt();

        System.out.print("생일 일 입력 : ");
        int day = sc.nextInt();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) zodiac = "양자리";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) zodiac = "황소자리";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) zodiac = "쌍둥이자리";
        else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) zodiac = "게자리";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) zodiac = "사자자리";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) zodiac = "처녀자리";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) zodiac = "천칭자리";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 22)) zodiac = "전갈자리";
        else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) zodiac = "사수자리";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) zodiac = "염소자리";
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) zodiac = "물병자리";
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) zodiac = "물고기자리";

        int r = (int)(Math.random() * fortunes.length);
        System.out.println(String.format("당신의 별자리는 %s 입니다. 오늘 운세 : %s", zodiac, fortunes[r]));
    }
}
