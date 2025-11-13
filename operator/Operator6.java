package operator;

public class Operator6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println(b);

        a = 1;
        b = 0;
        b = a++;
        System.out.println(b);
        System.out.println(a);
        
        // 전위 증감연산자 => 우선 증감을 먼저한 후 값을 전달
        // 후위 증감연산자 => 값을 전달한 후 본인의 값을 증감
    }
}
