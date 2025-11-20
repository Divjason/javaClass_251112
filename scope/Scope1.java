package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;

        if(true) {
            int x = 20;
            System.out.println(String.format("if m = %d", m));
            System.out.println(String.format("if x = %d", x));
        }

        System.out.println(String.format("if m = %d", m));
//        System.out.println(String.format("if x = %d", x));
    }
}
