package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println(String.format("현재 숫자는 : %d", i));
            i++;
        } while (i < 3);
    }
}
