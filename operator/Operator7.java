package operator;

public class Operator7 {
    public static void main(String[] args) {
        /*
        = -> 이것은 비교가 아님! 우항값을 좌항에 할당!
        == -> 같음의 여부 판단
        >
        <
        >=
        <=
        */
        int a = 2;
        int b = 3;

        System.out.println(a == b); // 정수 비교 시, ==
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

    }
}
