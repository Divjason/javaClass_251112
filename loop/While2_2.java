package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;
        
        // 기저조건
        // 반복문이 언젠가는 특정 조건에 맞아서 종결(료)
        // 효과적으로 컴퓨터 메모리 공간 사용!!

        while(i <= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum =" + sum);
            i++;
        }
        
        // 프로그래밍 언어 초급 VS 중급자
        // 반복문 > 중첩 반복문 > 백엔드 개발 > DB 설계 > 행 & 열 테이블
        // 중첩 반복문 3단계

//        while(true) {
//            System.out.println("Loop");
//        }
    }
}
