package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        
        System.out.printf("%d + %d = 연산 수행\n", a, b);
        int sum1 = a + b;
        System.out.printf("결과1 출력 : %d\n", sum1);

        // 계산 2
        int x = 10;
        int y = 20;

        System.out.printf("%d + %d = 연산 수행\n", x, y);
        int sum2 = x + y;
        System.out.printf("결과2 출력 : %d", sum2);

        // 지금의 연산식을 자주 반복적으로 사용한다면, 해당 연산을 처리할 수 있는 무언가를
        // 하나 만들어놓고, 상황에 따라서 변수값만 바꿔주면 어떨까?
    }
}
