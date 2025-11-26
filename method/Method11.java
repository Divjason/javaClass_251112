package method;

public class Method11 {
    public static void main(String[] args) {
        System.out.printf("1 : %f\n", add(1, 2));
        System.out.printf("2 : %f\n", add(1.2, 1.5));
    }
    
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
