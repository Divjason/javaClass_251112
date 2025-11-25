package method;

public class Method2 {
    public static void main(String[] args) {
        // 특정 기능을 구현할 수 있는 함수를 하나 생성해놓고, 필요할 때마다
        // 함수가 처리할 수 있는 인자값(매개변수)만 교체해서 사용!

        int sum1 = add(5, 10); // 메서드 함수를 호출!!! 인자값 = 인수
        System.out.printf("결과1 출력 : %d\n", sum1);

        int sum2 = add(15, 20); // 메서드 함수를 호출!!!
        System.out.printf("결과2 출력 : %d", sum2);
    }

    // add 함수 = 메서드를 선언했다. 매개변수
    public static int add(int a, int b) {
        System.out.printf("%d + %d = 연산수행\n", a, b);
        int sum = a + b;
        return sum;
    }
}
