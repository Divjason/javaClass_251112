package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
        long maxIntOver = 2147483648L; // java 정수 => int,
        int intValue = 0;

        // 0 ~ F -> 0
        // 0 ~ 7 -> 0
        // 0 , 1 -> 0

        intValue = (int) maxIntValue;
        System.out.printf("maxIntValue casting = %d%n", intValue);

        intValue = (int) maxIntOver;
        System.out.printf("maxIntOver casting = %d%n", intValue);
    }
}
