package operator;

public class Operator5 {
    public static void main(String[] args) {
        int a = 0;
        
        // 최초 선언된 변수 값을 재할당
        // a = a + 1;
        a += 1;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        ++a; // 반복문 > 증감식
        System.out.println(a);

        ++a;
        System.out.println(a);
    }
}
