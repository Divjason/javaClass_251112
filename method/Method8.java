package method;

public class Method8 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int에서 double로 자동 형변환
        // int < long < double
    }

    public static void printNumber(double n) {
        System.out.printf("숫자 : %f", n);
    }
}
