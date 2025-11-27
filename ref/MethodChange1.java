package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("메서드 호출 전 : a = %d\n", a);
        changePrimitive(a);
        System.out.printf("메서드 호출 후 : a = %d\n", a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
