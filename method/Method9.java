package method;

public class Method9 {
    public static void main(String[] args) {
        // add 메서드 함수를 선언 : a, b => 2개의 정수를 더할 수 있는 기능
        // add 메서드 함수를 선언 : a, b, c => 3개의 정수를 더할 수 있는 기능
        // 더하기 기능 => 동일한 이름의 메서드 함수
        // 오버로딩 (overloading) : 과적 => 과하게 적재한다

        // *오버로딩을 허용하는 경우
        // add(int a, int b) { } => a + b
        // add(int a, int b, int c) { } => a + b + c
        // add(double a, double b) { } => a + b

        // *오버로딩을 불허하는 경우
        // int add(int a, int b) { }
        // double add(int a, int b) { }
        System.out.printf("1 : %d\n", add(1, 2));
        System.out.printf("2 : %d\n", add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
