package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 2라는 값을 가지고 있다, 가정
        // 3이라는 값을 가지고 있다, 가정

        // 해당 값이 짝수 라면, "해당 숫자는 짝수 입니다."
        // 해당 값이 홀수 라면, "해당 숫자는 홀수 입니다."
        
        // 집에가서 3회독
        // 1회 : 코드 따라서 입력
        // 2회 : 가급적 보지 않고 스스로 입력 노력
        // 3회 : 아예 보지 않고 입력
        // + @ 2회
        // 안보고 입력 + 머리속으로 스스로 본인에게 설명

        int x = 996;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
