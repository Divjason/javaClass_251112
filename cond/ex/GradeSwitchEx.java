package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        // grade A -> 탁월한 성과입니다.
        // grade B -> 좋은 성과입니다.
        // grade C -> 준수한 성과입니다.
        // grade D -> 향상이 필요합니다.
        // grade F -> 불합격입니다.
        // 나머지 -> 잘못된 학점입니다.
        // 우리의 학점은 B라고 가정, 값이 출력될 수 있도록 코드를 작성!

        String grade = "G";

//        if(grade == "A") System.out.println("탁월한 성과입니다.");
//        else if (grade == "B") System.out.println("좋은 성과입니다.");

        switch (grade) {
            case "A" :
                System.out.println("탁월한 성과입니다.");
                break;
            case "B" :
                System.out.println("좋은 성과입니다.");
                break;
            case "C" :
                System.out.println("준수한 성과입니다.");
                break;
            case "D" :
                System.out.println("향상이 필요합니다.");
                break;
            case "F" :
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
