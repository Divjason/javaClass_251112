package operator.ex;

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 80;

//        boolean result = score >= 80 && score <= 100;
//        System.out.println(result);

        if (score >= 80) {
            System.out.println("합격했습니다.");
        }

        if (score < 80 ) {
            System.out.println("불합격했습니다.");
        }
        
        // 직관적 & 명시적
        // 3~5명 집단 같이 작업
    }
}
