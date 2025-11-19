package loop;

public class Nested1 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++) {
            System.out.println(String.format("외부 for 시작 i : %d", i));
            for(int j = 0; j < 3; j++) {
                System.out.println(String.format("내부 for 시작 j : %d", j));
            }
            System.out.println(String.format("외부 for 종료 i : %d", i));
            System.out.println();
        }
    }
}
