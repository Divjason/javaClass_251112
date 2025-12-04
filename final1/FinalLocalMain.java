package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;

        data1 = 7; // data1 변수 => 상수값 가능!
//        data1 = 10; // 재할당 불가!

        final int data2 = 10;
//        data2 = 20;

        method(10);
    }

    public static void method(final int parameter) {
//        parameter = 20;
    }
}
