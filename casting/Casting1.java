package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10; // 4바이트 = 32비트 = 4,294,967,296
        long longValue; // 8바이트 = 64비트
        double doubleValue; // 8바이트 = 64비트

        // 자동 형변환
        longValue = intValue;
        System.out.println(String.format("longValue = %d", longValue));
        
        doubleValue = intValue;
        System.out.println(String.format("doubleValue1 = %f", doubleValue));

        doubleValue = 20L;
        System.out.println(String.format("doubleValue2 = %f", doubleValue));
    }
}
