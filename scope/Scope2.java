package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {
            temp = m * 2;
            System.out.println(String.format("temp = %d", temp));
        }
        System.out.println(String.format("m = %d", m));
    }
}
