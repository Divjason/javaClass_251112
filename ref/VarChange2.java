package ref;

public class VarChange2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.printf("%d, %d\n", a, b);

        a = 20;
        System.out.printf("변경 a = 20\n");
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);

        b = 30;
        System.out.printf("변경 b = 30\n");
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
    }
}
